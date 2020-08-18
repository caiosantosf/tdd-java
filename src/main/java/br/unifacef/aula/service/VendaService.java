package br.unifacef.aula.service;

import br.unifacef.aula.dao.VendaDAO;
import br.unifacef.aula.dbo.Venda;

public class VendaService {
	private VendaDAO vendaDAO;
	
	public VendaService(VendaDAO vendaDAO) {
		this.vendaDAO = vendaDAO;
	}
	
	/**
	 * Componente de negócio para validaão e 
	 * registro de uma venda
	 * @param venda dados de venda a serem validados
	 * @return Venda
	 */
	public Venda salvarVenda(Venda venda) {
		return this.vendaDAO.salvarVenda(venda);
	}
	
}
