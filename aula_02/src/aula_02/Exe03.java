package aula_02;

import java.util.Scanner;

public class Exe03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextDouble();
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextDouble();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextDouble();
		System.out.println("Digite os descontos: ");
		descontos = leia.nextDouble();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) + descontos);
		
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		

	}

}
