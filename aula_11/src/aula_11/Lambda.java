package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lambda {

	public static int calcular(OperacoesMatematicas om, int num1, int num2) {
		return om.executar(num1, num2);
	}

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibir os itens\n");

		// Exibir os itens da Lista com Expressão Lambda
		numeros.forEach(n -> System.out.println(n));

		System.out.println("\nExibir os itens somados com eles mesmos\n");

		// Exibir os itens da Lista dobrados com Expressão Lambda
		numeros.forEach(n -> System.out.println(n + n));

		System.out.println("\nExibir os itens pares da lista\n");

		// Exibir apenas os elementos pares da Lista com Expressão Lambda
		numeros.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});

		// CALCULADORA
		Scanner leia = new Scanner(System.in);

		int n1, n2 = 0;

		System.out.println("****************************************************");
		System.out.println("              Calculadora com Lambda                ");
		System.out.println("****************************************************");
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();

		System.out.println("Soma = " + calcular((a, b) -> a + b, n1, n2));
		System.out.println("Subtração = " + calcular((a, b) -> a - b, n1, n2));
		System.out.println("Multiplicação = " + calcular((a, b) -> a * b, n1, n2));
		System.out.println("Divisão = " + calcular((a, b) -> a / b, n1, n2));

		leia.close();

	}

}
