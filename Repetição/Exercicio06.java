package Repeti��o;

import java.util.Scanner;

public class Exercicio06 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		float n1,n2,media;
		int resp = 1;
		
		while(resp == 1) {
		
			System.out.print("Nota 1:");
			n1 =t.nextFloat();
		
			while (true) {
				if (n1>10 || n1<0) {
					System.out.print("Nota invalida, digite novamente: ");
					n1 =t.nextFloat();
				}
				else
					break;
			}
			
			System.out.print("Nota 2:");
			n2 =t.nextFloat();
			while (true) {
				if (n2>10 || n2<0) {
					System.out.print("Nota invalida, digite novamente: ");
					n2 =t.nextFloat();
				}
				else
					break;
			}
			
			media=(n1+n2)/2;
			System.out.print("Media final: " );
			System.out.printf("%.2f",media);
			
			System.out.println("Quer continuar, 1.sim,2.n�o: ");
			resp = t.nextInt();
		}
	}

}