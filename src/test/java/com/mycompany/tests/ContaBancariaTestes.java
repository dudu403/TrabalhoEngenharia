
package com.mycompany.tests;

import com.provavalidacao.logicabanco.Conta;
import com.provavalidacao.logicabanco.ContaCorrente;
import com.provavalidacao.logicabanco.ContaPoupanca;
import com.provavalidacao.logicabanco.ContaSalario;
import com.provavalidacao.logicabanco.Historico;
import com.provavalidacao.logicabanco.Operacao;
import com.provavalidacao.logicabanco.Titular;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContaBancariaTestes {
    
    public class BancoTest{
        private Conta ContaPoupanca;
    }
   
//    @BeforeAll
//    public void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
    
    @BeforeEach
    public void setUp() {
        Titular Titular = new Titular("Eduardo", "Rua");
        ContaSalario contaSalario = new ContaSalario(Titular);
        ContaCorrente contaCorrente = new ContaCorrente(Titular, 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(Titular);
        
        Operacao operacao1 = new Operacao("Depósito", 1000.00);
        Operacao operacao2 = new Operacao("Saque", 100.00);
        Operacao operacao3 = new Operacao("Deposito", 500.00);
        Operacao operacao4 = new Operacao("Pagamento online", 200.00);
        
        Historico historico = new Historico(Titular);
        
    }
    
    @Test
    public void TestOperacao(){
        Operacao operacao = new Operacao("Depósito", 1000);
        assertEquals("Depósito", operacao.getNome());
        assertEquals(1000.00, operacao.getValor(), 0.001);
        
    }
    
    @Test
    public void TestContaPoupanca(){
        Titular Titular = new Titular("Eduardo", "Rua tal");
        ContaPoupanca contaPoupanca = new ContaPoupanca(Titular);
        contaPoupanca.depositar(100);
        assertEquals(100, contaPoupanca.getSaldo(), 0.001);
        contaPoupanca.depositar(50);
        assertEquals(150, contaPoupanca.getSaldo(), 0.001);
    }
    
    @Test
    public void TestContaSalario(){
        Titular Titular = new Titular("João", "Rua x");
        
        ContaSalario contaSalario = new ContaSalario(Titular);
        contaSalario.depositar(500.00);
        
        assertEquals(500.00, contaSalario.getSaldo(), 0.001);
        assertTrue(contaSalario.pagarOnline(100.00));
        
        assertEquals(400.00, contaSalario.getSaldo(), 0.001);
        contaSalario.sacar(300.00);
        assertEquals(100.00, contaSalario.getSaldo(), 0.001);
        
    }
    
    @Test
    public void TestSacarContaSalario(){
        Titular Titular = new Titular("Vasco", "Av Roberto Dinamite Nº10");
        ContaSalario contaSalario = new ContaSalario(Titular);
        contaSalario.depositar(1000);
        contaSalario.sacar(500);
        assertEquals(500, contaSalario.getSaldo(), 0.001);
        contaSalario.sacar(1000);
        assertEquals(500, contaSalario.getSaldo(), 0.001); 
    }
    
    @Test
    public void TestSacarContaCorrete(){
        Titular Titular = new Titular("Allan", "Centro");
        
        ContaCorrente contaCorrente = new ContaCorrente(Titular, 1000);
        contaCorrente.depositar(1000);
        contaCorrente.sacar(500);
        assertEquals(500, contaCorrente.getSaldo());
        contaCorrente.sacar(500);
        assertEquals(0, contaCorrente.getSaldo(), 0.001);
        assertFalse(contaCorrente.sacar(500));
        assertEquals(0, contaCorrente.getSaldo(), 0.001);
    }
    @Test
    public void TesteContaPoupancaSaldoNegativo(){
        Titular Titular = new Titular("Eduardo", "Centro");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(Titular);
        contaPoupanca.depositar(1000);
        
        assertFalse(contaPoupanca.sacar(2000));
        assertEquals(1000, contaPoupanca.getSaldo(), 0.001);
        
        assertTrue(contaPoupanca.sacar(1000));
        assertEquals(0, contaPoupanca.getSaldo(), 0.001);
        
        assertFalse(contaPoupanca.sacar(500));
        assertEquals(0, contaPoupanca.getSaldo(), 0.001);
        
        assertFalse(contaPoupanca.sacar(100));
        assertEquals(0, contaPoupanca.getSaldo(), 0.001);
        
        contaPoupanca.depositar(600);
        assertEquals(600, contaPoupanca.getSaldo(), 0.001);
    }
    
    @Test
    public void TesteContaCorrenteSaldoNegativo(){
        Titular Titular = new Titular("Eduardo", "Centro");
        
        ContaCorrente contaCorrente = new ContaCorrente(Titular, 1000);
        
        assertFalse(contaCorrente.sacar(500));
        assertEquals(0, contaCorrente.getSaldo());
        
        assertFalse(contaCorrente.sacar(800));
        assertEquals(0, contaCorrente.getSaldo());
        
        assertFalse(contaCorrente.sacar(1000));
        assertEquals(0, contaCorrente.getSaldo());
        
        
    }
    
    
    @Test
    public void TestContaCorrente(){
        Titular Titular = new Titular("Fábio", "Rua yxz");
        ContaCorrente contaCorrente = new ContaCorrente(Titular, 500);
        contaCorrente.depositar(500);
        
        assertEquals(500.00, contaCorrente.getSaldo(), 0.001);
        assertFalse(contaCorrente.sacar(2000.00));
        
        assertEquals(500.00, contaCorrente.getSaldo(), 0.001);
        assertFalse(contaCorrente.sacar(1400.00));
        assertEquals(500.00, contaCorrente.getSaldo(), 0.001);
 
    }
    
    @AfterEach
    public void tearDown() {
    }
}
