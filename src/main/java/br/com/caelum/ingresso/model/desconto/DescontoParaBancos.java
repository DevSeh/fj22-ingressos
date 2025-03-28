package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.subtract(trintaPorCento(precoOriginal));
	}
	private BigDecimal trintaPorCento(BigDecimal precoOriginal) {
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}
	@Override
	public String getDescricao() {		
		return "Correntista";
	}
	
}
