package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.Algoritmo.*;


public class AnexoDAO extends TesteAnexoDao{
	
	public AnexoDAO(CriarDao criarDao, LerDao lerDao, ExcluirDao excluirDao, AlterarDao alterarDao){
        this.criarDao = criarDao;
        this.lerDao = lerDao;
        this.excluirDao = excluirDao;
        this.alterarDao = alterarDao;
    }
}
