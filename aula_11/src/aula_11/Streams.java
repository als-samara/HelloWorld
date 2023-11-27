package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

				List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
				
		System.out.println(numerosAoCubo);

	}

}
