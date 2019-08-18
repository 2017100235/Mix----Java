package Repetição;

import java.util.Scanner;

public class Exercicio13 {

	private static Scanner t;
	private static String nome;
	private static String nome_m;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		float altura=0,maior=0;
		int num=0;
		nome = null;
		nome_m = null;
		
		while(nome.toUpperCase() != "FIM") {
			System.out.print("nome: ");
			nome = t.nextLine();
			if (nome.toUpperCase()== "FIM") {
				System.out.println("total de moças no concurso: " + (int)num);
				System.out.println("Moça mais alta" + nome_m);
				System.out.print("Altura: " );
				System.out.printf("%.2f",maior);
			}
			else {
				System.out.println("altura: ");
				altura = t.nextFloat();
				num +=1;
				if (altura> maior) {
					maior = altura;
					nome_m = nome;
				}
				
			}
			
		}

	}

}
