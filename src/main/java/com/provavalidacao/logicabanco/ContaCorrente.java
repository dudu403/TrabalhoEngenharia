
package com.provavalidacao.logicabanco;


public class ContaCorrente extends Conta {
    private double limiteNegativo;

    public ContaCorrente(Titular titular, double limiteNegativo) {
        super(titular);
        this.limiteNegativo = limiteNegativo;
    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }

    @Override
    public boolean podePagarOnline() {
        return true;
    }

    @Override
    public boolean permiteSaldoNegativo() {
        return true;
    }

    @Override
    public double getLimiteNegativo() {
        return limiteNegativo;
    }

    @Override
    public double getTaxaSaque() {
       return 0.0;
    }

}

