package sireata;

import org.junit.Test;

import br.edu.utfpr.dv.sireata.bo.ComentarioBO;
import br.edu.utfpr.dv.sireata.model.Comentario;
import br.edu.utfpr.dv.sireata.model.Comentario.SituacaoComentario;
import junit.framework.TestCase;

public class ComentarioTest extends TestCase {
	
	Comentario situ = new Comentario();
	ComentarioBO com = new ComentarioBO();
	
	@Test
	void validar() {
		situ.setSituacao(SituacaoComentario.RECUSADO);
		situ.setComentarios("");
		try {
			com.validarDados(situ);
		}catch(Exception e) {
			assertEquals("Informe o seu comentário.", e.getMessage());
		}
	}
	
}
