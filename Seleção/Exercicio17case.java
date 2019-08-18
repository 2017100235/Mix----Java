package Seleção;

import java.util.Scanner;

public class Exercicio17case{

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int a,b,op;
		
		System.out.print("Informe um valor: ");
		a = t.nextInt();
		System.out.print("Informe outro valor: ");
		b = t.nextInt();
		System.out.print("1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação : ");
		op = t.nextInt();
		switch (op){
			case 1:
				System.out.print("A soma é :");
				System.out.print(a+b);
				break;
			case 2:
				System.out.print("A subtração é :");
				System.out.print(a-b);
				break;	
			case 3:
				System.out.print("A divisão é :");
				System.out.print(a/b);
				break;
			case 4:
				System.out.print("A multiplicação é :");
				System.out.print(a*b);
				break;
		}
	}
}
