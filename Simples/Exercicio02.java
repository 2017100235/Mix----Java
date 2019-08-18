package Simples;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner t;

	public static void main(String a[]) {
		t = new Scanner(System.in);
		float temp_f=0 ,temp_c=0;
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		temp_f = t.nextFloat();
		
		temp_c=((temp_f - 32)*5)/9;
		System.out.print("A temperatura em graus celsius é " );
		System.out.printf("%5.1f", temp_c);

	}
}
