package com.example;

import java.util.*;

public class PB
{
	public static void main(String[] args)
	{		
		ArrayList<User> ar = new ArrayList<User>();

		ar.add(new User("Sam", "87459514562", "Kirova st. 14"));
		ar.add(new User("John", "88005553535", "Linin st. 100"));
		ar.add(new User("Mik", "89563214554", "Krilova st. 15"));
		ar.add(new User("Stan", "89995847485", "Nikitina st. 578"));
		
		for(int e=0; e<ar.size(); e++)
		{
			System.out.println("ID: " + ar.get(e).getId() + " Name: " + ar.get(e).getName() + " Tel: " + ar.get(e).getNumber() + " Adress: " + ar.get(e).getAdress());
		}
	}
}
