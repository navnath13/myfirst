package com.mylab;

import java.util.ArrayList;
import java.util.List;

import com.mylab.entities.BloodGroup;
import com.mylab.entities.Cbc;
import com.mylab.entities.Patient;
import com.mylab.entities.Test;

public class Main {
	
	public static void main(String[] args) {
	 Patient p1=new Patient();
	 p1.setId(291);
	 p1.setpType("opd");
	 p1.setAge("37");
	 p1.setName("Navnath Doke");
	 p1.setGender("Male");
	 p1.setDoctor("Dr.Rahul gaikwad");
	 p1.setMobile("860061273");
	 p1.setEmail("navnathdoke1111@gmail.com");
	
	 
	 BloodGroup bg=new BloodGroup(p1.getId(),"Ab Positive");
	
	 
	 Test t1=new Test();
	 t1.setBloodGroup(bg);
	 
     List li=new ArrayList();
     li.add(t1);
     p1.setTest(li);
     
     
     
    System.out.println(p1.getTest());
     
     
    
	 
	 
	 
	 

	
  System.out.println(p1);
     
     
     

	
	/*
	 * // this is display complete blood count report System.out.println(
	 * "________________________________________________________________");
	 * 
	 * p1.display(); System.out.println(
	 * "________________________________________________________________");
	 * cbc.display(); System.out.println(
	 * "________________________________________________________________"); // this
	 * is the display blood group report p1.display(); System.out.println(
	 * "________________________________________________________________");
	 * bg.display(); System.out.println(
	 * "________________________________________________________________");
	 * 
	 * 
	 * 
	 */
	}

}
