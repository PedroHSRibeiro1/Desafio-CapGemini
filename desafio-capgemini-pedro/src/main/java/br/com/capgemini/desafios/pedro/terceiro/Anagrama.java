package br.com.capgemini.desafios.pedro.terceiro;

public class Anagrama {

    public int numAnagramas(String palavra) {

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
