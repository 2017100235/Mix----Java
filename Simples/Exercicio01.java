package Simples;

import java.util.Scanner;

public class Exercicio01 {

	private static Scanner t;

	public static void main(String a[]) {
		t = new Scanner(System.in);
		
		float raio=0, area=0;
		
		System.out.print("Informe o raio do circulo: ");
		raio = t.nextFloat();
		area = (float)(3.14 * Math.sqrt(raio));
		
		System.out.print("A area do circulo é ");
		System.out.printf("%6.2f",area);
	}

}