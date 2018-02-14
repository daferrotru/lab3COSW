package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;

import java.util.List;

public interface TodoService {

    public List<Todo> getTodoList();

    public Todo addTodo(Todo todo);

}
