package com.stream.interfacePredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemplePredicate {

	public static void main(String[] args) {
		// Criar uma lista de palavras
		
		List<String> palavras = Arrays.asList("PAULO", "AFONSO","CRUZ","MAYARA", "ALINE", "NARCIZO");
		
		// Criar uma predicate que verifica se a palavra tem mais de 4 letras
		
		Predicate<String> maisDeQuatroLetras = palavra -> palavra.length()>4;
		
		// Usar o Stream para filtrar as palavras com mais de 4 caracteres
		//Imprimir cada palavra que saiu do filtro
		
		palavras.stream()
		.filter(maisDeQuatroLetras)
		.forEach(System.out::println);
		
		
		palavras.stream().filter(p -> p.length()> 4).forEach(System.out::println);
		
				

	}

}
