package aula_03;
import java.util.Scanner;

public class Exe06 {
static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int codigo;
		float salario;
		
		System.out.print("Digite o nome do funcionário: ");
		nome = leia.nextLine();
		System.out.print("Digite o código do funcionário: ");
		codigo = leia.nextInt();
		System.out.print("Digite o salário do funcionário: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
			case 1:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Gerente"
						+ 		   "\nNovo salário: " + (salario + (salario*10) /100)
																			 );
				break;
			case 2:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Vendedor"
						+ 		   "\nNovo salário: " + (salario + (salario*7) /100)
																			 );
				break;
			case 3:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Supervisor"
						+ 		   "\nNovo salário: " + (salario + (salario*9) /100)
																			 );
				break;
			case 4:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Motorista"
						+ 		   "\nNovo salário: " + (salario + (salario*6) /100)
																			 );
				break;
			case 5:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Estoquista"
						+ 		   "\nNovo salário: " + (salario + (salario*5) /100)
																			 );
				break;
			case 6:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Técnico de TI"
						+ 		   "\nNovo salário: " + (salario + (salario*8) /100)
																			 );
				break;
			default:
				System.out.println("Verifique o código do funcionário e tente novamente!");
		}
				
	}

}
