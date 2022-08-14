package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 
@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner{
	
	@Autowired
	PersonRepositry personRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inserting person records");
		Person p1=new Person("mouse", 30);
		Person p2=new Person("duck", 20);
		personRepo.save(p1);
		personRepo.save(p2);
		
		 List<Person> personList = personRepo.findAll();
	        personList.forEach(person->System.out.println(person.toString()));
		
		
		
		
	}

}
