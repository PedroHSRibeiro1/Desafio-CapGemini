package br.com.capgemini.desafios.pedro.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Desafio1Test {

	@Test
	public void TestaZero() {

		int n1 = 0;
		while (n1 < 1) {
			System.out.println("Digite um numero diferente de zero.");
			return;

		}
	}

	@Test
	public void TestaNumeroNegativo() {
		int n1 = -5;
		while (n1 < 1) {
			System.out.println("Digite um numero positivo.");
			return;
		}
	}

	@Test
	public void TestaConstrutorPiramide() {
		int n1 = 12;

		for (int i = 1; i <= n1; i++) {

			for (int j = 1; j <= n1 - i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
