package br.com.projetomedico.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetomedico.medico.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer>{
    
}
