package questao_lampada;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteLampada {
	Lampada lampada = new Lampada();

	@Test
	public void teste1() {
		lampada.getLiga();
		assertTrue(lampada.getLiga() == false);

	}
}
