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
				if(terceiraPalavra.equalsIgnoreCase("Carn�voro")) {
					System.out.println("�guia");
				}else {
					System.out.println("Pomba");
				}
			}else 
				{if(terceiraPalavra.equalsIgnoreCase("On�voro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
				
			}
		}
		else { 
			if(segundaPalavra.equalsIgnoreCase("inseto")) {
				if(terceiraPalavra.equalsIgnoreCase("hemat�fago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else {
				if(terceiraPalavra.equalsIgnoreCase("hemat�fago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
			}
			
		}

	}

}
