package com.demo.solid.example.dip.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class EnviadorDeEmail implements AcaoNotaFiscal {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
