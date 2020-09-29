package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.Algoritmo.*;
import java.sql.SQLException;
import java.util.List;

public abstract class TesteAnexoDao {

    protected CriarDao criarDao;
    protected LerDao lerDao;
    protected AlterarDao alterarDao;
    protected ExcluirDao excluirDao;
    
    public int criar(Object object) throws SQLException{
        return criarDao.criar(object);
    }
    
    public Object lerPorInt(int valor) throws SQLException{
        return lerDao.lerPorInt(valor);
    }
    
    public List<Object> lerPorAta(int valor) throws SQLException{
        return (List<Object>) lerDao.lerPorAta(valor);
    }
    
    public void alterar(int id, Object novoObjeto) throws SQLException{
    	alterarDao.alterar(id, novoObjeto);
    }
    
    public void excluir(int valor) throws SQLException{
    	excluirDao.excluir(valor);
    }
    
}
