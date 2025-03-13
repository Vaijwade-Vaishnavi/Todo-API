package com.example.TodoProject.services;

import com.example.TodoProject.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> list = new ArrayList<>();

    public Todo create(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getList() {
        return list;
    }
}
