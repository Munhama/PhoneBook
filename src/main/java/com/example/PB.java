package com.example;

import java.io.*;
import java.util.*;
import java.sql.*;

public class PB
{
	public static void main(String[] args)
	{
		ArrayList<Fiz> fizBook = new ArrayList<>();
		ArrayList<Ur> urBook = new ArrayList<>();

		try
		{
			FileReader fr = new FileReader("//home//munhama//Рабочий стол//JAVA//PhoneBook//src//main//resources//Fiz.csv");

			Scanner scan = new Scanner(fr);
			scan.nextLine();
			while(scan.hasNextLine())
			{
				Fiz fiz = new Fiz();
				fiz.fromCSV(scan.nextLine());
				fizBook.add(fiz);
			}
			fr.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}

		try
		{
			FileReader fr = new FileReader("//home//munhama//Рабочий стол//JAVA//PhoneBook//src//main//resources//Ur.csv");

			Scanner scan = new Scanner(fr);
			scan.nextLine();
			while(scan.hasNextLine())
			{
				Ur ur = new Ur();
				ur.fromCSV(scan.nextLine());
				urBook.add(ur);
			}
			fr.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}

		fizBook.add(new Fiz("James", "85479621325", "Gogol st. 15", "2548965"));

		try
		{
			FileWriter fw = new FileWriter("//home//munhama//Рабочий стол//JAVA//PhoneBook//src//main//resources//Fiz.csv", true);

			int e=fizBook.size()-1;
			fw.write(fizBook.get(e).toCSV());
			fw.flush();
			fw.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}

		try
		{
			FileWriter fw = new FileWriter("//home//munhama//Рабочий стол//JAVA//PhoneBook//src//main//resources//Ur.csv", true);

			int e=urBook.size()-1;
			fw.write(urBook.get(e).toCSV());
			fw.flush();
			fw.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}

		for(Fiz e : fizBook)
		{
			System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Tel: " + e.getNumber() + " Adress: " + e.getAdress() + " Phone: " + e.getPhone());
		}

		System.out.println();

		for(Ur e : urBook)
		{
			System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Tel: " + e.getNumber() + " Adress: " + e.getAdress() + " INN: " + e.getINN());
		}
	}
}
