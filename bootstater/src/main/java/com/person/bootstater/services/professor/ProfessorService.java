package com.person.bootstater.services.professor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.bootstater.database.dao.ProfessorRepository;
import com.person.bootstater.services.professor.model.Professor;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRespository;
	
	public List<Professor> getAllProfessors(){
		
		List<Professor> profs = new ArrayList<>();
		
		List entities = professorRespository.findAll();
		
		if(entities != null) {
		Iterator enItr = 	entities.iterator();
		while (enItr.hasNext()) {
			com.person.bootstater.database.entity.Professor en = (com.person.bootstater.database.entity.Professor) enItr.next();
			
			Professor pro = new Professor();
			pro.setName(en.getName());
			pro.setSalary(en.getSalary());
		
			profs.add(pro);
		}
		
		}
		return profs;
	}
	
}