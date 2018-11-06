package com.example;

class Fiz extends User
{
	private String phone;
	
	public Fiz(String n, String np, String a, String p)
	{
		super(n, np, a);
		phone = p;
	}
	
	public String getPhone()
	{
		return phone;
	}	
}
