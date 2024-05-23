package com.stream.interfaceBinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExempleBinaryOperator {

	public static void main(String[] args) {
		//Criar uma lista de numeros inteiros
		
		List<Integer> numeros = Arrays.asList(8,3,6,5,7,12,9);
		
		// Usar BinaryOperator com expressao lambida para somar dois numeros inteiros
		
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		// Usar BinaryOperator para somar todos os numeros no Stream
		
		int resultado = numeros.stream().reduce(0, somar);
		
		// imprimir resultado da soma
		System.out.println(resultado);
		
		int resultado2 = numeros.stream().reduce(0, Integer::sum);
		
		// imprimir resultado da soma
		
		
		System.out.println(resultado2);

	}

}
