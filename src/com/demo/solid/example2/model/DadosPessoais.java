package com.demo.solid.example2.model;

import java.math.BigDecimal;

/**
 * @author Cesar
 * @see com.demo.solid.example2.model
 * @since 16/01/2021
 */
public class DadosPessoais {

    private String nome;

    private String cpf;

    private Cargo cargo;

    private BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
