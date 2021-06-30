import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConstrutoresTeste {

    @Test
    public void construtorW()
    {
        W012 objW = new W012(870,0.05f,350);
        assertEquals(306.5f,objW.calculaVMaxReal());
    }

    @Test
    public void construtorMCL()
    {
        MCL35M objMCL = new MCL35M(900,0.1f,345);
        assertNotEquals(0,objMCL.calculaVMaxReal());
    }


}
