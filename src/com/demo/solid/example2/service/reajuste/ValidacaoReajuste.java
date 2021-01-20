package com.demo.solid.example2.service.reajuste;

import com.demo.solid.example2.model.Funcionario;

import java.math.BigDecimal;

/**
 * @author Cesar
 * @see com.demo.solid.example2.service
 * @since 15/01/2021
 */
public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
