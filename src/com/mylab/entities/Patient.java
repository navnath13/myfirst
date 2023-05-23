package com.mylab.entities;

import java.util.List;

public class Patient {
	private int id;
	private String pType;
	private String name;
	private String age;
	private String gender;
	private String doctor;
	private String mobile;
	private String email;
	static String labname="Gaikwad Lab";
	private List test;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String pType, String name, String age, String gender, String doctor, String mobile,
			String email, List<Test> test) {
		super();
		this.id = id;
		this.pType = pType;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.doctor = doctor;
		this.mobile = mobile;
		this.email = email;
		this.test = test;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Test> getTest() {
		return test;
	}

	public void setTest(List<Test> test) {
		this.test = test;
	}
	
	
	
	
	
	

	
	
   @Override
	public String toString() {
		return "Patient [id=" + id + ", pType=" + pType + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", doctor=" + doctor + ", mobile=" + mobile + ", email=" + email + ", test=" + test + "]";
	}

public void display() {
	   System.out.println("Lab Name:      " +labname);
	   System.out.println("________________________________________________________________");
	   System.out.println("id :                                  "+ id);
	   System.out.println("Patinet type                          "+pType);
	   System.out.println("Patient Name                          "+name);
	   System.out.println("Age                                   "+age);
	   System.out.println("Gender                                "+gender);
	   System.out.println("Doctor                                "+doctor);
	   System.out.println("Mobile                                "+mobile);
	   System.out.println("Email                                 "+email);
   }
	
}
