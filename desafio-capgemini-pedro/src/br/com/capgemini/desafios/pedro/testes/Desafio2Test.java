package br.com.capgemini.desafios.pedro.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Desafio2Test {

	@Test
	public void TestaTamanhoDaSenha() {
		String senha = "Pedro";
		if (senha.length() < 6) {
			System.out.println("Senha incompleta, minimo 6 caracteres");
			return;
		}
	}

	@Test
	public void TestaFaltandoLetraMaiuscula() {
		String senha = "pedro123";
		if (!senha.matches(".*[A-Z].*"))
			;
		System.out.println("Senha incompleta, minimo 1 letra Maiuscula");
		return;
	}

	@Test
	public void TestaFaltandoLetraMinuscula() {
		String senha = "PEDRO123";
		if (!senha.matches(".*[a-z].*"))
			;
		System.out.println("Senha incompleta, minimo 1 letra Minuscula");
		return;
	}

	@Test
	public void TestaFaltandoNumero() {
		String senha = "PedRoHenr";
		if (!senha.matches(".*[0-9].*"))
			;
		System.out.println("Senha incompleta, minimo 1 Numero");
		return;
	}

	@Test
	public void TestaFaltandoCaractere() {
		String senha = "PedroH103";
		if (!senha.matches(".*[!@#$%^&()-+].*"))
			;
		System.out.println("Senha incompleta, minimo 1 Caractere");
		return;
	}

	@Test
	public void TestaSenhaIdeal() {

		String senha = "PedroH10!";
		if (senha.length() < 6) {
		}
		if (senha.matches(".*[!@#$%^&()-+].*")) {
		}
		if (senha.matches(".*[0-9].*")) {
		}
		if (senha.matches(".*[a-z].*")) {
		}
		if (senha.matches(".*[A-Z].*")) {
		}
		System.out.println("Senha ideal.");
	}
}
