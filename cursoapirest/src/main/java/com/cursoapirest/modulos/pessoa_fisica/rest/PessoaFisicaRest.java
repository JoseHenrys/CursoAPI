package com.cursoapirest.modulos.pessoa_fisica.rest;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.servicos.PessoaFisicaServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoafisica")
public class PessoaFisicaRest implements PessoaFisicaApi {

    @Autowired
    PessoaFisicaServicos pessoaFisicaServicos;

    @GetMapping
    public ResponseEntity<List<PessoaFisica>> ListarPessoas() {
        List<PessoaFisica> list = PessoaFisicaServicos.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

}
