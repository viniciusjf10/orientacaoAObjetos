import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstratoTeste {

    @Test
    public void atualizarVitoriaAbstrato()
    {
        Charles objCharles = new Charles();
        objCharles.setNumeroVitorias(5);
        objCharles.AjusteVitorias();
        assertEquals(8,objCharles.getNumeroVitorias());
    }

}
