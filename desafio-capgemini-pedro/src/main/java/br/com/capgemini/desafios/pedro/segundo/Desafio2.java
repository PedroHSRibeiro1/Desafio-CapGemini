package br.com.capgemini.desafios.pedro.segundo;

import java.util.Scanner;

public class Desafio2 {


	public static void main(String[] args) {
		// Chamando a classe Scanner e solicitando uma captura no console;
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma senha: ");
		String senha = input.next();

		Senha s = new Senha();
		/*
		 * Inicio das condições que a senha será submetida; Avaliando se possui no
		 * minimo 6 digitos,se contem pelo menos : 1 letra maiuscula, 1 letra minuscula,
		 * 1 numero e 1 caracter especial.
		 */
		s.validarSenha(senha);
	}

}