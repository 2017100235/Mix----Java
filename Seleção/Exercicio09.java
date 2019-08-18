package Seleção;

import java.util.Scanner;

public class Exercicio09 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int macas;
		
		System.out.print("Quantidade de maças compradas: ");
		macas = t.nextInt();
		
		if (macas < 12 ) {
			System.out.print("Valor da compra ");
			System.out.printf("%.2f", macas*0.3);
		}
		else {
			System.out.print("Valor da compra ");
			System.out.printf("%.2f", macas*0.25);
		}
	}
}
