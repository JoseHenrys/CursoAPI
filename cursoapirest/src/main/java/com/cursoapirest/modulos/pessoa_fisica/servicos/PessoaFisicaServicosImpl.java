package com.cursoapirest.modulos.pessoa_fisica.servicos;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaFisicaServicosImpl implements PessoaFisicaServicos {

    @Autowired
    PessoaFisicaRepositorio pessoaFisicaRepositorio;

    @Override
    public List<PessoaFisica> buscarTodos(){
        return PessoaFisicaRepositorio.findAll();
    }
}
