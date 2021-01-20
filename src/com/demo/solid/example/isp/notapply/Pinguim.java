package com.demo.solid.example.isp.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.isp.notapply
 * @since 12/01/2021
 */
public class Pinguim implements Aves {

    @Override
    public void setLocalizacao(String latitude, String longitude) {
        //faz alguma coisa
    }

    @Override
    public void setAltitude(String altitude) {
        //Interface forçando pinguim a implementar, quebrando o padrão ISP
        // pinguins não voam... (até o momento de subir esse código)
    }

    @Override
    public void renderizar() {
        //faz alguma coisa
    }
}
