package Repetição;

import java.util.Scanner;

public class Exercicio17 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int n, fatorial=1,i;
		
		System.out.print("Digite um numero inteiro: ");
		n =t.nextInt();
		if (n==0)
			System.out.print("Fatorial de 0 é 1");
		else
		{
			for(i=1;i<=n;i++) {
				fatorial *=i;
			}
			System.out.print("Fatorial de "+ n + " é : " + fatorial);
		}
	}
}
