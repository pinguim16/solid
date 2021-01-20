package com.demo.solid.example.dip.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class Fatura {
    private double valorMensal;
    private String cliente;

    public Fatura() {}

    public Fatura(double valorMensal, String cliente) {
        this.valorMensal = valorMensal;
        this.cliente = cliente;
    }
    public double getValorMensal() {
        return valorMensal;
    }
    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
