package com.example;

public class User implements CSV
{
	private String name;
	private String number;
	private String address;

	public User()
	{

	}
	
	public User(String name, String number, String address)
	{
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
	public String getAddress()
	{
		return address;
	}

	public String toCSV()
	{
		return (name + ";" + number + ";" + address + ";");
	}
	public void fromCSV(String str)
	{
		String[] arr = str.split(";");
		name = arr[1];
		number = arr[2];
		address = arr[3];
	}
}
