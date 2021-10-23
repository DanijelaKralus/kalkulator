package kalkulator;

import com.sun.java_cup.internal.runtime.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scr = new java.util.Scanner(System.in);
		String komanda="";
		do {	
		komanda=scr.nextLine();
		} while (!komanda.equals("End"));
	}

}
