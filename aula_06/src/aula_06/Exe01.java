package aula_06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exe01 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("Lista de cores: ");
		for(var cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("Lista de cores ordenada: " + cores);
		
		
		
		
	}

}
