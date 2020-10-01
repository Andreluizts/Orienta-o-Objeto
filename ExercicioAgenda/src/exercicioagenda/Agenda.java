package exercicioagenda;

import java.util.*;

public class Agenda {

    public static void main(String[] args) {

        String name;
        int num;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de contatos desejados na agenda");
        num = teclado.nextInt();

        Contato[] agenda = new Contato[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Nomeie um novo contato:");
            name = teclado.next();
            System.out.println("Numero do novo Contato:");
            int n = teclado.nextInt();
            agenda[i] = new Contato(name, n);

        }
        //Print dos Nomes e Numeros na Agenda
        /*for (int i = 0; i < num; i++){
           
         System.out.println("Contato: "+agenda[i].nome+" numero: "+agenda[i].numero);
         
      }*/

    }

}
