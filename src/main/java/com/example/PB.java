package com.example;

import java.io.*;
import java.util.*;
import java.sql.*;

public class PB
{
	private static Connection con;
	private static Statement st;
	private static ResultSet rs;
	private static String query;

	public static void main(String[] args)
	{
		ArrayList<Fiz> fizBook = new ArrayList<>();
		ArrayList<Ur> urBook = new ArrayList<>();

		String URL = "jdbc:mysql://localhost:3306/test";
		try
		{
			con = DriverManager.getConnection(URL,"root","1004");
			st = con.createStatement();
			query = "SELECT * FROM user";
			rs = st.executeQuery(query);
			while(rs.next())
			{
				int id = rs.getInt("id");
				String fio = rs.getString("fio");
				String phone = rs.getString("phone");
				System.out.println("ID: " + id + " Name: " + fio + " Tel: " + phone);
			}

			Scanner scan = new Scanner(System.in);

			System.out.println("1 - del; 2 - add");
			String choice = scan.next();
			switch (choice){
				case "1":
					System.out.print("Enter id: ");
					int del = scan.nextInt();
					query = "DELETE FROM user WHERE id = "+del;
					st.executeUpdate(query);
					break;
				case "2":
					System.out.print("Enter id: ");
					int id = scan.nextInt();
					System.out.print("Enter fio: ");
					String fio = scan.next();
					System.out.print("Enter phone: ");
					String phone = scan.next();
					query = "INSERT INTO user VALUES ('"+id+"','"+fio+"','"+phone+"')";
					//System.out.println(query);
					st.executeUpdate(query);
					break;
			}

			query = "SELECT * FROM user";
			rs = st.executeQuery(query);

			while(rs.next())
			{
				int id = rs.getInt("id");
				String fio = rs.getString("fio");
				String phone = rs.getString("phone");
				System.out.println("ID: " + id + " Name: " + fio + " Tel: " + phone);
			}
		}
		catch (SQLException error)
		{
			System.out.println(error.getMessage());
		}

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

		/*fizBook.add(new Fiz("James", "85479621325", "Gogol st. 15", "2548965"));

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
		}*/

		System.out.println();

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
