package Seleção;

import java.util.Scanner;

public class Exercicio08 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int ano;
		
		System.out.print("Ano de nascimento c/ quatro digitos: ");
		ano = t.nextInt();
		
		if ((2002 - ano)>= 16) 
			System.out.println("Você poderá votar esse ano :-) ");
		else
			System.out.println("Você ainda não poderá votar este ano :-( ");

	}

}
