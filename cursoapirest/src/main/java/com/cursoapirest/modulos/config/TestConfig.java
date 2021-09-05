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
        PessoaFisica pessoaFisica1 = new PessoaFisica(null, "Ana Clara Cardoso","anaclara@gmail.com","458.137.410-38");
        PessoaFisica pessoaFisica2 = new PessoaFisica(null, "Pietro da Silva","pietrosilva@gmail.com","143.052.470-70");

        pessoaFisicaRepositorio.saveAll(Arrays.asList(pessoaFisica1, pessoaFisica2));
    }


}
