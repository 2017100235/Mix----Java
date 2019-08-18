package Vetores;

import java.util.Scanner;

public class Exercicio08 {
	
	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int[]x = new int[10];
		int[]w = new int[10];
		int v=0,pos=0,cont=0;
		
		for(pos=0;pos<10;pos++) {
			System.out.print("Valor " + (pos+1) + "º: ");
			w[pos] = t.nextInt();
		}
		System.out.print("digite um valor: ");
		v= t.nextInt();
		for(pos=0;pos<10;pos++) {
			if (w[pos] == v) {
				cont +=1;
				x[cont] = pos;
			}	
		}
		if (cont == 0) 
			System.out.print("O valor de "+ v + "não aparece no vetor" + w);
		else {
				System.out.print("O valor de " + v + " apareceu "+ cont + " vezes no vetor w ");
				for(pos=1; pos<=cont;pos++) 
					System.out.println("\n Na posição " + x[pos]);
		}
	}
}
