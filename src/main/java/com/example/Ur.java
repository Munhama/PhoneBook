package com.example;

class Ur extends User
{
	private static int NextId = 1;

	private String INN;
	private int id;
	
	public Ur(String name, String number, String adress, String INN)
	{
		super(name, number, adress);
		this.INN = INN;
		id = 0;
		setNextId();
	}
	
	public String getINN()
	{
		return INN;
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
