package aula_03;
import java.util.Scanner;

public class Exe06 {
static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int codigo;
		float salario;
		
		System.out.print("Digite o nome do funcion�rio: ");
		nome = leia.nextLine();
		System.out.print("Digite o c�digo do funcion�rio: ");
		codigo = leia.nextInt();
		System.out.print("Digite o sal�rio do funcion�rio: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
			case 1:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Gerente"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*10) /100)
																			 );
				break;
			case 2:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Vendedor"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*7) /100)
																			 );
				break;
			case 3:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Supervisor"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*9) /100)
																			 );
				break;
			case 4:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Motorista"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*6) /100)
																			 );
				break;
			case 5:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: Estoquista"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*5) /100)
																			 );
				break;
			case 6:
				System.out.println(
								   "Nome do colaborador: " + nome + ""
						+ 		   "\nCargo: T�cnico de TI"
						+ 		   "\nNovo sal�rio: " + (salario + (salario*8) /100)
																			 );
				break;
			default:
				System.out.println("Verifique o c�digo do funcion�rio e tente novamente!");
		}
				
	}

}
