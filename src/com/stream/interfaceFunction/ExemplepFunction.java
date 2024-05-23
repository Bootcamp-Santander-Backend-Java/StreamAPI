package com.stream.interfaceFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemplepFunction {

	public static void main(String[] args) {
		// Criar uma lista com numeros inteiros
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,32);
		
		// Usar Function com função lambida para dobrar os numeros
		
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		// Usar a fuçao para dobrar  todos os numeros no Stream e armazena-los em outra lista 
		
		List<Integer> numerosDobrados = numeros.stream()
				.map(dobrar)
				.collect(Collectors.toList()); // coleta tudo dentro de uma lista
		
		// Imprimir lista de numeros dobrados
		
		numerosDobrados.forEach(n -> System.out.println(n));

	}

}
