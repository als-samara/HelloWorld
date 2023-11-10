package aula_04;

import java.util.Scanner;

public class Exe02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, pares = 0, impares = 0;
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextInt();
		System.out.print("Digite o quarto número: ");
		n4 = leia.nextInt();
		System.out.print("Digite o quinto número: ");
		n5 = leia.nextInt();
		System.out.print("Digite o sexto número: ");
		n6 = leia.nextInt();
		System.out.print("Digite o sétimo número: ");
		n7 = leia.nextInt();
		System.out.print("Digite o oitavo número: ");
		n8 = leia.nextInt();
		System.out.print("Digite o nono número: ");
		n9 = leia.nextInt();
		System.out.print("Digite o décimo número: ");
		n10 = leia.nextInt();
		
		int[] numeros = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};
		
		for(int i=0; i < numeros.length; i ++) {
			if(numeros[i] % 2 == 0) {
				pares += 1;
			}else {
				impares += 1;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

	}

}
