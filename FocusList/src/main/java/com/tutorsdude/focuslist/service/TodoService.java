package com.tutorsdude.focuslist.service;

import java.util.List;
import java.util.Optional;

import com.tutorsdude.focuslist.dto.Todo;

public interface TodoService {
	
	public Todo createTodo(Todo todo);
	
	public List<Todo> getAllTodos();
	
	public Optional<Todo> getTodoById(Long id);
	
	public Todo updateTodo(Long id,Todo todoDetails);
	
	public void deleteTodo(Long id);

}
