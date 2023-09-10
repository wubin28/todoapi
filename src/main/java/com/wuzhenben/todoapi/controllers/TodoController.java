package com.wuzhenben.todoapi.controllers;

import com.wuzhenben.todoapi.entities.Todo;
import com.wuzhenben.todoapi.entities.TodoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return this.todoRepository.save(todo);
    }
}
