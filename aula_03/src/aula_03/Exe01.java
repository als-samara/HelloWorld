package aula_03;

import java.util.Scanner;

public class Exe01 {
static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a, b, c, somaAComB;
		
		System.out.print("Digite o valor A: ");
		a = leia.nextInt();
		System.out.print("\nDigite o valor B: ");
		b = leia.nextInt();
		System.out.print("\nDigite o valor C: ");
		c = leia.nextInt();
		somaAComB = a+b;
		
		if(somaAComB < c) {
			System.out.println(a + "+" + b + " = "+ (a+b) + " < " 
							   + c + "\nA soma de A + B � menor do que C");
		}
		else if(somaAComB == c) {
			System.out.println(a + "+" + b + " = "+ (a+b) + " = " 
							   + c + "\nA soma de A + B � igual a C");
		}
		else {
			System.out.println(a + "+" + b + " = "+ (a+b) + " > " 
							   + c + "\nA soma de A + B � maior do que C");
		}

	}

}
