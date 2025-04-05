package com.tutorsdude.focuslist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorsdude.focuslist.dto.Todo;
import com.tutorsdude.focuslist.repo.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoRepository todoRepo;

	@Override
	public Todo createTodo(Todo todo) {
		if(todo!=null) {
			return todoRepo.save(todo);
		}
		return null;
	}

	@Override
	public List<Todo> getAllTodos() {
		return todoRepo.findAll();
	}

	@Override
	public Optional<Todo> getTodoById(Long id) {
		if(id>0) {
			return todoRepo.findById(id);
		}
		return Optional.empty();
	}

	@Override
	public Todo updateTodo(Long id, Todo todoDetails) {
		Optional<Todo> optionalTodo =  todoRepo.findById(id);
		
		if(optionalTodo.isPresent()) {
		  Todo todo = optionalTodo.get();
		  todo.setTitle(todoDetails.getTitle());
		  todo.setCompleted(todoDetails.isCompleted());
		  return todoRepo.save(todo);
		}else {
			throw new RuntimeException("Todo with ID" +id +" not found");
		}
		
	}

	@Override
	public void deleteTodo(Long id) {
		todoRepo.deleteById(id);
	}

}
