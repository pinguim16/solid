package com.demo.solid.example.dip.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class EnviadorDeEmail {
    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
