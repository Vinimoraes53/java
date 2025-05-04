
package Heranca;





public class SistemaEscolarAbstracao {

  
    public static void main(String[] args) {
        
        Aluno pessoa1 = new Aluno ("Maricota", "Silva", 16, "99999999999", "2ª", "B");
        Professor pessoa2 = new Professor("João", "Pereira",40,"88888888888","História",20);
        
        System.out.println(pessoa1.Saudacao());
        System.out.println(pessoa1.serie);
        System.out.println(pessoa1.turma);
        System.out.println(pessoa2.Saudacao());
        System.out.println(pessoa2.disciplina);
        System.out.println(pessoa2.horas);
    }
    
}
