package Seleção;

import java.util.Scanner;

public class Exercicio18 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Digite qualquer valor : ");
		a = t.nextInt();
		System.out.print("Digite outro valor qualquer : ");
		b = t.nextInt();
		System.out.print("Digite mais um outro valor : ");
		c = t.nextInt();
		
		if ((a>b) && (a>c))
			System.out.print("O maior valor é " + a);
		if ((b>a) && (b>c)) 
			System.out.print("O maior valor é " + b);	
		if ((c>a) && (c>b)) 
			System.out.print("O maior valor é " + c);
		
	}
}
