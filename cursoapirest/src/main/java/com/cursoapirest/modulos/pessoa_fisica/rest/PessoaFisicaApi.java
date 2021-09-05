package com.cursoapirest.modulos.pessoa_fisica.rest;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PessoaFisicaApi {

    ResponseEntity<List<PessoaFisica>> ListarPessoas();

    ResponseEntity<PessoaFisica> BuscarPorId(Long id);

    ResponseEntity<PessoaFisica> Adicionar(@RequestBody PessoaFisica pessoaFisica);
}
