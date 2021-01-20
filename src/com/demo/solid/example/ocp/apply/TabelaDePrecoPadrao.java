package com.demo.solid.example.ocp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.ocp
 * @since 08/01/2021
 */
public class TabelaDePrecoPadrao implements TabelaDePreco{

    public double calcula(double valor) {
        if(valor>5000) return 0.03;
        if(valor>1000) return 0.05;
        return 0;
    }
}
