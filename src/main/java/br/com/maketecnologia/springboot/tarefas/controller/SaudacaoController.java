package br.com.maketecnologia.springboot.tarefas.controller;

import br.com.maketecnologia.springboot.tarefas.service.MaiusculoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saudacao")
public class SaudacaoController {

    private final MaiusculoService maiusculoService;

    public SaudacaoController(MaiusculoService maiusculoService) {
        this.maiusculoService = maiusculoService;
    }

    @GetMapping("/com-path-variable/{nome}")
    public String olaComPathVariable(@PathVariable String nome) {
        return "Olá, " + maiusculoService.converter(nome);
    }

    @GetMapping("/com-request-param")
    public String olaComRequestParam(
            @RequestParam(required = false, defaultValue = "sem nome") String nome) {
        return "Olá, " + maiusculoService.converter(nome);
    }
}
