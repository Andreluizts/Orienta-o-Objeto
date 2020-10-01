package porta;

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

    public static void main(String[] args) {

        Porta portinha = new Porta("Amarela", true, 2.02f, 1.05f);
        portinha.cor = "Rosa";
        portinha.estaAberta();
        System.out.println(portinha.cor);
        System.out.println(portinha.altura);
        System.out.println(portinha.largura);

    }
}
