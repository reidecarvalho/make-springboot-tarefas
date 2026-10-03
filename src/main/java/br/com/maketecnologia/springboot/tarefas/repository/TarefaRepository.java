package br.com.maketecnologia.springboot.tarefas.repository;

import br.com.maketecnologia.springboot.tarefas.model.Status;
import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TarefaRepository {

    private final List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public Tarefa findById(Long id) {
        return tarefas.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public Tarefa save(Tarefa tarefa) {
        Long novoId = tarefas.size() + 1L;
        tarefa.setId(novoId);
        tarefas.add(tarefa);
        return tarefa;
    }
}
