package com.sandy.motionlog.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private TipoMeta tipoMeta;

    private double valorAlvo;

    @Enumerated(EnumType.STRING)
    private Periodicidade periodicidade;

    private Date dataInicio;
    private boolean ativa;

    public enum TipoMeta {
        PASSOS,
        DISTANCIA,
        TEMPO
    }

    public enum Periodicidade {
        DIARIA,
        SEMANAL
    }
}