/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.provavalidacao.logicabanco;

/**
 *
 * @author alunolages
 */
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private Titular titular;
    private double saldo;
    private List<Operacao> historico;

    public ContaBancaria(Titular titular) {
        this.titular = titular;
        this.saldo = 0;
        this.historico = new ArrayList<>();
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
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
        return false;
    }

    public List<Operacao> getHistorico() {
        return historico;
    }
}

