package com.joaslen.task.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaslen.task.domain.Todo;
import com.joaslen.task.repository.TodoRepository;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void InstanciaBaseDeDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot2 e Angular", LocalDateTime.parse("25/03/2022 10:40", formatter), false);
        Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", LocalDateTime.parse("22/03/2021 13:00", formatter), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", LocalDateTime.parse("21/03/2022 10:15", formatter), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", LocalDateTime.parse("27/12/2021 05:40", formatter), false);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

    }

}