package com.person.bootstater.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.bootstater.database.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
