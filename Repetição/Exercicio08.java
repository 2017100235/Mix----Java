package Repetição;

import java.util.Scanner;

public class Exercicio08 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int x,y,z,resp=0;
		
		do {
		System.out.print("informe um valor: ");
		x =t.nextInt();
		System.out.print("informe outro valor: ");
		y =t.nextInt();
		System.out.print("informe mais um valor: ");
		z =t.nextInt();
		
		System.out.print("Os dados estão corretos 1.sim,2.não: ");
		resp = t.nextInt();
		}while(resp==2);
		
		if ((x==y) && (y==z)) 
			System.out.print("Equilatero ");
		else if ((x==y) || (y==z) || (x==z)) 
			System.out.print("Isosceles ");
		else if ((x!=y) || (y!=z) || (x!=z)) 
			System.out.print("Escaleno ");
	}
}
