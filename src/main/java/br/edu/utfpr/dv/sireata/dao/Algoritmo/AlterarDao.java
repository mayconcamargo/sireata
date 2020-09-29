package br.edu.utfpr.dv.sireata.dao.Algoritmo;


import java.sql.SQLException;


public interface AlterarDao {
 
	public int alterar(int id, Object novoObjeto) throws SQLException;
}
