package model;

public class Employee extends Persons{
	private String nip;
	
	public String getNip(){
		return nip;
	}
	
	public void setNip(String nip){
		this.nip = nip;
	}
}