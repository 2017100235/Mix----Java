package Simples;
import java.util.Scanner;

public class Exercicio05 {

	private static Scanner t;
	
	public static void main(String[] args) {
		
		t = new Scanner(System.in);
		
		float comp,larg,alt,area;
		int caixa;
		
		System.out.print("Qual o comprimento da cozinha ? ");
		comp = t.nextFloat();
		
		System.out.print("Qual a largura da cozinha ? ");
		larg = t.nextFloat();
		
		System.out.print("Qual a altura da cozinha ? ");
		alt = t.nextFloat();
		
		area = ((comp*alt*2)+(larg*alt*2));
		caixa = (int) Math.round(area/1.5);
		
		System.out.println("Quantidade de caixas de azuleijo para colocar em todas as paredes: " + caixa);
	}

}
