
package Polimofirsmo;




public class Aluno extends Pessoa implements IPessoa {
    
    public String serie;
    public String turma;
    
    public Aluno(String nome, String sobrenome, int idade, String cpf, String serie, String turma) {
        super(nome, sobrenome, idade, cpf);
        this.serie = serie;
        this.turma = turma;
    }
    
    public String Saudacao (){
        return String.format("Ola, meu nome é %s %s e estou na %s serie %s", this.nome, this.sobrenome, this.serie, this.turma);
    }
    
}
