package com.sandy.motionlog.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Data // Anotação do Lombok para gerar Getters, Setters, toString, etc.
@Entity // Anotação do JPA para indicar que esta classe é uma entidade do banco de dados
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // O email deve ser único
    private String email;

    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    private Date dataRegistro;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<RegistroAtividade> registros;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Meta> metas;

    public enum TipoUsuario {
        ADMINISTRADOR,
        COMUM
    }
}