package com.demo.solid.example.srp.apply;

/**
 * @author Cesar
 * @see com.demo.solid.example.apply
 * @since 06/01/2021
 */
public class DezOuVintePorcento implements RegraCalcula {

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}
