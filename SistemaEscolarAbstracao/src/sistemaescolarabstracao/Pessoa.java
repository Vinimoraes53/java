
package sistemaescolarabstracao;

public class Pessoa {
       String nome;
       String sobrenome;
       int idade;
       
       Pessoa(String nome, String sobrenome, int idade){
           this.nome = nome;
           this.sobrenome = sobrenome;
           this.idade = idade;  
       }
       
       public String Saudacao(){
           return String.format("Ola, meu nome é %s %s", this.nome, this.sobrenome);
       }
}
