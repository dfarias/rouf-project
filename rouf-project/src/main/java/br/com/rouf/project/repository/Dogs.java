package br.com.rouf.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rouf.project.model.Dog;

public interface Dogs extends JpaRepository<Dog, Integer> {

}
