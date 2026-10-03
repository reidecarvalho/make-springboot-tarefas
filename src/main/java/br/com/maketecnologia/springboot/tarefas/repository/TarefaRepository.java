package br.com.maketecnologia.springboot.tarefas.repository;

import br.com.maketecnologia.springboot.tarefas.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TarefaRepository {
    private final List<Tarefa> tarefas = new ArrayList<>();

    public Tarefa findById(Long id) {
        return tarefas.stream().filter(tarefa -> tarefa.getId().equals(id)).findFirst().orElse(null);
    }

    public Tarefa save(Tarefa tarefa) {
        tarefa.setId(tarefas.size() + 1L);
        tarefas.add(tarefa);
        return tarefa;
    }
}
