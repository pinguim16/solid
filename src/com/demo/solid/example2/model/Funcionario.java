package com.demo.solid.example2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario  {

	private DadosPessoais dadosPessoais;

	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
		this.dadosPessoais = dadosPessoais;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
}
