package ed23_Entrega;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class GeneradorIpTest {
	GeneradorIp generadorIp = new GeneradorIp();
	
	@RepeatedTest(10)
	public void testGenerarNumero() {
            int target = generadorIp.generarNumero(0, 254);
            Assertions.assertTrue(target >= 0 && target <= 254, "El número generado no está dentro del rango permitido");
	}

	@Test
	public void testGenerarIp() {
		for (int i = 0; i < 1000; i++) {
            String target = generadorIp.generarIp();
            String expectedStart = "0";
            String expectedEnd = "0";
            int posicionPunto = target.lastIndexOf(".");
            Assertions.assertFalse(target.startsWith(expectedStart),
                    "La IP comienza con " + expectedStart );
            Assertions.assertFalse(target.endsWith(expectedEnd)&& target.substring(posicionPunto).length()==1,
                    "La IP termina con " + expectedEnd );
        }
	}

}
