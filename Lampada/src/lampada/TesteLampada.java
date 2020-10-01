package lampada;

public class TesteLampada {

        public static void main(String[] args) {
            // Inicializa duas Lampadas
            Lampada lampada1 = new Lampada(Estado.ACESA);
            Lampada lampada2 = new Lampada(Estado.APAGADA);
            
            // Acende uma Lampada e Apaga outra
            lampada2.estado = Estado.ACESA;
            lampada1.estado = Estado.APAGADA;
            
            //Testa as Lampadas
            System.out.println( "A lâmpada 1 está " + ( lampada1.estaAcesa() ? "acesa" : "apagada" ) + "." );
            System.out.println( "A lâmpada 2 está " + ( lampada2.estaAcesa() ? "acesa" : "apagada" ) + "." );
          
                   
    }
    
    
}
