package com.demo.solid.example.encap.notapply;

import java.util.ArrayList;
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
        return pagamentos;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
