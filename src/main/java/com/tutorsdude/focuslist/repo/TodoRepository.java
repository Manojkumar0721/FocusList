package com.tutorsdude.focuslist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorsdude.focuslist.dto.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
