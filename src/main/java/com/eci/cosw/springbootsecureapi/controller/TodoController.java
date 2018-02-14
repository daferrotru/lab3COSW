package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "api" )
public class TodoController {

    @Autowired
    public TodoService todoService;

    @CrossOrigin
    @RequestMapping( value = "/todo", method = RequestMethod.GET )
    public List<Todo> getTodos() {
        return todoService.getTodoList();
    }

    @CrossOrigin
    @RequestMapping( value = "/todo", method = RequestMethod.POST )
    public Todo addTodo(@RequestBody Todo todo ) {
        return todoService.addTodo(todo);
    }
}
