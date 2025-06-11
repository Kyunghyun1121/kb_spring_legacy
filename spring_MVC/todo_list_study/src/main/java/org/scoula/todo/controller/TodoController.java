package org.scoula.todo.controller;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.scoula.todo.domain.TodoDTO;
import org.scoula.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {

  private final TodoService todoService;

  @PostMapping("/insert")
  public String insertTodo(TodoDTO todo){
    todoService.insertTodo(todo);

    return "redirect:/";
  }

  @PostMapping("/update")
  public String updateTodo(Long id){
    todoService.updateTodo(id);

    return "redirect:/";
  }

  @PostMapping("/delete")
  public String deleteTodo(Long id){
    todoService.deleteTodo(id);
    return "redirect:/";
  }


}
