package com.example;

class Fiz extends User
{
	private String phone;
	
	public Fiz(String name, String number, String adress, String phone)
	{
		super(name, number, adress);
		this.phone = phone;
	}
	
	public String getPhone()
	{
		return phone;
	}	
}
