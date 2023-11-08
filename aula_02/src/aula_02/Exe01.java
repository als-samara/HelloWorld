package aula_02;

import java.util.Scanner;

public class Exe01 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		double salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);
		

	}

}
