package com.person.bootstater.database.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Department implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5523239272053762795L;
	@Id
    private int id;
    private String name;
    
    @JsonBackReference
    @OneToMany(mappedBy="department")
    private Set<Professor> employees = new HashSet<Professor>();

    public int getId() {
        return id;
    }
    
    public void setId(int deptNo) {
        this.id = deptNo;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String deptName) {
        this.name = deptName;
    }
    
    public Set<Professor> getProfessors() {
        return employees;
    }

    public String toString() {
        return "Department no: " + getId() + 
               ", name: " + getName();
    }
}