package com.example;

class Fiz extends User
{
	private static int NextId = 1;

	private String phone;
	private int id;
	
	public Fiz(String name, String number, String adress, String phone)
	{
		super(name, number, adress);
		this.phone = phone;
		id = 0;
		setNextId();
	}
	
	public String getPhone()
	{
		return phone;
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
