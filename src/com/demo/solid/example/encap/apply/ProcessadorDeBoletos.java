package com.demo.solid.example.encap.apply;

import java.util.List;

/**
 * @author Cesar
 * @see com.demo.solid.example.encap
 * @since 12/01/2021
 */
public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);
        }
    }
}
