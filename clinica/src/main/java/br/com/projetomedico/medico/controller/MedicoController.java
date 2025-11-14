package br.com.projetomedico.medico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import br.com.projetomedico.medico.entity.Medico;
import br.com.projetomedico.medico.service.MedicoServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/medicos")
public class MedicoController {
    
    @Autowired
    private MedicoServices service;

    @GetMapping("/listar")
    public String Listar(Model model) {
        List<Medico> medicos = service.findAll();
        model.addAttribute("medicos", medicos);
        return "medico/listarMedico";
    }

    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("medico", new Medico());
        return "medico/formularioMedico";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Medico medico){
        service.save(medico);
        return "redirect:/medicos/listar";
    }

    @GetMapping("/editar/id")
    public String editarForm(@PathVariable Integer id, Model model){
        Medico medico = service.findById(id);
        model.addAttribute("medico", medico);

        return "medico/formularioMedico";
    }

    @GetMapping("/excluir/id")
    public String excluir(@PathVariable Integer id){
        service.deleteById(id);
        return "redirect:/medicos/listar";
    }
}
