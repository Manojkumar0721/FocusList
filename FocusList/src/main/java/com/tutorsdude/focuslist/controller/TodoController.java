package com.tutorsdude.focuslist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorsdude.focuslist.dto.Todo;
import com.tutorsdude.focuslist.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@PostMapping
	public String createTodo(@RequestBody Todo todo) {
		if(todo!=null) {
			todoService.createTodo(todo);
			return "Task Added successfully..";
		}
		return "Task Not added try again";
	}
	
	@GetMapping
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<Todo> getTodoById(@PathVariable Long id){
		return todoService.getTodoById(id);
	}
	
	@PutMapping("/{id}")
	public Todo updateTodo(@PathVariable Long id,@RequestBody Todo todoDetails) {
		return todoService.updateTodo(id, todoDetails);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTodo(@PathVariable Long id) {
		if(id>0) {
			todoService.deleteTodo(id);
			return "Task Deleted successfully";
		}
		return "Task not deleted try again";
	}

}
