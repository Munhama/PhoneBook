package com.example;

class Ur extends User
{
	private String INN;
	
	public Ur(String name, String number, String adress, String INN)
	{
		super(name, number, adress);
		this.INN = INN;
	}
	
	public String getINN()
	{
		return INN;
	}	
}
