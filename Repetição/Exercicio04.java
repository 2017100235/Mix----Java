package Repetição;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int a=0,b=0;
		float divisao;
		
		System.out.print("Digite um valor inteiro: ");
		a= t.nextInt();
		
		while (b == 0) {
			System.out.print("Digite outro valor inteiro: ");
			b= t.nextInt();
			if (b==0)
				System.out.println("Valor invalido");
		}
		
		divisao = a/b;
		System.out.print("A divisão do primeiro valor pelo segundo é : ");
		System.out.printf("%.2f",divisao);
	}

}