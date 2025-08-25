package com.sandy.motionlog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class RegistroAtividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonBackReference
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "atividade_fisica_id", nullable = false)
    private AtividadeFisica atividadeFisica;

    private Date data;
    private int duracaoMinutos;
    private double distanciaKm;
}