package com.demo.solid.example2.service.reajuste;

import com.demo.solid.example2.exception.ValidacaoException;
import com.demo.solid.example2.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Cesar
 * @see com.demo.solid.example2.service
 * @since 15/01/2021
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
