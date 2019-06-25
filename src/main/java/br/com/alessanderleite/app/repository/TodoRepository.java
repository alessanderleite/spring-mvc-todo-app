package br.com.alessanderleite.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessanderleite.app.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	List<Todo> findByUserName(String user);
}
