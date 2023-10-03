package br.com.jvsobraz.desafiobackendtodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jvsobraz.desafiobackendtodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
