package br.com.projetomedico.medico.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPaciente;

    @Column(nullable = false, length = 40)
    private String nomePaciente;

    private Integer telPaciente;

    @Column(nullable = false, length = 40)
    private String enderecoPaciente;

    private Integer cep;
}
