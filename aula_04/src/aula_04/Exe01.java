package aula_04;

import java.util.Scanner;

/* Vers�o com do-while, sem interromper o programa:
public class Exe01 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero1, numero2;
		
		System.out.println("Digite o n�mero inicial: ");
		numero1 = leia.nextInt();
		
		do{
			System.out.println("Digite o n�mero final: ");
			numero2 = leia.nextInt();
			if(numero2 < numero1) {
				System.out.println("Intervalo inv�lido!");
			}
		}while(numero2 < numero1);
		
		for(int i = numero1; i <= numero2; i ++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " � m�ltiplo de 3 e 5");
			}
		}
		
	}

}
*/

public class Exe01 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1, numero2;

		System.out.println("Digite o n�mero inicial: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o n�mero final: ");
		numero2 = leia.nextInt();
		
		if (numero2 < numero1) {
			System.out.println("Intervalo inv�lido!");}

			if (numero2 > numero1) {
				for (int i = numero1; i <= numero2; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println(i + " � m�ltiplo de 3 e 5");
					}
				}
			}

		}

	}
