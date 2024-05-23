package com.stream.interfaceConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		
		// Usar consumer com expresssão lambida para imprimir numeros pares
		
		Consumer<Integer> imprimirNumeroPar = numero ->{
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
			
		};
		
		// Usar Consumer para imprimir numeros pares no Stream
		
		numeros.stream().forEach(imprimirNumeroPar);
		
		
		// forma simplificada 
		
		numeros.forEach(n -> {;
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
	}

}
