
package sistemaescolarabstracao;

public class SistemaEscolarAbstracao {

  
    public static void main(String[] args) {
       Pessoa func1 = new Pessoa ("Maria", "da Silva", 30);
        System.out.println(func1.nome);
        System.out.println(func1.sobrenome);
        System.out.println(func1.idade);
        System.out.println(func1.Saudacao());
        
        Pessoa func2 = new Pessoa ("José", "Oliveira", 23);
        System.out.println(func2.nome);
        System.out.println(func2.sobrenome);
        System.out.println(func2.idade);
        System.out.println(func2.Saudacao());
    }
    
}
