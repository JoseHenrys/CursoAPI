package com.cursoapirest.modulos.pessoa_fisica.servicos;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;

import java.util.List;

public interface PessoaFisicaServicos {

    List<PessoaFisica> buscarTodos();

    PessoaFisica buscarPorId(Long id);

    PessoaFisica inserir(PessoaFisica pessoaFisica);
}