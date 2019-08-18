package Seleção;

import java.util.Scanner;

public class Exercicio07 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float x,y;
		
		System.out.print("Digite uma valor: ");
		x = t.nextFloat();
		System.out.print("Digite outro valor: ");
		y = t.nextFloat();
		
		if (x>y) {
			System.out.print("O maior é ");
			System.out.printf("%.2f",x);
		
		}
		else {
			System.out.print("O maior é ");
			System.out.printf("%.2f",y);
		}
	}

}
