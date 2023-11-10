package aula_04;

import java.util.Scanner;

public class Exe03 {


static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, idadeMenos21 = 0, idadeMais50 = 0;
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade < 21) {
				idadeMenos21 += 1;
			}else if(idade > 50) {
				idadeMais50 += 1;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenos21);
		System.out.println("Total de pessoas menores de 50 anos: " + idadeMais50);
		

	}

}
