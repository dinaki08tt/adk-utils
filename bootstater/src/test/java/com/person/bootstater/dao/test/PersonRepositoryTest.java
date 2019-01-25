package com.person.bootstater.dao.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.person.bootstater.database.dao.PersonRepository;
import com.person.bootstater.database.dao.ProfessorRepository;
import com.person.bootstater.database.entity.Professor;


@DataJpaTest 
@RunWith(SpringRunner.class)
public class PersonRepositoryTest {
		
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@Test
	public void testDAOMethod() {
		Professor pfr = new Professor();
		pfr.setId(1);
		pfr.setName("enka");
		pfr.setSalary(20L);
		
		professorRepository.save(pfr);
		List<Professor> ps = professorRepository.findAll();
		assertEquals(1, ps.size());
		
		Optional<Professor> p = professorRepository.findById(1);
		
		if(p.isPresent()) {
			Professor ptemp = p.get();
			ptemp.setName("fnka");
			professorRepository.save(ptemp);
		}
		Optional<Professor> cp = professorRepository.findById(1);
		if(cp.isPresent()) {
			Professor cpTemp = cp.get();
			assertEquals("fnka", cpTemp.getName());
		}

	}
	
}