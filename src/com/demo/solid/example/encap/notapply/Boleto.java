package com.demo.solid.example.encap.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.encap
 * @since 12/01/2021
 */
public class Boleto {

    private double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
