package Simples;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner t;

	public static void main(String a[]) {
		t = new Scanner(System.in);
		float temp_f=0 ,temp_c=0;
		
		System.out.print("Informe a temperatura em Celcius: ");
		temp_c = t.nextFloat();
		
		temp_f= (((9*temp_c)/5) + 32);
		System.out.print("A temperatura em graus Fahrenheit é " );
		System.out.printf("%5.1f", temp_f);

	}
}
