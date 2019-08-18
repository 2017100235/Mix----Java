package Seleção;

import java.util.Scanner;

public class Exercicio16 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int num_lado;
		float med_lado;
		
		System.out.print("Quantos lados tem o poligono: ");
		num_lado = t.nextInt();
		System.out.print("Qual a medida do lado (cm): ");
		med_lado = t.nextFloat();
		
		if (num_lado <3)
			System.out.println("Não é um polígono");
		else if (num_lado == 3) {
			System.out.println("Triangulo");
			System.out.print("Perimetro: ");
			System.out.printf("%.2f",med_lado*3);
		}
		else if (num_lado == 4) {
				System.out.println("Quadrado");
				System.out.print("Área: ");
				System.out.printf("%.2f",med_lado*med_lado);
			}
		else if(num_lado >= 5)
				System.out.println("Polígono não identificado");
	}
}
