package br.com.projetomedico.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetomedico.medico.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    
}
