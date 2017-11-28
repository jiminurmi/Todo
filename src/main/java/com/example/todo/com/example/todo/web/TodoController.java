package com.example.todo.com.example.todo.web;

import com.example.todo.com.example.model.Todo;
import com.example.todo.com.example.model.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class TodoController {

    @RequestMapping(value="/")
    public String index(){
        return "index.html";
    }


/*
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
    @RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
    public String deleteList(@PathVariable("id") Long id, Model model){
        repository.delete(id);
        return "redirect:/todolist";
    }
*/
}
