package com.stream.interfaceSupplier.T;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExempleSupplier {

	public static void main(String[] args) {
		
		// usas supllier com lambida para fornecer saudação
		
		Supplier<String> saudacao = () -> "Olá Seja Bem Vindo";
		
		// Usar supllier para obter 5 sadações
		
		List<String> listaSuadacao = Stream.generate(saudacao)
				.limit(5)
				.collect(Collectors.toList());
		
		// imprimir saudações
		
		listaSuadacao.forEach(s -> System.out.println(s));
		
		
	}

}
