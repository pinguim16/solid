package com.demo.solid.example.ocp.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.ocp
 * @since 08/01/2021
 */
public class CalculadoraDePrecos {

    public double calcula(Compra produto) {
        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
