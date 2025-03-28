package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.TipoDeIngresso;
import junit.framework.Assert;

public class DescontoTest {
	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
		Lugar lugar = new Lugar("A",1);
		Sala sala = new Sala("Elprateado",new BigDecimal("20.5"));
		Filme filme = new Filme ("Rogue roll",Duration.ofMinutes(120),"SCIcia",new BigDecimal("12"));
		Sessao sessao = new Sessao (LocalTime.parse("10:00:00"),filme,sala);
		Ingresso ingresso = new Ingresso (sessao, TipoDeIngresso.INTEIRO,lugar);
		BigDecimal precoEsperado = new BigDecimal("32.50");
		Assert.assertEquals(precoEsperado,ingresso.getPreco());
		
	}
 }
