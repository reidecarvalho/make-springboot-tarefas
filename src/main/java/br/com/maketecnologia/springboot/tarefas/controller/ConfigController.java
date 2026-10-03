package br.com.maketecnologia.springboot.tarefas.controller;

import br.com.maketecnologia.springboot.tarefas.model.App;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ObjectInputFilter;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private final App app;

    public ConfigController(App app) {
        this.app = app;
    }

    @GetMapping
    public String info() {
        return app.info();
    }


}
