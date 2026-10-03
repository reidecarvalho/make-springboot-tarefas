package br.com.maketecnologia.springboot.tarefas.controller;

import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import br.com.maketecnologia.springboot.tarefas.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private TarefaService tarefaService;

    TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping("/{id}")
    public Tarefa consultar(@PathVariable Long id) {
        return tarefaService.consultar(id);
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@RequestBody Tarefa tarefa) {
        var novaTarefa = tarefaService.criar(tarefa);
        return ResponseEntity.created(URI.create("/tarefa/" + tarefa.getId())).body(novaTarefa);
    }
}
