package br.unifacef.aula.config;

import java.math.BigDecimal;

import br.unifacef.aula.dao.VendaDAO;
import br.unifacef.aula.dbo.Venda;
//import br.unifacef.aula.service.CalculoService;
import br.unifacef.aula.service.VendaService;

public class Main {

	public static void main(String...string) {
		System.out.println("app iniciando...");
		//CalculoService calculoService = new CalculoService();
		//System.out.println("Resultado: " + calculoService.somar(3, 5));
		
		Venda novaVenda = new Venda();
		novaVenda.setValor(new BigDecimal(1000));
		novaVenda.setVendedor("Baia");
		
		VendaService vendaService = new VendaService(new VendaDAO());
		Venda vendaRegistrada = vendaService.salvarVenda(novaVenda);
		
		System.out.println(vendaRegistrada);
	}
}
