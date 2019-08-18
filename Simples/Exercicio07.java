package Simples;

import java.util.Scanner;

public class Exercicio07 {

	private static Scanner t;
	
	public static void main(String a[]) {
		t = new Scanner(System.in);
		
		float comp, reabast,consumo,total_pista, distanciaporvolta,resp;
		int num_voltas;
		
		System.out.print("Qual o comprimento da pista em metros ? ");
		comp = t.nextFloat();
		
		System.out.print("Qual o nuemro de voltas ? ");
		num_voltas = t.nextInt();
		
		System.out.print("Qual o numero de reabastecimentos ? ");
		reabast = t.nextFloat();
		
		System.out.print("Qual o consumo do carro (Km/L) ? ");
		consumo = t.nextFloat();
		 
		total_pista = (comp * num_voltas);
		distanciaporvolta = (total_pista/reabast); 
		resp = (float)(distanciaporvolta/(consumo*1000));
		
		System.out.print("O total minimo de litros necessarios por reabastecimento é : ");
		System.out.printf("%.2f", resp);
	}

}
