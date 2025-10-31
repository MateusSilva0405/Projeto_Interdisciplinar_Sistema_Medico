package br.com.projetomedico.medico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetomedico.medico.entity.Paciente;
import br.com.projetomedico.medico.repository.PacienteRepository;

@Service
public class PacienteServices {
    
    @Autowired
    private PacienteRepository repository;

    public Paciente save(Paciente paciente){
        return repository.save(paciente);
    }

    public List<Paciente> findAll(){
        return repository.findAll();
    }

    public Paciente findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }

}

