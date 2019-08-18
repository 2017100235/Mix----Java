package Seleção;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.print("Digite a primeira avaliação: ");
		nota1 = t.nextFloat();
		System.out.print("Digite a segunda avaliação: ");
		nota2 = t.nextFloat();
		
		media = (nota1+nota2)/2;
		if (media >= 6.0)
			System.out.println("PARABENS, Você foi aprovado");
		else
			System.out.println("Você foi REPROVADO, Estude mais...");
	}
}