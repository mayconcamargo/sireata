package br.edu.utfpr.dv.sireata.dao.Algoritmo.instrucao;

import br.edu.utfpr.dv.sireata.dao.Algoritmo.ExcluirDao;
import br.edu.utfpr.dv.sireata.dao.ConnectionDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcluirAnexoDao implements ExcluirDao{

	@Override
    public void excluir(int id) throws SQLException {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = ConnectionDAO.getInstance().getConnection();
            stmt = conn.createStatement();

            stmt.execute("DELETE FROM anexos WHERE idanexo=" + String.valueOf(id));
        } finally {
            if ((stmt != null) && !stmt.isClosed()) {
                stmt.close();
            }
            if ((conn != null) && !conn.isClosed()) {
                conn.close();
            }
        }
    }
}








    
