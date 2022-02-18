package br.com.capgemini.desafios.pedro;

import java.io.*;
import java.util.*;

/*Acredito que houve um erro de digitação no exemplo 1)- da palavra ovo, a palavra ovo em matematica
  possui somente 2 anagramas e não 3 como mencionado no exemplo, ovo é representado
  matematicamente pela seguinte expressão = "o" repete 2x = 2! e "v" nao repete logo 1!, temos então = 2!/1! que 
  é igual a 2, logo 2 anagramas na palavra e não 3 como mostrado no problema.
  */

public class Desafio3 {

	public static void main(String[] args) {

		// Evocando o metodo scanner e solicitando a palavra a ser analisada;

		Scanner sc = new Scanner(System.in);
		System.out.println("digite a palavra: ");
		String palavra = sc.next().trim();

		System.out.println("O numero de anagramas na palavra é: " + numAnagramas(palavra));

	}

	public static int numAnagramas(String palavra) {

		int total = 0;
		for (int i = 1; i < palavra.length(); ++i) {
			int[] stringTemp = new int[26];

			for (int j = i; j >= 0; --j) {
				stringTemp[palavra.charAt(j) - 'a']++;

				for (int k = 0; k < j; ++k) {
					int[] chars = new int[26];
					int x = k;
					int contador = 0;
					while (contador <= i - j) {
						++chars[palavra.charAt(x) - 'a'];
						++x;
						++contador;
					}

					// Teste de identificação da variavel.

					boolean testaBooleano = true;
					for (x = 0; x < 26; ++x) {
						if (stringTemp[x] != chars[x]) {
							testaBooleano = false;
							break;
						}
					}
					if (testaBooleano)
						++total;
				}

			}
		}
		return total;
	}
}