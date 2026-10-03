package br.com.maketecnologia.springboot.tarefas.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public record App(
        String nomeExibicao,
        Versao versao) {

    public String info() {

        return nomeExibicao + " " + versao.info();
    }
}
