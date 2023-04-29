/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.provavalidacao.logicabanco;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;


public abstract class Conta {
    private Titular titular;
    private double saldo;
    private List<Operacao> historico;

    public Conta(Titular titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.add(new Operacao("Saque", valor));
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add(new Operacao("Depósito", valor));
    }

    public boolean pagarOnline(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.add(new Operacao("Pagamento online", valor));
            return true;
        }
        return false;
    }

    public List<Operacao> getHistorico() {
        return historico;
    }

    public abstract String getTipoConta();

    public abstract boolean podePagarOnline();

    public abstract boolean permiteSaldoNegativo();

    public abstract double getLimiteNegativo();

    public abstract double getTaxaSaque();
}




