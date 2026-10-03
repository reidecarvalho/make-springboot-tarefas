package br.com.maketecnologia.springboot.tarefas.service;

import br.com.maketecnologia.springboot.tarefas.model.Status;
import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import br.com.maketecnologia.springboot.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa consultar(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa criar(Tarefa tarefa) {
        tarefa.setStatus(Status.ABERTA);
        tarefa.setDataCriacao(LocalDateTime.now());
        tarefa.setDataAtualizacao(null);
        return tarefaRepository.save(tarefa);
    }
}
