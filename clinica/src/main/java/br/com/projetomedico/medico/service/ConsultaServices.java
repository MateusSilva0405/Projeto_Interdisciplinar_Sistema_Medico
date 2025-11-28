package br.com.projetomedico.medico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetomedico.medico.dto.MedicoConsulta;
import br.com.projetomedico.medico.entity.Consulta;
import br.com.projetomedico.medico.repository.ConsultaRepository;

@Service
public class ConsultaServices {
    
    @Autowired
    private ConsultaRepository repository;

    public Consulta save(Consulta consulta){
        return repository.save(consulta);
    }

    public List<Consulta> findAll(){
        return repository.findAll();
    }

    public Consulta findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }

    public List<MedicoConsulta> buscarNomeMedico(){
        return repository.buscarNomeMedico();
    }
}
