package Seleção;

import java.util.Scanner;

public class Exercicio23 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float a,b,c;
		
		System.out.print("Primeiro angulo: ");
		a= t.nextFloat();
		System.out.print("Segundo angulo: ");
		b = t.nextFloat();
		System.out.print("Terceiro angulo: ");
		c = t.nextFloat();
		
		if( (a==90)|| (b==90) || (c==90) ) 
			System.out.print("Retangulo ....");
		else { 
			if( (a>90)|| (b>90) || (c>90) ) 
				System.out.print("Obtusangulo ....");
			else
				System.out.print("Acutangulo....");
		}
	}
}
