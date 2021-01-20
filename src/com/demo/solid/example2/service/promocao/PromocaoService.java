package com.demo.solid.example2.service.promocao;

import com.demo.solid.example2.exception.ValidacaoException;
import com.demo.solid.example2.model.Cargo;
import com.demo.solid.example2.model.Funcionario;

/**
 * @author Cesar
 * @see com.demo.solid.example2.service.promocao
 * @since 15/01/2021
 */
public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == funcionario.getCargo()){
            throw new ValidacaoException("Gerentes não podem ser promovidos !");
        }

        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else{
            throw new ValidacaoException("Funcionário não bateu a meta !");
        }
    }

}
