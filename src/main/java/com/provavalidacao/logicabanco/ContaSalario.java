/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.provavalidacao.logicabanco;

/**
 *
 * @author alunolages
 */
public class ContaSalario extends Conta {

    public ContaSalario(Titular titular) {
        super(titular);
    }

    @Override
    public String getTipoConta() {
        return "Conta Salário";
    }

    @Override
    public boolean podePagarOnline() {
        return false;
    }

    @Override
    public boolean permiteSaldoNegativo() {
        return false;
    }

    @Override
    public double getLimiteNegativo() {
        return 0.0;
    }

    @Override
    public double getTaxaSaque() {
        return 0.0;
    }
 
}

