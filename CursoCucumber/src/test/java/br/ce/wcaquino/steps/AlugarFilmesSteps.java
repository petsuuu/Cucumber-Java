package br.ce.wcaquino.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.entidades.TipoAluguel;
import br.ce.wcaquino.services.AluguelService;
import br.ce.wcaquino.utils.DateUtils;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AlugarFilmesSteps {

	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel = TipoAluguel.COMUM;

	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	}

	@Dado("^que o preço do aluguel seja R\\$ (\\d+)$")
	public void queOPreçoDoAluguelSejaR$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		}catch(RuntimeException e) {
			erro = e.getMessage();
		}
		
	}

	@Então("^o preço do aluguel será R\\$ (\\d+)$")
	public void oPreçoDoAluguelSeráR$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreco());
	}


	@Então("^o estoque do filme será (\\d+) unidade$")
	public void oEstoqueDoFilmeSéraUnidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1, filme.getEstoque());
	}
	
	@Então("^não será possivel por falta de estoque$")
	public void nãoSeráPossivelPorFaltaDeStoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque", erro);
		
	}
	
	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOPreçoDoAluguelSejaExtendido(String tipo) throws Throwable {
	   tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? tipoAluguel.EXTENDIDO: TipoAluguel.COMUM; 
	}

	@Então("^a data de entrega será em (\\d+) dias?$")
	public void aDataDeEntregaSeráEmDias(int arg1) throws Throwable {
	  Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
	  Date dataReal= nota.getDataEntrega();
	  
	  DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	  
	  Assert.assertEquals(format.format(dataEsperada),format.format(dataReal));
	}

	@Então("^a pontuação será de (\\d+) pontos$")
	public void aPontuaçãoSeráDePontos(int arg1) throws Throwable {
	  Assert.assertEquals(arg1, nota.getPontuacao());
	}
	
}
