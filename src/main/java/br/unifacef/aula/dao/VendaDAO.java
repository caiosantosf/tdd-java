package br.unifacef.aula.dao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.unifacef.aula.dbo.Venda;

public class VendaDAO {
	/**
	 * Método que deverá salvar a venda
	 * @param venda dados da venda a serem salvos
	 * @return objeto persistido de venda
	 */
	public Venda salvarVenda(final Venda venda) {
		if (venda != null && venda.getId() == null) {
			venda.setId(new Double(Math.random() * 100).intValue());
		}
		return venda;
	}
	
	public List<Venda> buscarVendaPorVendedor(String nome){
		Venda v1 = new Venda();
		v1.setId(1);
		v1.setVendedor(nome);
		v1.setValor(new BigDecimal(5000));
		
		Venda v2 = new Venda();
		v2.setId(166);
		v2.setVendedor(nome);
		v2.setValor(new BigDecimal(2590));
		
		return Arrays.asList(v1, v2);
	}
}
