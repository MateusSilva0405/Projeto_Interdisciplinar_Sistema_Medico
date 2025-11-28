package br.com.projetomedico.medico.dto;

import br.com.projetomedico.medico.entity.Consulta;
import br.com.projetomedico.medico.entity.Medico;

public class MedicoConsulta {
    
    private String nomeMedico;
    private String especialidadeMedico;
    private String obsConsulta;

    public MedicoConsulta() {       
    }

    public MedicoConsulta(String nomeMedico, String especialidadeMedico, String obsConsulta) {
        this.nomeMedico = nomeMedico;
        this.especialidadeMedico = especialidadeMedico;
        this.obsConsulta = obsConsulta;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public String getObsConsulta() {
        return obsConsulta;
    }
    
  

}
