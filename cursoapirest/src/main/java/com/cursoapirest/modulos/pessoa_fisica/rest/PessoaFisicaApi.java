package com.cursoapirest.modulos.pessoa_fisica.rest;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PessoaFisicaApi {

    ResponseEntity<List<PessoaFisica>> ListarPessoas();
}
