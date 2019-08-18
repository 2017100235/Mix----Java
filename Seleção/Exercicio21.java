package Seleção;

import java.util.Scanner;

public class Exercicio21 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int x,y,z;
		
		System.out.print("informe um valor: ");
		x =t.nextInt();
		System.out.print("informe outro valor: ");
		y =t.nextInt();
		System.out.print("informe mais um valor: ");
		z =t.nextInt();
	
		if ((x==y) && (y==z)) 
			System.out.print("Equilatero ");
		else if ((x==y) || (y==z) || (x==z)) 
			System.out.print("Isosceles ");
		else if ((x!=y) || (y!=z) || (x!=z)) 
			System.out.print("Escaleno ");
	}
}
