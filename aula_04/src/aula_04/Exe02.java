package aula_04;

import java.util.Scanner;

public class Exe02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, pares = 0, impares = 0;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		System.out.print("Digite o quarto n�mero: ");
		n4 = leia.nextInt();
		System.out.print("Digite o quinto n�mero: ");
		n5 = leia.nextInt();
		System.out.print("Digite o sexto n�mero: ");
		n6 = leia.nextInt();
		System.out.print("Digite o s�timo n�mero: ");
		n7 = leia.nextInt();
		System.out.print("Digite o oitavo n�mero: ");
		n8 = leia.nextInt();
		System.out.print("Digite o nono n�mero: ");
		n9 = leia.nextInt();
		System.out.print("Digite o d�cimo n�mero: ");
		n10 = leia.nextInt();
		
		int[] numeros = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};
		
		for(int i=0; i < numeros.length; i ++) {
			if(numeros[i] % 2 == 0) {
				pares += 1;
			}else {
				impares += 1;
			}
		}
		
		System.out.println("Total de n�meros pares: " + pares);
		System.out.println("Total de n�meros �mpares: " + impares);

	}

}
