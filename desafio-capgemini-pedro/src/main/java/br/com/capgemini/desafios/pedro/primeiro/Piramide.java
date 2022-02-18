package br.com.capgemini.desafios.pedro.primeiro;

public class Piramide {

    // Iteração da matriz
   public void construirPiramide(int n1) {
       if(n1 >0){
        for (int i = 1; i <= n1; i++) {

            for(int j = 1; j <= n1 -i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       }else{
           System.out.println("Numero Invalido!");
       }
    }
}
