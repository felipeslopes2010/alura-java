package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import junit.framework.Assert;

public class AvaliadorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void deveCalcularAMedia() {
		// parte 1: cenario
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Playstation 3 Novo");

		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 500.0));

		// parte 2: acao
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		Assert.assertEquals(400, leiloeiro.getMedia(), 0.0001);

	}
	
	@Test
	public void testaMediaDeZeroLance() {
		
		//cenario
		Usuario ewertom = new Usuario("Ewertom");
		
		//acao
		Leilao leilao = new Leilao("Iphone 7");
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		//validacao
		assertEquals(0, avaliador.getMedia(), 0.0001);
	}
}
