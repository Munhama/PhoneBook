package com.example;

import java.util.*;

public class PB
{
	public static void main(String[] args)
	{		
		ArrayList<Ur> urBook = new ArrayList<Ur>();
		ArrayList<Fiz> fizBook = new ArrayList<Fiz>();

		urBook.add(new Ur("Sam", "87459514562", "Kirova st. 14", "12345678915"));
		urBook.add(new Ur("John", "88005553535", "Linin st. 100", "12345678915"));
		fizBook.add(new Fiz("Mik", "89563214554", "Krilova st. 15", "2245968"));
		fizBook.add(new Fiz("Stan", "89995847485", "Nikitina st. 578", "2245745"));
		
		for(int e=0; e<urBook.size(); e++)
		{
			System.out.println("ID: " + urBook.get(e).getId() + " Name: " + urBook.get(e).getName() + " Tel: " + urBook.get(e).getNumber() + " Adress: " + urBook.get(e).getAdress() + " INN: " + urBook.get(e).getINN());
		}

		for(int e=0; e<fizBook.size(); e++)
		{
			System.out.println("ID: " + fizBook.get(e).getId() + " Name: " + fizBook.get(e).getName() + " Tel: " + fizBook.get(e).getNumber() + " Adress: " + fizBook.get(e).getAdress() + " Phone: " + fizBook.get(e).getPhone());
		}
	}
}
