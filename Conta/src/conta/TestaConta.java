package conta;

import java.util.Calendar;

public class TestaConta {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        Conta teste = new Conta("Joaozinho", 123456, 1234, 10000.50f, calendario);

        //TESTA SAQUE
        /*
        System.out.println("Saldo Atual: "+ teste.saldo);
        teste.sacar(150.50f);
        System.out.println("Novo Saldo: "+ teste.saldo);
         */
        //TESTA DEPOSITO
        /*
        System.out.println("Saldo Atual: "+ teste.saldo);
        teste.depositar(150.40f);
        System.out.println("Novo Saldo: "+ teste.saldo);
         */
        //TESTA RENDIMENTO
        System.out.println("Saldo Atual: " + teste.saldo);
        teste.calculaRendimento();

    }

}
