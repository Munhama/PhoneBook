package com.example;

class User implements CSV
{
	private String name;
	private String number;
	private String adress;

	public User()
	{

	}
	
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

	public String toCSV()
	{
		return (name + ";" + number + ";" + adress + ";");
	}
	public void fromCSV(String str)
	{
		String[] arr = str.split(";");
		name = arr[1];
		number = arr[2];
		adress = arr[3];
	}
}
