package com.mylab.entities;

public class BloodGroup {
	private int id;
	private String bloodgroup;

	public BloodGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BloodGroup(int id, String bloodgroup) {
		super();
		this.id = id;
		this.bloodgroup = bloodgroup;
	}
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBloodgroup() {
		return bloodgroup;
	}



	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}



	@Override
	public String toString() {
		return "BloodGroup [id=" + id + ", bloodgroup=" + bloodgroup + "]";
	}


    
	

}
