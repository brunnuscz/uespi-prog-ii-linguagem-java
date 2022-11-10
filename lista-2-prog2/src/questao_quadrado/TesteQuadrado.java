package questao_quadrado;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteQuadrado {

	Quadrado quadrado = new Quadrado();

	@Test
	public void teste1() {
		assertTrue(quadrado.area(3) == 9);
	}
	
	@Test
	public void teste2() {
		assertFalse(quadrado.perimetro(2) == 9);
	}
}
