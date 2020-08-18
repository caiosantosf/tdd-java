package br.unifacef.aula.service;

public class CalculoService {

	public Integer somar(final Integer a, final Integer b) {
		return (a + b);
	}
	
	public Integer maior(final int a, final int b) {
		if (a > b) return a;
		if (a < b) return b;
		return 0;
	}
}
