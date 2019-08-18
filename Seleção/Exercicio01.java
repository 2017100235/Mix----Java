package Seleção;

import java.util.Scanner;

public class Exercicio01 {

	private static Scanner t;
	
	public static void main(String a[]) {
		
		t = new Scanner(System.in);
		int cod;
		
		System.out.print("Qual o codigo do produto: ");
		cod = t.nextInt();
		
		switch (cod) {
		
			case 1:
				System.out.println("Sul");
				break;
				
			case 2:
				System.out.println("Norte");
				break;
				
			case 3: 
				System.out.println("Leste");
				break;
				
			case 4: 
				System.out.println("Oeste");
				break;
				
			case 5: 
			case 6: 
				System.out.println("Nordeste");
				break;
				
			case 7:
			case 8:
			case 9:
				System.out.println("Sudeste");
				break;
			
			case 10:
				System.out.println("Centro - Oeste");
				break;
				
			case 11:
				System.out.println("Noroeste");
				break;
				
			default:
				System.out.println("Importado");
		}	
	}
}
