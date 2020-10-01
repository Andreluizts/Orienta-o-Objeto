
package exerciciopessoa;


public class Pessoa{

    String nome;
    int idade;
    //float altura;
    
    public Pessoa(String nome, int idade){
        
       this.nome = nome;
       this.idade = idade;
    }
    
    /*public Pessoa(String nome, int idade, float altura){
        
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
    }*/
    
    
    public void aniversario(){
            
        this.idade++;

}
    public static void main(String[]args){
        
        /*Pessoa cara2 = new Pessoa("Jonas",23,1.02f);
        System.out.println(cara2.altura);*/
        Pessoa cara = new Pessoa("Joaozinho",23);
        
        System.out.println("O nome do cara é: "+ cara.nome);
        for (int i = 0; i  <10 ; i++){
            
            
            System.out.println("Idade atual: "+ cara.idade);
            cara.aniversario();
        
        }
        
    
    
    }
}
    
    
    