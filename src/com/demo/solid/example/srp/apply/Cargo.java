package com.demo.solid.example.srp.apply;

/**
 * @author Cesar
 * @see com.demo.solid
 * @since 06/01/2021
 */
public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private RegraCalcula regra;

    Cargo(RegraCalcula regra) {
        this.regra = regra;
    }

    public RegraCalcula getRegra() {
        return regra;
    }
}
