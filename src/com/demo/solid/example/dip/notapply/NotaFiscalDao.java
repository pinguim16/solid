package com.demo.solid.example.dip.notapply;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class NotaFiscalDao {
    public void persiste(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
