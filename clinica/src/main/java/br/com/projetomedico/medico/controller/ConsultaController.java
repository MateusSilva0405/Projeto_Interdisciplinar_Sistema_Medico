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

import br.com.projetomedico.medico.dto.MedicoConsulta;
import br.com.projetomedico.medico.entity.Consulta;
import br.com.projetomedico.medico.entity.Medico;
import br.com.projetomedico.medico.entity.Paciente;
import br.com.projetomedico.medico.service.ConsultaServices;
import br.com.projetomedico.medico.service.MedicoServices;
import br.com.projetomedico.medico.service.PacienteServices;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaServices consultaServices;
    
    @Autowired
    private MedicoServices medicoServices;

    @Autowired 
    private PacienteServices pacienteServices;

    @GetMapping("/listar")
    public String Listar(Model model) {
        List<Consulta> consultas = consultaServices.findAll();
        model.addAttribute("consultas", consultas);
        return "consulta/listarConsulta";
    }

    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("consulta", new Consulta());
        List<Medico> medico = medicoServices.findAll();
        model.addAttribute("medicos", medicoServices.findAll());
        List<Paciente> paciente = pacienteServices.findAll();
        model.addAttribute("pacientes", pacienteServices.findAll());;
        return "consulta/formularioConsulta";
    }


    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Consulta consulta){
        consultaServices.save(consulta);
        return "redirect:/consultas/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable("id") Integer id, Model model){
        Consulta consulta = consultaServices.findById(id);
        model.addAttribute("consulta", consulta);
        List<Medico> medicos = medicoServices.findAll();
        model.addAttribute("medicos", medicos);
        List<Paciente> pacientes = pacienteServices.findAll();
        model.addAttribute("pacientes", pacientes);
        return "consulta/formularioConsulta";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
        Consulta consulta = consultaServices.findById(id);
        if (consulta != null) {
            consultaServices.deleteById(id);
        }
        return "redirect:/consultas/listar";
    }

    @GetMapping("listar-nome-medico")
    public String listarNomeMedico(Model model) {
        List<MedicoConsulta> consultas = consultaServices.buscarNomeMedico();
        model.addAttribute("consultas", consultas);
        return "consulta/listarConsulta";
    }
    
}
