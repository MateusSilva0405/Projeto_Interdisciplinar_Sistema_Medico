package br.com.projetomedico.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetomedico.medico.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{
    
}
