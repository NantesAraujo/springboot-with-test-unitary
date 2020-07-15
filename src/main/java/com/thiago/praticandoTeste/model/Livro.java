package com.thiago.praticandoTeste.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Livro {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String titulo;

    @Column
    private LocalDate data_publicacao;

    @JoinColumn(name = "idAutor")
    @ManyToOne
    private Autor autor;
}
