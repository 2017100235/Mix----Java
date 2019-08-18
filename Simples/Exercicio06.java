package Simples;

import java.util.Scanner;

public class Exercicio06 {

	private static Scanner t;
	
	public static void main(String a[]) {
		
		t = new Scanner(System.in);
		float odom_i,odom_f,litros,valor_t,media,lucro,gasol_l = (float)1.90;
		
		System.out.print("Marcação inicial do odometro (KM): ");
		odom_i = t.nextFloat();
		
		System.out.print("Marcação final do odometro (KM): ");
		odom_f = t.nextFloat();
		
		System.out.print("quantidade de combustivel gasto (litros): ");
		litros = t.nextFloat();
		
		System.out.print("Valor total recebido (R$): ");
		valor_t = t.nextFloat();
		
		media = ((odom_f- odom_i)/litros);
		lucro = valor_t - (litros * gasol_l);
		
		System.out.print("Media de comsumo de Km/l: ");
		System.out.printf("%4.1f \n",media);
		System.out.print("Lucro (Liquido) do dia: R$" );
		System.out.printf("%8.2f \n",lucro);
		
	}

}
