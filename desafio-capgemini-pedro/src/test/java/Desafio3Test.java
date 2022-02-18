import br.com.capgemini.desafios.pedro.terceiro.Anagrama;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Desafio3Test {
    @Test
    @DisplayName("Verifica anagrama palavra ovo")
    public void verificaAnagramaPalavraOvo() {
        Anagrama a = new Anagrama();
        String palavra = "ovo";
        int i = a.numAnagramas(palavra);
        System.out.println("O numero de anagramas na palavra é: " + i);
    }

    @Test
    @DisplayName("Verifica anagrama ifailuhkqq")
    public void verificaAnagrama() {
        Anagrama a = new Anagrama();
        String palavra = "ifailuhkqq";
        int i = a.numAnagramas(palavra);
        System.out.println("O numero de anagramas na palavra é: " + i);
    }
}
