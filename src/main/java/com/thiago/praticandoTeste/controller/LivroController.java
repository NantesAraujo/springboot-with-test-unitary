package com.thiago.praticandoTeste.controller;

import com.thiago.praticandoTeste.bo.interfaces.ILivro;
import com.thiago.praticandoTeste.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "livro")
public class LivroController {

    @Autowired
    private ILivro livro;

    @GetMapping
    public ResponseEntity<?> carregarLivros() {
        List<Livro> livros = livro.buscarLivros();

        return ResponseEntity.ok(livros);
    }
}
