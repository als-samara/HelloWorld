package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int age;
		String name;
		
		System.out.print("Digite seu nome: ");
		name = leia.nextLine();
		System.out.print("\nDigite sua idade: ");
		age = leia.nextInt();
		
		if(age > 0 && age <= 18){
			System.out.printf("%s o seu Plano de Saúde custará R#100,00 por mês.", name);
		}else if(age >= 11 && age <= 29) {
			System.out.printf("%s o seu Plano de Saúde custará R#200,00 por mês.", name);
		}else if(age >= 30 && age <= 45) {
			System.out.printf("%s o seu Plano de Saúde custará R#300,00 por mês.", name);
		}else if(age >= 46 && age <= 59) {
			System.out.printf("%s o seu Plano de Saúde custará R#500,00 por mês.", name);
		}else if(age >= 60 && age <= 65) {
			System.out.printf("%s o seu Plano de Saúde custará R#600,00 por mês.", name);
		}else if(age >65) {
			System.out.printf("%s o seu Plano de Saúde custará R#1000,00 por mês.", name);
		}
		
	}

}
