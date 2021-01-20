package com.demo.solid.example2.service.reajuste;

import com.demo.solid.example2.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Cesar
 * @see com.demo.solid.example2
 * @since 15/01/2021
 */
public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalariodoFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v-> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
