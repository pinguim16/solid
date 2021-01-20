package com.demo.solid.example.lsp.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.lsp
 * @since 13/01/2021
 */
public class ContaDeEstudante extends ContaComum {

    private int milhas;

    public void deposita(double valor) {
        super.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public void rende() {
        throw new RuntimeException("Não pode render");
    }
}
