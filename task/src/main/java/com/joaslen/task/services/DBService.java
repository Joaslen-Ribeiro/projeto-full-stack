package com.joaslen.task.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaslen.task.domain.Todo;
import com.joaslen.task.repositories.TodoRepository;

@Service
public class DBService {
 
    @Autowired
    private TodoRepository todoRepository;

    public void InstanciaBaseDeDados() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy") ;

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot2 e Angular", sdf.parse("25/03/2022"), false);
        Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("22/03/2021 "), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("21/03/2022 "), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("27/12/2021"), false);
        Todo t5 = new Todo(null, "Inglês", "Aperfeiçoamento do inglês", sdf.parse("20/12/2021"), false);
        Todo t6 = new Todo(null, "Formação Generation", "Conclusão do curso de java Junior", sdf.parse("16/09/2021"), true);
        Todo t7 = new Todo(null, "Economia", "Aprender sobre economia e investimento", sdf.parse("01/06/2021"), false);
        Todo t8 = new Todo(null, "Viajar", "Viajar para descansar um pouco", sdf.parse("20/12/2020"), true);
        Todo t9 = new Todo(null, "Estudar logica", "Iniciar logica de programação 2hrs por dia", sdf.parse("01/06/2020"), true);
        
        
        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4,t5,t6,t7,t8,t9));

    }
  
}