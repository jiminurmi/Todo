package com.example.todo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
