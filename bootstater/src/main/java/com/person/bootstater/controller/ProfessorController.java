package com.person.bootstater.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.bootstater.database.dao.ProfessorRepository;
import com.person.bootstater.database.entity.Address;
import com.person.bootstater.database.entity.Professor;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
	private Integer index = 0;
	private Integer departmentIndex = 0;
	private Integer addrIndex = 0;
	@Autowired
	private ProfessorRepository professorRespository;
	

	@GetMapping("/all")
	public List<Professor> findProfessors() {
		loadDefaultsProfessors();
		List<Professor> professors = professorRespository.findAll();
		return professors;
	}

	private void loadDefaultsProfessors() {
		Professor professor = new Professor();
		professor.setId(++index);
		professor.setName("chenpi");
		professor.setSalary(5000L);
		professor.setStartDate(new Date());
		// Department depart = new Department();
		// depart.setId(++departmentIndex);
		// depart.setName("DTT");
		// professor.setDepartment(depart);
		Address addrr = new Address();
		addrr.setId(++addrIndex);
		addrr.setCity("pui");
		professor.setAddress(addrr);
		professorRespository.save(professor);
	}

	@GetMapping("/del")
	public Boolean deleteProfessor() {
		List<Professor> professors = professorRespository.findAll();
		Professor entity = professors.get(0);
		professorRespository.delete(entity);
		return true;
	}

}