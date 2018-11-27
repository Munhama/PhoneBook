package com.example;

public class Fiz extends User
{
	private static int NextId = 1;

	private String phone;
	private int id;

	public Fiz()
	{
		id = 0;
		//setNextId();
	}

	public Fiz(String name, String number, String adress, String phone)
	{
		super(name, number, adress);
		this.phone = phone;
		id = 0;
		//setNextId();
	}
	
	public String getPhone()
	{
		return phone;
	}

	public int getId()
	{
		id = NextId;
		NextId++;
		return id;
	}

	/*public void setNextId()
	{
		id = NextId;
		NextId++;
		getNextId();
	}

	public static int getNextId()
	{
		return NextId;
	}*/

	public String toCSV()
	{
		return (id + ";" + super.toCSV() + phone + "\n");
	}
	public void fromCSV(String str)
	{
		String[] arr = str.split(";");
		id = Integer.valueOf(arr[0]);
		super.fromCSV(str);
		phone = arr[4];
	}
}
