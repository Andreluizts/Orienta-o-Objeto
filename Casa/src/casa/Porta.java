package casa;

public class Porta {

    String cor;
    Boolean isOpen;
    float altura;
    float largura;

    public Porta(String cor, Boolean isOpen, float altura, float largura) {
        this.cor = cor;
        this.isOpen = isOpen;
        this.altura = altura;
        this.largura = largura;
    }

    public void estaAberta() {

        System.out.println("A porta está " + (this.isOpen ? "aberta" : "fechada") + ".");
    }
}
