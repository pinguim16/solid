package com.demo.solid.example.lsp.apply;

import java.util.Arrays;
import java.util.List;

/**
 * @author Cesar
 * @see com.demo.solid.example.lsp
 * @since 13/01/2021
 */
public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
    }

    private static ContaComum contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}

