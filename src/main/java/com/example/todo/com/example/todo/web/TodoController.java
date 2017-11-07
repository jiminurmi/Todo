package com.example.todo.com.example.todo.web;

import com.example.todo.com.example.model.Todo;
import com.example.todo.com.example.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@ResponseBody
@Controller
public class TodoController {
    @Autowired
    private TodoRepository repository;

    @RequestMapping("/add")
    public String add(Model model){
        Todo todo = new Todo("muista koodata");
      // model.addAttribute("todo", todo);
       repository.save(todo);
       return "addtodo";
    }
    @RequestMapping("/todolist")
    public @ResponseBody List<Todo> todoList(Model model) {
        model.addAttribute("todos", repository.findAll());
        return (List<Todo>) repository.findAll();
    }


}
