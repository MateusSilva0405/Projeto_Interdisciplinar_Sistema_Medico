package br.com.projetomedico.medico.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
=======

>>>>>>> c2c911091e63aff70f086208555eb24ebf54f21a
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idConsulta;

    @Column(nullable = false, length = 40)
    private String obsConsulta;

    private LocalDateTime dataehoraConsulta;

    @Column(nullable = false, length = 40)
    private String especialidadeMedico;

    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idConsulta")
    private Consulta consulta;
<<<<<<< HEAD
} 
=======
}
>>>>>>> c2c911091e63aff70f086208555eb24ebf54f21a
