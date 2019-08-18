package Matriz;

import java.util.Scanner;

public class Exercicio03 {
	
	private static Scanner t;
	
	public static void main(String[] args) {
		t= new Scanner(System.in);
		int[][] d = new int[3][3];
		int i, j,x,teste=0;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("Digite um numero inteiro para a matriz :" );
				d[i][j] = t.nextInt();
			}
		}
		System.out.print("Digite um numero inteiro para verificar se existe na matriz D: ");
		x = t.nextInt();
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if (x == d[i][j] )
				 teste = 1;
			}
		}
		
		if(teste == 1)
			System.out.print("Este numero existe na matriz D");
		else
			System.out.print("Este numero não existe na matriz D");
	}
}
