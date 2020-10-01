package casa;

import java.util.ArrayList;

public class Casa {

    String cor;
    ArrayList<Porta> portas;

    public Casa(String cor, ArrayList<Porta> portas) {
        this.cor = cor;
        this.portas = portas;
    }

    public int quantasPortasEstaoAberta() {

        int cont = 0;
        for (Porta porta : portas) {

            if (porta.isOpen) {
                cont++;
            }

        }
        return cont;
    }

    public static void main(String[] args) {

        ArrayList<Porta> portas = new ArrayList<>();
        portas.add(new Porta("Azul", true, 1.5f, 3.7f));
        portas.add(new Porta("Marrom", false, 2.1f, 1f));
        portas.add(new Porta("Branco", true, 2f, 1.1f));

        Casa casinha = new Casa("Branco", portas);
        casinha.portas.get(1).isOpen = true;
        System.out.println(casinha.quantasPortasEstaoAberta());
    }

}
