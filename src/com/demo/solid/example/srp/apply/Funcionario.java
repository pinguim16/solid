package com.demo.solid.example.srp.apply;

import java.util.Calendar;

/**
 * @author Cesar
 * @see com.demo.solid
 * @since 06/01/2021
 */
public class Funcionario {

    private int id;

    private String nome;

    private Cargo cargo;

    private Calendar dataDeAdmissao;

    private double salarioBase;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Calendar getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setDataDeAdmissao(Calendar dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calculaSalario(){
        return this.cargo.getRegra().calcula(this);
    }
}
