package com.person.bootstater.database.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PreRemove;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE Professor SET deleted = true WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "deleted <> true")
public class Professor {
    @Id
    private int id;
    private String name;
    private long salary;
    @Temporal(TemporalType.DATE)
    private Date startDate;
	private Boolean deleted = false;

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}

	public void setDirects(Collection<Professor> directs) {
		this.directs = directs;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}

	@OneToOne(cascade = CascadeType.ALL)
    private Address address;
    
    @OneToMany(mappedBy="employee")
    private Collection<Phone> phones = new ArrayList<Phone>();
    
	@ManyToOne(cascade = CascadeType.ALL)
    private Department department;
    
    @ManyToOne
    private Professor manager;
    
    @OneToMany(mappedBy="manager")
    private Collection<Professor> directs = new ArrayList<Professor>();
    
    @ManyToMany(mappedBy="employees")
    private Collection<Project> projects = new ArrayList<Project>();

    public int getId() {
        return id;
    }
    
    public void setId(int empNo) {
        this.id = empNo;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Collection<Phone> getPhones() {
        return phones;
    }
    
    public void addPhone(Phone phone) {
        if (!getPhones().contains(phone)) {
            getPhones().add(phone);
            if (phone.getProfessor() != null) {
                phone.getProfessor().getPhones().remove(phone);
            }
            phone.setProfessor(this);
        }
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.getProfessors().remove(this);
        }
        this.department = department;
        this.department.getProfessors().add(this);
    }
    
    public Collection<Professor> getDirects() {
        return directs;
    }
    
    public void addDirect(Professor employee) {
        if (!getDirects().contains(employee)) {
            getDirects().add(employee);
            if (employee.getManager() != null) {
                employee.getManager().getDirects().remove(employee);
            }
            employee.setManager(this);
        }
    }
    
    public Professor getManager() {
        return manager;
    }
    
    public void setManager(Professor manager) {
        this.manager = manager;
    }

    public Collection<Project> getProjects() {
        return projects;
    }
    
    public void addProject(Project project) {
        if (!getProjects().contains(project)) {
            getProjects().add(project);
        }
        if (!project.getProfessors().contains(this)) {
            project.getProfessors().add(this);
        }
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address; 
    }
    
    public String toString() {
        return "Professor " + getId() + 
               ": name: " + getName() +
               ", salary: " + getSalary() +
               ", phones: " + getPhones() +
               ", managerNo: " + ((getManager() == null) ? null : getManager().getId()) +
               ", deptNo: " + ((getDepartment() == null) ? null : getDepartment().getId());
    }

	@PreRemove
	public void deleteProfessor() {
		this.deleted = true;
	}

}