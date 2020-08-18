package br.unifacef.aula.service;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.unifacef.aula.dao.VendaDAO;
import br.unifacef.aula.dbo.Venda;

@RunWith(MockitoJUnitRunner.class)
public class VendaServiceTest {
	
	@Mock
	private VendaDAO vendaDAO;
	
	@Test
	public void deveriaSalvarUmaNovaVenda() {
		Venda vendaEsperadaMock = new Venda();
		vendaEsperadaMock.setId(123);
		vendaEsperadaMock.setVendedor("André");
		vendaEsperadaMock.setValor(new BigDecimal(1999));
				
		Venda novaVenda = new Venda();
		novaVenda.setValor(new BigDecimal(1000));
		novaVenda.setVendedor("Jacaré");
		
		Mockito.when(vendaDAO.salvarVenda(novaVenda)).thenReturn(vendaEsperadaMock);
		
		VendaService vendaService = new VendaService(vendaDAO);
		
		Venda vendaRegistrada = vendaService.salvarVenda(novaVenda);
		
		System.out.println(vendaRegistrada);
		
		assertNotNull(vendaRegistrada);
		assertNotNull(vendaRegistrada.getId());
	}
}
