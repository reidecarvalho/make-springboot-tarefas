package br.com.maketecnologia.springboot.tarefas.service;

import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import br.com.maketecnologia.springboot.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa consultar(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}
