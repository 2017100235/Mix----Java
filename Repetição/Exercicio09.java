package Repetição;

import java.util.Scanner;

public class Exercicio09 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		float nota1, nota2, media;
		int resp=0, cont=0;
		
		do {
			
			System.out.print("Digite a nota da 1ª avaliação: ");
			nota1 =t.nextFloat();
			System.out.print("Digite a nota da 2ª avaliação: ");
			nota2 =t.nextFloat();
			media=(nota1+nota2)/2;
			
			if (media>=6.0)
				cont +=1;
			System.out.print("Calcular a media de outro aluno? 1.sim, 2.não :  ");
			resp = t.nextInt();
		}while(resp == 1);
		
		System.out.print("Quantidade de alunos aprovados: " + (int)cont);
	}
}
