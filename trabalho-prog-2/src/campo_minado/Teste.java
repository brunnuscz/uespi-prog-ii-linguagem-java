package campo_minado;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class Teste {

	Jogador dd = new Jogador();
	Coordenada t = new Coordenada();

	@Test
	public void teste1() {
		dd.setNomeJogador("Bruno");
		assertTrue(dd.getNomeJogador().equals("Bruno"));
	}

	@Test
	public void teste2() {
		t.setLinhaTam(3);
		t.setColunaTam(9);
		assertTrue(t.getLinhaTam() < 8);
		assertFalse(t.getColunaTam() < 8);
	}

}
