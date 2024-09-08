import org.example.CoreMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MockTest {
    public CoreMock msj;
    @Test
    public void coreTest(){
        msj = new CoreMock();
        String esperado = "Msj desde Class-room-core";
        assertEquals(esperado, msj.msjMock());
    }

}
