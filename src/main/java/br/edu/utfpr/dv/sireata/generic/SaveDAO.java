package br.edu.utfpr.dv.sireata.generic;

import java.sql.SQLException;

public interface SaveDAO {
	
	public int salvar(ObjectGeneric obj) throws SQLException;
}
