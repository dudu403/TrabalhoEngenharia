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

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private Titular titular;
    private List<Operacao> operacoes;

    public Historico(Titular titular) {
        this.titular = titular;
        this.operacoes = new ArrayList<>();
    }

    public Titular getTitular() {
        return titular;
    }

    public void adicionarOperacao(Operacao operacao) {
        operacoes.add(operacao);
    }

    public Operacao buscarOperacao(String nome) {
        for (Operacao operacao : operacoes) {
            if (operacao.getNome().equals(nome)) {
                return operacao;
            }
        }
        return null;
    }

    public List<Operacao> buscarOperacoesPorValor(double valor) {
        List<Operacao> operacoesEncontradas = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            if (operacao.getValor() == valor) {
                operacoesEncontradas.add(operacao);
            }
        }
        return operacoesEncontradas;
    }
}

