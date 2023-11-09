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
			System.out.println("A soma do valor de A com B é menor do que o valor de C");
		}else if(somaAComB == c) {
			System.out.println("A soma do valor de A com B é igual ao valor de C");
		}else {
			System.out.println("A soma do valor de A com B é maior do que o valor de C");
		}

	}

}
