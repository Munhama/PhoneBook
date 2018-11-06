package com.example;

class Ur extends User
{
	private String INN;
	
	public Ur(String n, String np, String a, String inn)
	{
		super(n, np, a);
		INN = inn;
	}
	
	public String getINN()
	{
		return INN;
	}	
}
