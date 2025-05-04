
package Heranca;





public class Pessoa {
       public String nome;
       public String sobrenome;
       public int idade;
       private String cpf;
       
       Pessoa(String nome, String sobrenome, int idade, String cpf){
           this.nome = nome;
           this.sobrenome = sobrenome;
           this.idade = idade;  
           this.cpf = cpf;
       }
       
       public String Saudacao(){
           return String.format("Ola, meu nome é %s %s", this.nome, this.sobrenome);
       }
       
       public String getCpf(){
           return this.cpf;
       }
       
       public void setCpf(String cpf){
           this.cpf = cpf;
       }
}
