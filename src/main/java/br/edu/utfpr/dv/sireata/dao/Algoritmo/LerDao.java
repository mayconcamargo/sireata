package br.edu.utfpr.dv.sireata.dao.Algoritmo;

import java.sql.SQLException;
import java.util.List;

public interface LerDao {
    
    public Object lerPorInt(int valor) throws SQLException;
    
    public List<Object> lerPorAta(int valor) throws SQLException;

}






