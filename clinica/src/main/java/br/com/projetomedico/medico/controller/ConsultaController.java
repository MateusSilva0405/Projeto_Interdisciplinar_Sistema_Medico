package br.com.projetomedico.medico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetomedico.medico.entity.Consulta;
import br.com.projetomedico.medico.entity.Paciente;
import br.com.projetomedico.medico.service.ConsultaServices;
import br.com.projetomedico.medico.service.MedicoServices;
import br.com.projetomedico.medico.service.PacienteServices;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaServices service;

    @Autowired
    private MedicoServices medicoServices;

    @Autowired 
    private PacienteServices pacienteServices;

    @GetMapping("/listar")
    public String Listar(Model model) {
        List<Consulta> consultas = service.findAll();
        model.addAttribute("consultas", consultas);
        return "consulta/listarConsulta";
    }

    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("consulta", new Consulta());
        model.addAttribute("medico", medicoServices.findAll());
        model.addAttribute("paciente", pacienteServices.findAll());
        return "consulta/formularioConsulta";
    }


    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Consulta consulta){
        service.save(consulta);
        return "redirect:/consulta/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model){
        Consulta consulta = service.findById(id);
        model.addAttribute("consulta", consulta);
        return "consulta/formularioConsulta";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id){
        service.deleteById(id);
        return "redirect:/consultas/listar";
    }
}
