package com.demo.solid.example.ocp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.ocp
 * @since 08/01/2021
 */
public class CalculadoraDePrecos {

    private TabelaDePreco tabelaDePreco;
    private Entrega entrega;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, Entrega entrega) {
        this.tabelaDePreco = tabelaDePreco;
        this.entrega = entrega;
    }

    public double calcula(Compra produto) {
        double desconto = tabelaDePreco.calcula(produto.getValor());
        double frete = entrega.calcula(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
