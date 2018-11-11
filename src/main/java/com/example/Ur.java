package com.example;

class Ur extends User
{
	private static int NextId = 1;

	private String INN;
	private int id;

	public Ur()
	{
		id = 0;
		//setNextId();
	}

	public Ur(String name, String number, String adress, String INN)
	{
		super(name, number, adress);
		this.INN = INN;
		id = 0;
		//setNextId();
	}
	
	public String getINN()
	{
		return INN;
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
	}

	public static int getNextId()
	{
		return NextId;
	}*/

	public String toCSV()
	{
		return (id + ";" + super.toCSV() + INN + "\n");
	}
	public void fromCSV(String str)
	{
		String[] arr = str.split(";");
		id = Integer.valueOf(arr[0]);
		super.fromCSV(str);
		INN = arr[4];
	}
}
