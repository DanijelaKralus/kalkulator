package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		String komanda="";
		do {	
		komanda=scr.nextLine();
		if (komanda.equals("")) {
			continue;
		}
		String[] kom=komanda.split(" ");
		if (kom.length!=3) {
			continue;
		}
		int x=Integer.parseInt(kom[0]);
		int y=Integer.parseInt(kom[2]);
		switch (kom[1]) {
		case "-":
			int z=sub(x,y);
			System.out.println("Rezultat je "+ z);
			break;
		default:
			System.out.println("Operand nije podrzan");
		}
		
		
		} while (!komanda.equals("End"));
	}
	
	



public static int sub (int a, int b) {
	return a-b;
}
}