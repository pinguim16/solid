package com.demo.solid.example.ocp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.ocp
 * @since 08/01/2021
 */
public class Frete implements Entrega {

    public double calcula(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
