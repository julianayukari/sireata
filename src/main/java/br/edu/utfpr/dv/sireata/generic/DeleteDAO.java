package br.edu.utfpr.dv.sireata.generic;

import java.sql.SQLException;

public interface DeleteDAO {
	public void delete(int id) throws SQLException;
}
