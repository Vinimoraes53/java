
package Heranca;


public class Professor extends Pessoa {
    
    public String disciplina;
    public int horas;
    
    public Professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
        super(nome, sobrenome, idade, cpf);
        this.disciplina = disciplina;
        this.horas = horas;
    }
    
}
