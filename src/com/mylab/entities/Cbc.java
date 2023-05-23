package com.mylab.entities;

public class Cbc {
	private int id;
     private int rbc;
     private int wbc;
     private int platelet;
     private int Hemoglubin;
     
	public Cbc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cbc(int id, int rbc) {
		super();
		this.id = id;
		this.rbc = rbc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRbc() {
		return rbc;
	}
	public void setRbc(int rbc) {
		this.rbc = rbc;
	}
	
	
	
	
	public int getWbc() {
		return wbc;
	}
	public void setWbc(int wbc) {
		this.wbc = wbc;
	}
	public int getPlatelet() {
		return platelet;
	}
	public void setPlatelet(int platelet) {
		this.platelet = platelet;
	}
	public int getHemoglubin() {
		return Hemoglubin;
	}
	public void setHemoglubin(int hemoglubin) {
		Hemoglubin = hemoglubin;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cbc [id=" + id + ", rbc=" + rbc + ", wbc=" + wbc + ", platelet=" + platelet + ", Hemoglubin="
				+ Hemoglubin + "]";
	}
	public void display() {
		System.out.println("                Complete Blood Count                   ");
		System.out.println("Red Blood Cell :                   "+rbc);
		System.out.println("White Blood Cell:                  "+wbc);
		System.out.println("Platelet :                         "+platelet);
		System.out.println("Hemoglubin :                       "+Hemoglubin);
	}
	
     
     
     


}
