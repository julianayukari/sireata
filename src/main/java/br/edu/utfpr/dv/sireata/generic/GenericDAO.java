package br.edu.utfpr.dv.sireata.generic;

import java.sql.SQLException;

public abstract class GenericDAO {
	
	 protected SaveDAO save;
	 protected DeleteDAO del;
	 
	 public int salvar(ObjectGeneric obj) throws SQLException {
		    return save.salvar(obj);
	}
	 
	public void delete(int id) throws SQLException {
		    del.delete(id);
	}
}
