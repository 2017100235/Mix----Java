package Simples;
import java.util.Scanner;

public class Exercicio04 {

	private static Scanner t;
	
	public static void main(String a[]) {
	
	t= new Scanner(System.in);
	
	float pot_lamp,larg_com,comp_com,area_com,pot_total;
	int num_lamp;

	System.out.print("Qual a potência da lampada em (Watts)?: ");
	pot_lamp = t.nextFloat();
	
	System.out.print("Qual a largura do comodo(em metros)?: ");
	larg_com = t.nextFloat();
	
	System.out.print("Qual o comprimento do comodo (em metros)?: ");
	comp_com = t.nextFloat();
	
	area_com = larg_com * comp_com;
	pot_total = area_com *18;
	num_lamp = Math.round((pot_total/pot_lamp));
	
	System.out.println("Numeros de lampadas necessarias para iluminar esse comodo: " + num_lamp);
	
	}

}
