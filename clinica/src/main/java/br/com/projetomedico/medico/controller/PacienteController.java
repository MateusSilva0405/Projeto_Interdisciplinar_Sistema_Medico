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

import br.com.projetomedico.medico.entity.Paciente;
import br.com.projetomedico.medico.service.PacienteServices;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    
    @Autowired
    private PacienteServices service;

    @GetMapping("/listar")
    public String Listar(Model model) {
        List<Paciente> pacientes = service.findAll();
        model.addAttribute("pacientes", pacientes);
        return "paciente/listarPaciente";
    }

    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("paciente", new Paciente());
        return "paciente/formularioPaciente";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Paciente paciente){
        service.save(paciente);
        return "redirect:/pacientes/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable("id") Integer id, Model model){
        Paciente paciente = service.findById(id);
        model.addAttribute("paciente", paciente);
        return "paciente/formularioPaciente";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
        service.deleteById(id);
        return "redirect:/pacientes/listar";
    }
}
