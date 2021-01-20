package com.demo.solid.example.srp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.apply
 * @since 06/01/2021
 */
public class QuinzeOuVinteCincoPorcento implements RegraCalcula {

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
