package br.com.projetomedico.medico.dto;

import br.com.projetomedico.medico.entity.Consulta;
import br.com.projetomedico.medico.entity.Medico;

public class MedicoConsulta {
    
    private Integer idConsulta;
    private Integer idMedico;
    private String nomeMedico;
    private String especialidadeMedico;
    private String obsConsulta;

    public MedicoConsulta() {       
    }

    public MedicoConsulta(Integer idConsulta, Integer idMedico, String nomeMedico, String especialidadeMedico, String obsConsulta) {
        this.idConsulta = idConsulta;
        this.idMedico = idMedico;
        this.nomeMedico = nomeMedico;
        this.especialidadeMedico = especialidadeMedico;
        this.obsConsulta = obsConsulta;
    }

    public Integer getIdConsulta() { return idConsulta; }
    public void setIdConsulta(Integer idConsulta) { this.idConsulta = idConsulta; }

    public Integer getIdMedico() { return idMedico; }
    public void setIdMedico(Integer idMedico) { this.idMedico = idMedico; }

    public String getNomeMedico() { return nomeMedico; }
    public void setNomeMedico(String nomeMedico) { this.nomeMedico = nomeMedico; }

    public String getEspecialidadeMedico() { return especialidadeMedico; }
    public void setEspecialidadeMedico(String especialidadeMedico) { this.especialidadeMedico = especialidadeMedico; }

    public String getObsConsulta() { return obsConsulta; }
    public void setObsConsulta(String obsConsulta) { this.obsConsulta = obsConsulta; }

}
