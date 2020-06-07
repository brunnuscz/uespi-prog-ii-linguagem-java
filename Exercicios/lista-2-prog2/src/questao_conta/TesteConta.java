package questao_conta;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteConta {
	Conta conta = new Conta();
	
	@Test
	public void teste1() {
		conta.setNomeAgencia("Caixa");
		assertTrue(conta.getNomeAgencia().equals("Caixa"));
	}
	
	@Test
	public void teste2() {
		conta.setSaldo(200);
		assertTrue(conta.getSaldo() > 0);
	}
	
}
