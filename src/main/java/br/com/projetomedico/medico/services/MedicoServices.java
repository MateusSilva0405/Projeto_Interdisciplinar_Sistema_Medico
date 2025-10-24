package br.com.projetomedico.medico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetomedico.medico.entity.Medico;
import br.com.projetomedico.medico.repository.MedicoRepository;

@Service
public class MedicoServices {
    
    @Autowired
    private MedicoRepository repository;

    public Medico save(Medico medico){
        return repository.save(medico);
    }

    public List<Medico> findAll(){
        return repository.findAll();
    }

    public Medico findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }
}
