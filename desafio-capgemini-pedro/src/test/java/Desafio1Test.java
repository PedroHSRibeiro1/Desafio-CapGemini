import br.com.capgemini.desafios.pedro.primeiro.Piramide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Desafio1Test {
    @Test
    @DisplayName("Verifica se numero é valido")
    public void verificaNumeroValido() {
        Piramide p = new Piramide();
        p.construirPiramide(0);
    }

    @Test
    @DisplayName("Verifica retorno quando o numero for maior que zero")
    public void verificaNumeroMaiorQueZero() {
        Piramide p = new Piramide();
        p.construirPiramide(6);
    }
}
