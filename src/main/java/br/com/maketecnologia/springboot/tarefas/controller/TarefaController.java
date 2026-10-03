package br.com.maketecnologia.springboot.tarefas.controller;

import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import br.com.maketecnologia.springboot.tarefas.service.TarefaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping("/{id}")
    public Tarefa consultar(@PathVariable Long id) {
        return tarefaService.consultar(id);
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }
}
