package br.com.martsystem.laplata.model;

import java.time.LocalDateTime;

public final class Negociacoes {
	
	private final double preco;
	private final int quantidade;
	private final LocalDateTime data;
	
	public Negociacoes(double preco, int quantidade, LocalDateTime data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public LocalDateTime getData() {
		return data;
	}

}
