package com.person.bootstater.database.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreRemove;

import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql = "UPDATE Address SET deleted = true WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "deleted <> true")
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;
    
	private Boolean deleted = false;

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String address) {
        this.street = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    public String toString() {
        return "Address id: " + getId() + 
               ", street: " + getStreet() +
               ", city: " + getCity() +
               ", state: " + getState() +
               ", zip: " + getZip();
    }

	@PreRemove
	public void deleteAddress() {
		this.deleted = true;
	}

}