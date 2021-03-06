package com.thiago.praticandoTeste.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@Builder
public class Autor {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nome;

    @Column
    private int idade;

//    @OneToMany
//    private Livro livro;
}
