package com.demo.solid.example.encap.apply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Cesar
 * @see com.demo.solid.example.encap
 * @since 12/01/2021
 */
public class Fatura {

    private String cliente;

    private double valor;

    private List<Pagamento> pagamentos;

    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        if(valorTotaldePagamentos() > this.valor){
            this.pago = true;
        }
    }

    private double valorTotaldePagamentos() {
        double total = 0;
        for(Pagamento p : this.pagamentos){
            total += p.getValor();
        }
        return total;
    }
}
