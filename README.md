# TrabalhoEngenharia
Desenvolver a lógica por trás de um sistema bancário, onde os seguintes requisitos devem ser resolvidos:

* Deve ser possível criar contas bancárias, onde pode ser conta salário (opção 1), conta corrente (opção 2) e poupança (opção 3).
* Todas as contas possuem um objeto titular contendo nome e endereço. Toda conta possui saldo e as operações de sacar (algum valor), depositar (algum valor) e pagar online (algum valor). Desta forma, os setters de saldo não existem (setSaldo deve ser removido pela inserção dos métodos de sacar e depositar).
* Somente a conta corrente permite ficar com saldo negativo em caso de operações que ultrapassem o atual saldo. Lembrando que devem possuir como propriedade um limite para operações com saldo negativo. Quando ultrapassar o limite, deve bloquear a operação pretendida retornando falso (fundos insuficientes).
* Conta salário não pode permitir pagamentos online.
* Poupanças possuem uma taxa de saque de 0,05%.
* Implemente uma classe Operação que possui nome da operação, valor operado e a data com hora. Depois implemente uma classe Histórico onde deve conter um objeto titular e uma lista com operações. Na classe Histórico deverá possuir um método de busca para retornar por uma operação em específico e um outro método com pesquisa por valores (se desejar, poderá implementar tudo em um método somente).


# Cálculo de Complexidade Ciclomática

* Conta : sacar = 2 CCS
* Conta : pagarOnline = 2 CCS
* ContaBancaria : sacar = 2 CCS
* Historico : buscarOperacao = 3 CCS
* Historico : buscarOperacaoPorValor = 3 CCS



