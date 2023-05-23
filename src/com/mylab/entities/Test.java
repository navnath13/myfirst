package com.mylab.entities;

public class Test {
	private Cbc cbc;
	private BloodGroup BloodGroup;


	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Test(Cbc cbc) {
		super();
		this.cbc = cbc;
	}



	public Cbc getCbc() {
		return cbc;
	}

	public void setCbc(Cbc cbc) {
		this.cbc = cbc;
	}

     

	public BloodGroup getBloodGroup() {
		return BloodGroup;
	}



	public void setBloodGroup(BloodGroup bloodGroup) {
		BloodGroup = bloodGroup;
	}



	@Override
	public String toString() {
		return "Test [cbc=" + cbc + ", BloodGroup=" + BloodGroup + "]";
	}
	
	
	
	
  
	
	
	

}
