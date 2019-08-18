package Seleção;

import java.util.Scanner;

public class Exercicio11 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int senha;
		
		System.out.print("Digite a senha (quadro digitos): ");
		senha = t.nextInt();
		
		if (senha == 1234) 
			System.out.println("Acesso permitido");
		else
			System.out.println("Acesso negado...");
	}
}
