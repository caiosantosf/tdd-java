package br.unifacef.aula.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculoServiceTest {
	
	private CalculoService calculoService;
	
	@Before
	public void init() {
		this.calculoService = new CalculoService();
	}
	
	@Test
	public void deveSomarPositivos() {
		Integer valorEsperado = 15;
		assertEquals(valorEsperado, this.calculoService.somar(7, 8));
	}
	
	@Test
	public void deveSomarNumerosInteiros() {
		Integer valorEsperado = 15;
		assertEquals(valorEsperado, this.calculoService.somar(20,-5));
	}
	
	@Test
	public void deveRetornarOMaiorQuandoPrimeiroMaiorSegundo() {
		Integer valorEsperado = 20;
		assertEquals(valorEsperado, this.calculoService.maior(20,-5));
	}
	
	@Test
	public void deveRetornarOMaiorQuandoPrimeiroMenorSegundo() {
		Integer valorEsperado = 30;
		assertEquals(valorEsperado, this.calculoService.maior(20,30));
	}
	
	@Test
	public void deveRetornarZeroQuandoIgual() {
		Integer valorEsperado = 0;
		assertEquals(valorEsperado, this.calculoService.maior(20,20));
	}
}
