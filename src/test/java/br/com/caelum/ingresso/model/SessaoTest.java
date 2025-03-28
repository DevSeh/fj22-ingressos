package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import junit.framework.Assert;

public class SessaoTest {

	@Test
	public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoDaSalaMaisOPrecoDoFilme() {
		Sala sala =new Sala("Eldorado - IMax", new BigDecimal("22.5"));
		Filme filme = new Filme("Rogue Three",Duration.ofMinutes(120),"WIFI",new BigDecimal("12.0"));
		BigDecimal somaDosPrecosDaSalaEFilme = sala.getPreco().add(filme.getPreco());
		Sessao sessao = new Sessao (LocalTime.parse("10:00:00"),filme,sala);
		Assert.assertEquals(somaDosPrecosDaSalaEFilme, sessao.getPreco());
		
	}
	
}
