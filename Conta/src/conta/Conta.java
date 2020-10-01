package conta;

import java.util.Calendar;

public class Conta {

    String nome;
    int numero;
    int agencia;
    float saldo;
    Calendar data;

//Construtor Conta
    public Conta(String nome, int numero, int agencia, float saldo, Calendar data) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data = data;
    }
// Método Sacar

    public void sacar(float valor) {

        if (valor <= this.saldo) {

            System.out.println("O Valor " + valor + " está sendo sacado.");
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar essa transação.");
        }
    }
    // Método Depositar

    public void depositar(float valor) {

        System.out.println("O Valor " + valor + " está sendo depositado.");
        this.saldo += valor;

    }

    // Método Rendimento
    public void calculaRendimento() {

        float rendeu = this.saldo + (this.saldo * 0.1f);
        System.out.println("O rendimento previsto para o próximo mês é: " + this.saldo * 0.1f);

        System.out.println("O valor na conta após o rendimento calculado será de: " + rendeu);

    }

}

/*

Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do saldo; deposita,
para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento mensal dessa conta 
(para calcular, considere o valor do saldo multiplicado por 0.1). Implemente essa classe e teste-a, 
usando uma outra classe que tenha o main.
*/
