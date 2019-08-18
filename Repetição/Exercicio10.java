package Repetição;

import java.util.Scanner;

public class Exercicio10 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		float nota1, nota2, media;
		int resp=0, cont=0, repro=0, exame=0;
	
		do {
			
			System.out.print("Digite a nota da 1ª avaliação: ");
			nota1 =t.nextFloat();
			System.out.print("Digite a nota da 2ª avaliação: ");
			nota2 =t.nextFloat();
			media=(nota1+nota2)/2;
			
			if (media>=6.0)
				cont +=1;
			if (media>3.0 && media <6.0)
				exame +=1;
			if (media<3)
				repro +=1;
			System.out.print("Calcular a media de outro aluno? 1.sim, 2.não :  ");
			resp = t.nextInt();
		}while(resp == 1);
		
		System.out.println("Quantidade de alunos aprovados: " + (int)cont);
		System.out.println("Quantidade de alunos reprovados: " + (int)repro);
		System.out.println("Quantidade de alunos em exame: " + (int)exame);
	}
}
