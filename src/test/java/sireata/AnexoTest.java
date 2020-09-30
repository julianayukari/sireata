package sireata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.utfpr.dv.sireata.model.Anexo;

public class AnexoTest {
	
	Anexo anexo = new Anexo();
	
	@Before
	void testeSet(){
		anexo.setDescricao("teste");
		
	}
	
	@Test
	public void test() {
		assertEquals("teste", anexo.getDescricao());
	}

}
