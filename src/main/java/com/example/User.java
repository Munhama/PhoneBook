package com.example;

abstract class User
{
	private static int NextId = 1;
	
	private String name;
	private String number;
	private String adress;
	private int id;
	
	public User(String n, String np, String a)
	{
		name = n;
		number = np;
		adress = a;
		id = 0;
		setNextId();
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
	public int getId()
	{
		return id;
	}
	
	public void setNextId()
	{
		id = NextId;
		NextId++;
	}
	
	public static int getNextId()
	{
		return NextId;
	}
}
