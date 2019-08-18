package Seleção;

import java.util.Scanner;

public class Exercicio06 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float valor;
		
		System.out.print("Digite um valor: ");
		valor = t.nextFloat();
		
		if (valor < 0 )
			System.out.println("Negativo !");
		else { 
			if (valor> 0)
				System.out.println("Positivo !");
			else
				System.out.println("Zero !");
			}
	}
}