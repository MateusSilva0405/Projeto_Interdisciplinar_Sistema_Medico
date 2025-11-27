package br.com.projetomedico.medico.dto;

public class MedicoConsulta {
    
    private String nomeMedico;
    private String especialidadeMedico;
    private String obsConsulta;

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public String getObsConsulta() {
        return obsConsulta;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

    public void setObsConsulta(String obsConsulta) {
        this.obsConsulta = obsConsulta;
    }
    

}
