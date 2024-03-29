package com.cursoapirest.modulos.pessoa_fisica.rest;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.servicos.PessoaFisicaServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoafisica")
public class PessoaFisicaRest implements PessoaFisicaApi{

    @Autowired
    PessoaFisicaServicos pessoaFisicaServicos;

    @GetMapping
    public ResponseEntity<List<PessoaFisica>> ListarPessoas() {
        List<PessoaFisica> list = pessoaFisicaServicos.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<PessoaFisica> BuscarPorId(@PathVariable Long id){
        PessoaFisica pessoaFisica = pessoaFisicaServicos.buscarPorId(id);
        return ResponseEntity.ok().body(pessoaFisica);
    }

    @PostMapping
    public ResponseEntity<PessoaFisica> Adicionar(@RequestBody PessoaFisica pessoaFisica){
        pessoaFisica = pessoaFisicaServicos.inserir(pessoaFisica);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(pessoaFisica.getId()).toUri();
        return ResponseEntity.created(uri).body(pessoaFisica);
    }

}
