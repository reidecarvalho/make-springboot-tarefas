package br.com.maketecnologia.springboot.tarefas.service;

import org.springframework.stereotype.Service;

@Service
public class MaiusculoService {

    public String converter(String texto) {
        return texto.toUpperCase();
    }
}
