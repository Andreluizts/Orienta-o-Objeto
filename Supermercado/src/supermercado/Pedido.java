package supermercado;

import java.util.ArrayList;

public class Pedido {

    ArrayList<Item> itens;
    Pagamento pagamento;

    public Pedido(ArrayList<Item> itens, Pagamento pagamento) {
        this.itens = itens;
        this.pagamento = pagamento;
    }

}
