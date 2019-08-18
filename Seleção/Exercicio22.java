package Seleção;

import java.util.Scanner;

public class Exercicio22 {

	private static Scanner t;
	
	public static void main(String[] args) {
		t = new Scanner(System.in);
		int h1,h2,m1,m2;
		
		System.out.print("Idade do primeiro homem: ");
		h1 = t.nextInt();
		System.out.print("Idade do segudno homem: ");
		h2 = t.nextInt();
		System.out.print("Idade da primeira mulher: ");
		m1 = t.nextInt();
		System.out.print("Idade da segunda mulher: ");
		m2= t.nextInt();
		
		if ((h1>h2) && (m1<m2)) {
			System.out.println("Homem mais velho + mulher mais nova = "+ (int)(h1+m1));
			System.out.println("Homem mais novo * mulher mais velha = " + (int)(h2*m2));
		}
		else {
			if ((h1>h2) && (m1>m2)) {
				System.out.println("Homem mais velho + mulher mais nova = "+ (int)(h1+m2));
				System.out.println("Homem mais novo * mulher mais velha = " + (int)(h2*m1));
			}
			else {
				if ((h1<h2) && (m1<m2)) {
					System.out.println("Homem mais velho + mulher mais nova = "+ (int)(h2+m1));
					System.out.println("Homem mais novo * mulher mais velha = " + (int)(h2*m1));
				}
				else {
					System.out.println("Homem mais velho + mulher mais nova = "+ (int)(h2+m2));
					System.out.println("Homem mais novo * mulher mais velha = " + (int)(h1*m1));
				}
			}
			
		}
	}
}