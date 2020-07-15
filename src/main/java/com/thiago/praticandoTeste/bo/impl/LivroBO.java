package com.thiago.praticandoTeste.bo.impl;

import com.thiago.praticandoTeste.bo.interfaces.ILivro;
import com.thiago.praticandoTeste.model.Livro;
import com.thiago.praticandoTeste.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroBO implements ILivro {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public List<Livro> buscarLivros() {
        return livroRepository.findAll();
    }
}
