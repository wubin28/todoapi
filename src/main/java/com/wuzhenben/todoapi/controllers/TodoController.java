package com.wuzhenben.todoapi.controllers;

import com.wuzhenben.todoapi.entities.Todo;
import com.wuzhenben.todoapi.entities.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return this.todoRepository.findAll();
    }

    @GetMapping("/{todoId}")
    public Optional<Todo> getTodoById(@PathVariable("todoId") Long todoId) {
        return this.todoRepository.findById(todoId);
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return this.todoRepository.save(todo);
    }
}
