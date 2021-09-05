package com.cursoapirest.modulos.config;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PessoaFisicaRepositorio pessoaFisicaRepositorio;

    @Override
    public void run(String... args) throws Exception {
        PessoaFisica pessoaFisica1 = new PessoaFisica(id; null, nome: "Maria da Silva", email: "mariadasilva@gmail.com", cpf: "116.253.900-33");
        PessoaFisica pessoaFisica2 = new PessoaFisica(id: null, nome: "João da Silva", email: "joaodasilva@gmail.com",cpf:"576.825.520-69");

        pessoaFisicaRepositorio.saveAll(Arrays.asList(pessoaFisica1, pessoaFisica2));
    }


}
