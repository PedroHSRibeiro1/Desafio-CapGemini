package br.com.capgemini.desafios.pedro.terceiro;

import java.util.*;

/*Acredito que houve um erro de digita��o no exemplo 1)- da palavra ovo, a palavra ovo em matematica
  possui somente 2 anagramas e n�o 3 como mencionado no exemplo, ovo � representado
  matematicamente pela seguinte express�o = "o" repete 2x = 2! e "v" nao repete logo 1!, temos ent�o = 2!/1! que 
  � igual a 2, logo 2 anagramas na palavra e n�o 3 como mostrado no problema.
  */

public class Desafio3 {

	public static void main(String[] args) {

		// Evocando o metodo scanner e solicitando a palavra a ser analisada;
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a palavra: ");
		String palavra = sc.next().trim();

		Anagrama a = new Anagrama();

		int i = a.numAnagramas(palavra);

		System.out.println("O numero de anagramas na palavra �: " + i);

	}

}