package com.eci.cosw.lab3.service;

import com.eci.cosw.lab3.model.Todo;

import java.util.List;

public interface TodoService {

    public List<Todo> getTodoList();

    public Todo addTodo(Todo todo);

}
