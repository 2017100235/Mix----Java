package Seleção;

import java.util.Scanner;

public class Exercicio12 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float altura, peso;
		int sexo;
		
		System.out.print("Digite sua altura: ");
		altura = t.nextFloat();
		System.out.print("1: Feminino, 2: Masculino: ");
		sexo = t.nextInt();
		
		if (sexo ==1) {
			peso = (float) ((62.1 * altura) - 44.7);
			System.out.print("Seu peso ideal é ");
			System.out.printf("%.3f",peso);
		}
		else {
			peso = (float) ((72.7 * altura) - 58);
			System.out.print("Seu peso ideal é ");
			System.out.printf("%.3f",peso);
		}
	}
}
