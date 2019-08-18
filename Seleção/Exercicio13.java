package Seleção;

import java.util.Scanner;

public class Exercicio13 {
	
	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um numero: ");
		num = t.nextInt();
		
		if ((num % 2 ) == 0)
			System.out.println("O número digitado e PAR");
		else
			System.out.println("O número digitado é IMPAR");
	}
}
