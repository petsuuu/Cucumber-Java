package br.ce.wcaquino.entidades;

import java.util.Calendar;
import java.util.Date;

import cucumber.api.java.it.Data;

public class NotaAluguel {

	private int preco;
	private Date dataEntrega;
	private int pontuacao;

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		dataEntrega = time;

	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
