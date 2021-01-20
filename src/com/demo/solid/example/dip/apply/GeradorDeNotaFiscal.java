package com.demo.solid.example.dip.apply;

import java.util.List;

/**
 * @author Cesar
 * @see com.demo.solid.example.dip.notapply
 * @since 07/01/2021
 */
public class GeradorDeNotaFiscal {

    private List<AcaoNotaFiscal> acoes;

    public GeradorDeNotaFiscal(List<AcaoNotaFiscal> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        //Padrão Observer sendo implementado
        for (AcaoNotaFiscal acao: acoes) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }


}
