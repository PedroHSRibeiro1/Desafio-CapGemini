import br.com.capgemini.desafios.pedro.segundo.Senha;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Desafio2Test {


    @Test
    @DisplayName("Verifica se é uma senha valida, sem numeros")
    public void verificaSenhaSemNumero() {
        String senha = "Ab!sssx";
        Senha s = new Senha();
        s.validarSenha(senha);
    }

    @Test
    @DisplayName("Verifica senha valida")
    public void verificaSenhaValida() {
        String senha = "Abc1234!";
        Senha s = new Senha();
        s.validarSenha(senha);
    }


    @Test
    @DisplayName("Verifica se é uma senha valida, sem caracter especial")
    public void verificaSenhaSemCaracterEspecial() {
        String senha = "asc23402M";
        Senha s = new Senha();
        s.validarSenha(senha);
    }
}
