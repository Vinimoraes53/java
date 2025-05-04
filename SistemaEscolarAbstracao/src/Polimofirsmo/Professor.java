
package Polimofirsmo;




public class Professor extends Pessoa implements IPessoa {
    
    public String disciplina;
    public int horas;
    
    public Professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
        super(nome, sobrenome, idade, cpf);
        this.disciplina = disciplina;
        this.horas = horas;
    }
    
    public String Saudacao (){
        return String.format("Ola, meu nome é %s %s e sou professor de %s", this.nome, this.sobrenome, this.disciplina);
    }
    
}
