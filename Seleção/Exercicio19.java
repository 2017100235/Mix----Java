package Seleção;

import java.util.Scanner;

public class Exercicio19 {

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
		
		if ((x>y) && (y>z)) {
			System.out.print("A soma dos dois maiores é ");
			System.out.printf("%d",x+y);
		}
		else {
			if ((z>y) && (y>x)) {
				System.out.print("A soma dos dois maiores é ");
				System.out.printf("%d",z+y);
			}
			else {
				System.out.print("A soma dos dois maiores é ");
				System.out.printf("%d",x+z);
			}
		}
	}
}
