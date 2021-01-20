package com.demo.solid.example.lsp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.lsp
 * @since 13/01/2021
 */
public class ContaDeEstudante extends ContaComum {

    private int milhas;

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaDeEstudante() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
}
