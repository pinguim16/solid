package com.demo.solid.example.lsp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.lsp.apply
 * @since 13/01/2021
 */
public class ManipuladorDeSaldo {

    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende(double taxa){
        this.saldo *= taxa;
    }

}
