package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> cidades = Arrays.asList("S�o Paulo", "Campinas","SJC", "Atibaia", "Pereira Barreto", "Mongagu�");
		List<String> cidades1 = Arrays.asList("S�o Paulo", "Campinas","SJC", "Atibaia", "Pereira Barreto", "Mongagu�", "S�o Paulo", "S�o Paulo");

		// OPERA��ES COM NUMEROS
		List<Integer> numerosAoCubo = numeros.stream()
			.map(n -> n*n*n)
			.collect(Collectors.toList());
				
		System.out.println(numerosAoCubo);	
		
		List<Integer> numerosPares = numeros.stream()
			.filter(n -> n%2 == 0)
			.collect(Collectors.toList());
		
		System.out.println(numerosPares);
		

		// OPERA��ES COM CIDADES
		int cidadesIniciandoComP = (int) cidades.stream()
				.filter(cidade -> cidade.toString().toUpperCase().startsWith("P"))
				.count();
		System.out.println("Quantas cidades come�am com P: " + cidadesIniciandoComP);
		
		// OPERA��ES COM CIDADES 1
		List<String> cidadesSemRepeticoes = cidades1.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Cidades sem repeti��o: " + cidadesSemRepeticoes);
		
	}

}
