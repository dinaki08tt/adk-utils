package com.person.bootstater.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.bootstater.database.dao.PersonRepository;
import com.person.bootstater.database.dao.PersonRepositoryCustom;
import com.person.bootstater.database.entity.Person;

@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonRepository personRespository;
	
	@Autowired
	private PersonRepositoryCustom personRepoCustom;

	@GetMapping("/persons")
	public List<Person> findPersons() {
		Person p = new Person();
		p.setDob(LocalDateTime.now());
		p.setName("cc");
		p.setLastName("pp");
//		personRespository.save(p);
		List<Person> persons = personRespository.findAll();
//		List<Person> persons = personRepoCustom.findAllPersons();
		
		return persons;
	}
	
	@GetMapping("/persons/{name}")
	public List<Person> findPersonByName(@PathVariable String name) {
		List<Person> persons = personRepoCustom.findPersonByName(name);
		return persons;
	}
	
	@GetMapping("/persons/today/{dob}")
	public List<Person> findPersonByToday(@PathVariable String dob) {
		List<Person> persons = personRepoCustom.findPersonByDOB(dob);
		return persons;
	}
	
	@GetMapping("/persons/del/{name}")
	public Boolean deletePersonName(@PathVariable String name) {
		List<Person> persons = personRepoCustom.findPersonByName(name);
		persons.stream().forEach(p->{
			personRespository.delete(p);
		});
		return true;
	}
	
}