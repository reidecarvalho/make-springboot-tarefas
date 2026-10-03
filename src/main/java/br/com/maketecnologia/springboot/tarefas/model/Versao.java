package br.com.maketecnologia.springboot.tarefas.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record Versao (
    String numero,
    int build,
    LocalDate dataPublicacao,
    String ativo
) {
    public String info() {
        return numero + " " + build + " " + dataPublicacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
