
package com.provavalidacao.logicabanco;


public class ContaPoupanca extends Conta {
    private double TaxaSaque = 0.05;

    public ContaPoupanca(Titular titular) {
        super(titular);
    }
    public double getTaxaSaque(){
        return TaxaSaque;
    }
   
    
    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }

    @Override
    public boolean podePagarOnline() {
        return true;
    }

    @Override
    public boolean permiteSaldoNegativo() {
        return false;
    }

    @Override
    public double getLimiteNegativo() {
        return 0.0;
    }
}




