package com.demo.solid.example2.service.reajuste;

import com.demo.solid.example2.exception.ValidacaoException;
import com.demo.solid.example2.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Cesar
 * @see com.demo.solid.example2.service
 * @since 15/01/2021
 */
public class ValidaPeriocidadeEntreReajustes implements ValidacaoReajuste {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoAjuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoAjuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses !");
        }
    }

}
