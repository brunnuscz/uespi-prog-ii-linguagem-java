package questao_estoque;


import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


public class TesteEstoque {
	Estoque estoque = new Estoque();
	
	@Test 
    public void teste1(){
        estoque.mudarNome("Bruno");
        assertTrue(estoque.getNome().equals("Bruno"));
    }
	
	@Test
    public void teste2(){
        estoque.mudarQuantidadeMinima(2);
        assertTrue(estoque.getMin() == 2);
    }
}
