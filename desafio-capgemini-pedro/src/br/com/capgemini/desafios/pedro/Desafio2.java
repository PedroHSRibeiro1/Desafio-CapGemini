package br.com.capgemini.desafios.pedro;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		// Chamando a classe Scanner e solicitando uma captura no console;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma senha: ");
		String senha = input.next();

		/*
		 * Inicio das condições que a senha será submetida; Avaliando se possui no
		 * minimo 6 digitos,se contem pelo menos : 1 letra maiuscula, 1 letra minuscula,
		 * 1 numero e 1 caracter especial.
		 */
		if (senha.length() < 6) {
			System.out.println("Senha incompleta");
			System.out.println("A senha deve conter no minimo 6 caracteres.");
		}

		if (!senha.matches(".*[A-Z].*")) {
			System.out.println("A senha deve conter no minimo uma letra maiuscula.");
		}

		if (!senha.matches(".*[a-z].*")) {
			System.out.println("A senha deve conter no minimo uma letra minuscula.");
		}
		if (!senha.matches(".*[!@#$%^&()-+].*")) {
			System.out.println("A senha deve conter no minimo um caracter especial.");
			
		}
		if (!senha.matches(".*[0-9].*")) {
			System.out.println("A senha deve conter no minimo um numero.");

		} else
		System.out.println("Sua senha está ok");
			
	}

}