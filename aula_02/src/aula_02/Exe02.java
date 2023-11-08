package aula_02;

import java.util.Scanner;

public class Exe02 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("Média: " + (media = (nota1 + nota2 + nota3 + nota4)/4));
		
	}

}
