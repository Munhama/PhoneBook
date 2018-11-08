package com.example;

abstract class User
{
	private String name;
	private String number;
	private String adress;
	
	public User(String name, String number, String adress)
	{
		this.name = name;
		this.number = number;
		this.adress = adress;
	}
	
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
	public String getAdress()
	{
		return adress;
	}
}
