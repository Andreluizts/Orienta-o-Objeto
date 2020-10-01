package lampada;

public class Lampada {

    Estado estado;

    public Lampada(Estado estado) {
        this.estado = estado;

    }

    public boolean estaAcesa() {

        return estado != Estado.APAGADA;
    }

}
