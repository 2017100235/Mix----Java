package Repeti��o;

import java.util.Scanner;

public class Exercicio20 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		int idade=0,cont=0,media=0;
		do {
			System.out.print("Digite uma idade:");
			idade  = t.nextInt();
			if (idade != 0) {
				cont +=1;
				media = media + idade;
			}
		}while(idade!=0);
		
		if (cont > 0)
			System.out.print("A media das idade �: " + (float)(media/cont));
		else
			System.out.print("N�o tem idades para calcular");
	}
}