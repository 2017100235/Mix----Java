package Sele��o;

import java.util.Scanner;

public class Exercicio17if{

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int a,b,op;
		
		System.out.print("Informe um valor: ");
		a = t.nextInt();
		System.out.print("Informe outro valor: ");
		b = t.nextInt();
		System.out.print("1.Adi��o, 2.Subtra��o, 3.Divis�o, 4.Multiplica��o : ");
		op = t.nextInt();
		
		if (op == 1) {
			System.out.print("A soma � :");
			System.out.print(a+b);
		}
		else if (op == 2 ) {
				System.out.print("A subtra��o � :");
				System.out.print(a-b);
		}
		else if (op == 3 ) {
			System.out.print("A divis�o � :");
			System.out.print(a/b);
		}
		else if (op == 4 ) {
			System.out.print("A multiplica��o � :");
			System.out.print(a*b);
		}
		
	}
}
