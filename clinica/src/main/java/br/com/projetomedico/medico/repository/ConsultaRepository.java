package br.com.projetomedico.medico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetomedico.medico.dto.MedicoConsulta;
import br.com.projetomedico.medico.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{
    
    @Query("SELECT new br.com.projetomedico.medico.dto.MedicoConsulta(c.obsConsulta, m.nomeMedico, m.especialidadeMedico) FROM Consulta c, Medico m")
    List<MedicoConsulta>
    buscarNomeMedico();

}
