/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.provavalidacao.logicabanco;

/**
 *
 * @author alunolages
 */
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Operacao {
    private String nome;
    private double valor;
    private LocalDateTime dataHora;

    public Operacao(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}


