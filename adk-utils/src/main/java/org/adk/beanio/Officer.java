package org.adk.beanio;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Record(minOccurs=1)
public class Officer {
	
	@Field(at = 1, length = 15, padding='_', align=Align.RIGHT)
	private String name;
	@Field(at = 16, length = 10, padding='0', align=Align.RIGHT)
	private String associateId; //leading zeros
	@Field(at = 26, length = 4, padding='0')
	private Integer age;//leading zeros
	@Field(at = 30, length = 8, padding='0')
	private Integer pincode;//default zeros
	
	public Officer(String name, String associateId, Integer age, Integer pincode) {
		super();
		this.name = name;
		this.associateId = associateId;
		this.age = age;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
