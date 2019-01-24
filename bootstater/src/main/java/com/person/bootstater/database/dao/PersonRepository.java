package com.person.bootstater.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.bootstater.database.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	List<Person> findByIsRecordActive(String isRecordActive);
}
