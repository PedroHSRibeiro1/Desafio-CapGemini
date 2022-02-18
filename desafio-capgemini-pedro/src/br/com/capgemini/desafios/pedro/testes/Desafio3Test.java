package br.com.capgemini.desafios.pedro.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Desafio3Test {

	@Test
	public void test() {

		String palavra = "ovo";

		for (int i = 1; i < palavra.length(); ++i) {
			int[] stringTemp = new int[26];

			for (int j = i; j >= 0; --j) {
				stringTemp[palavra.charAt(j) - 'a']++;
			}

			System.out.println(palavra.charAt(i));

		}
	}

}
