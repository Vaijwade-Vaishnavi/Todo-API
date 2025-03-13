package com.example.TodoProject.controlles;


import com.example.TodoProject.model.Todo;
import com.example.TodoProject.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoss")
public class TodoController {

    @Autowired
    private TodoService todoService;

    //create todo

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){


        //create todo

        return todoService.create(todo);

    }

    //get all todo
    @GetMapping
     public List<Todo> getAll(){

        return todoService.getList();

     }


}
