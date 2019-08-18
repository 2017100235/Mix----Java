package Seleção;

import java.util.Scanner;

public class Exercicio20 {

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
		
		if ((a<b) && (a<c)){
			if (b<c)
				System.out.print(c+" " +b+" "+a);
			else
				System.out.print(b+" " +c+" "+a);
		}
		else {
			
			if ((b<a) && (b<c)) {
				if (a<c)
					System.out.print(c+" " +a+" "+b);
				else
					System.out.print(a+" " +c+" "+b);
			}
			
			else {
				if (b<a)
					System.out.print(a+" " +b+" "+c);
				else
					System.out.print(b+" " +a+" "+c);
			}
		}
	}
}
