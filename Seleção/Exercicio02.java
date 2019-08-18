package Seleção;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		float nota1, nota2,op, media=0;
		
		System.out.print("Digite a primeira avaliação: ");
		nota1 = t.nextFloat();
		System.out.print("Digite a segunda avaliação: ");
		nota2 = t.nextFloat();
		System.out.print("Digite a avaliação opativa ");
		System.out.print("*caso não tiver nota digite (-1): ");
		op = t.nextFloat();
		
		if (nota1 >= nota2 ) {
			if (op!=-1)
				media=(nota1+op)/2;
		}
		
		if (nota2 > nota1 ) {
			if (op!=-1)
				media=(nota2+op)/2;
		} 
		
		if (op == -1)
			media =(nota1+nota2)/2;
			
		
		if (media >= 6.0)
			System.out.println("PARABENS, Você foi aprovado");
		if (media >=3.0 && media < 6.0)
			System.out.println("Em exame....");
		if (media < 3.0)
			System.out.println("Você foi REPROVADO, Estude mais...");
	}
}