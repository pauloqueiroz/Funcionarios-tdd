package br.com.example.service;

import java.math.BigDecimal;

import br.com.example.model.Funcionario;

public class BonificacaoService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor;
	}

}
