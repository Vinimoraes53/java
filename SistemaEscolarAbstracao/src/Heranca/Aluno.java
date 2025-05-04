
package Heranca;


public class Aluno extends Pessoa {
    
    public String serie;
    public String turma;
    
    public Aluno(String nome, String sobrenome, int idade, String cpf, String serie, String turma) {
        super(nome, sobrenome, idade, cpf);
        this.serie = serie;
        this.turma = turma;
    }
    
}
