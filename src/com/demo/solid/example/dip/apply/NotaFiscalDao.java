package com.demo.solid.example.dip.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class NotaFiscalDao implements AcaoNotaFiscal {

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
