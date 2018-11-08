package com.example;

import java.io.*;
import java.util.*;

public class PB
{
	public static void main(String[] args)
	{
		ArrayList<Fiz> fizBook = new ArrayList<Fiz>();
		ArrayList<Ur> urBook = new ArrayList<Ur>();
		try
		{
			FileReader fr = new FileReader("//home//munhama//Рабочий стол//JAVA//PhoneBook//src//main//resources//Fiz.csv");

			String[] str;
			Scanner scan = new Scanner(fr);
			scan.nextLine();
			while(scan.hasNextLine())
			{
				str = scan.nextLine().split(";");
				fizBook.add(new Fiz(str[1], str[2], str[3], str[4]));
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

			String[] str;
			Scanner scan = new Scanner(fr);
			scan.nextLine();
			while(scan.hasNextLine())
			{
				str = scan.nextLine().split(";");
				urBook.add(new Ur(str[1], str[2], str[3], str[4]));
			}
			fr.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}

		for(int e=0; e<fizBook.size(); e++)
		{
			System.out.println("ID: " + fizBook.get(e).getId() + " Name: " + fizBook.get(e).getName() + " Tel: " + fizBook.get(e).getNumber() + " Adress: " + fizBook.get(e).getAdress() + " Phone: " + fizBook.get(e).getPhone());
		}

		for(int e=0; e<urBook.size(); e++)
		{
			System.out.println("ID: " + urBook.get(e).getId() + " Name: " + urBook.get(e).getName() + " Tel: " + urBook.get(e).getNumber() + " Adress: " + urBook.get(e).getAdress() + " INN: " + urBook.get(e).getINN());
		}
	}
}
