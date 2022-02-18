package br.com.capgemini.desafios.pedro;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {	
		// � solicitado ao usu�rio o numero que se deseja observar a piramide;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado: ");
		int n1 = s.nextInt();
		
		// Condi��o para verificar se o numero � positivo e diferente de 0;
		while(n1 < 1){
			System.out.println("Digite um numero positivo e maior que zero.");
			return;
		}
		
		// Itera��o da matriz
	    for (int i = 1; i <= n1; i++) {

            for(int j = 1; j <= n1-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
			
          }
            System.out.println();
	    }
	}
}
