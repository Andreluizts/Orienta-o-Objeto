package supermercado;

import java.util.ArrayList;

public class Supermercado {

    String nome;
    ArrayList<Item> estoque;

    public Supermercado(String nome, ArrayList<Item> estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

}
