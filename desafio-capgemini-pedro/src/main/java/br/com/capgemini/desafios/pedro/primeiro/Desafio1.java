package br.com.capgemini.desafios.pedro.primeiro;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {	
		// É solicitado ao usuário o numero que se deseja observar a piramide;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado: ");
		int n1 = s.nextInt();

		Piramide p = new Piramide();

		p.construirPiramide(n1);
	}

}
