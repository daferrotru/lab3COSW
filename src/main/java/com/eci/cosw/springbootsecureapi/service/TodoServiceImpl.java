package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    public List<Todo> todoList = new ArrayList<Todo>();

    @Override
    public List<Todo> getTodoList(){
        return todoList;
    }

    @Override
    public Todo addTodo(Todo todo){
        todoList.add(todo);
        return todo;
    }

}
