package com.cursoapirest.modulos.pessoa_fisica.servicos;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaServicosImpl implements PessoaFisicaServicos {

    @Autowired
    PessoaFisicaRepositorio pessoaFisicaRepositorio;

    @Override
    public List<PessoaFisica> buscarTodos(){
        return pessoaFisicaRepositorio.findAll();
    }

    @Override
    public PessoaFisica buscarPorId(Long id){
        Optional<PessoaFisica> obj = pessoaFisicaRepositorio.findById(id);
        return obj.orElseThrow(() -> new EntityNotFoundException("Id not found" + id));

    }

    @Override
    public PessoaFisica inserir(PessoaFisica pessoaFisica){
        return pessoaFisicaRepositorio.save(pessoaFisica);

    }
}