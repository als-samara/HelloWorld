package aula_03;
import java.util.Scanner;

public class Exe04 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		String primeiraPalavra, segundaPalavra, terceiraPalavra;
		
		System.out.print("Digite a primeira palavra: ");
		primeiraPalavra = leia.nextLine();
		System.out.print("\nDigite a segunda palavra: ");
		segundaPalavra = leia.nextLine();
		System.out.print("\nDigite a terceira palavra: ");
		terceiraPalavra = leia.nextLine();
		
		
		if(primeiraPalavra.equalsIgnoreCase("Vertebrado")) {
			if(segundaPalavra.equalsIgnoreCase("Ave")) {
				if(terceiraPalavra.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				}else {
					System.out.println("Pomba");
				}
			}else 
				{if(terceiraPalavra.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
				
			}
		}
		else { 
			if(segundaPalavra.equalsIgnoreCase("inseto")) {
				if(terceiraPalavra.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else {
				if(terceiraPalavra.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
			}
			
		}

	}

}
