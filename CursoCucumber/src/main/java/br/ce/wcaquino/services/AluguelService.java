package br.ce.wcaquino.services;

import java.util.Calendar;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, String tipo) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		if ("extendido".equals(tipo)) {
			nota.setPreco(filme.getAlguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
			nota.setPontuacao(2);

		} else {
			nota.setPreco(filme.getAlguel());
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
			nota.setPontuacao(1);
		}

		filme.setEstoque(filme.getEstoque() - 1);

		return nota;
	}
}