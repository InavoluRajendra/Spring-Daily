package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepositry extends JpaRepository<Person, Long> {

}
