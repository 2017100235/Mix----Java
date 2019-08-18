package Seleção;

import java.util.Scanner;

public class Exercicio14 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int gols_g, gols_i;
		
		System.out.print("Gols do Gremio: ");
		gols_g = t.nextInt();
		System.out.print("Gols do Inter: ");
		gols_i = t.nextInt();

		if (gols_g > gols_i)
			System.out.println("GREMIO !!!");
		else {
			if(gols_i > gols_g)
				System.out.println("INTER !!!");
			else
				System.out.println("EMPATE...");
		}
	}
}
