package Contador.java;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmentro: ");
			int parametroUm = in.nextInt();
		System.out.print("Digite o segundo parâmentro: ");
			int parametroDois = in.nextInt();
			
		try {
			Contador.contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException ex) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}	
		
		in.close();
	}
	
	public static void contar (int contadorUm, int contadorDois) throws ParametrosInvalidosException {
		if (contadorUm < contadorDois) {
			int contagem = contadorDois - contadorUm;
			for (int i=1; i<=contagem; i++) {
					System.out.println("Imprimindo o número "  + i);
		    }
		} else {
			throw new ParametrosInvalidosException(); // LANÇA A EXCEÇÃO SE OS PARÂMETROS FOREM INVÁLIDOS
		}
	}
		
}

