package br.unifacef.aula.dbo;

import java.math.BigDecimal;

public class Venda {
	private Integer id;
	private BigDecimal valor;
	private String vendedor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", valor=" + valor + ", vendedor=" + vendedor + "]";
	}
}
