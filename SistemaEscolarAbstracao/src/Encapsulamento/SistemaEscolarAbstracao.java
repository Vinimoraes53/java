
package Encapsulamento;



public class SistemaEscolarAbstracao {

  
    public static void main(String[] args) {
       Pessoa func1 = new Pessoa ("Maria", "da Silva", 30, "99999999999");
        System.out.println(func1.nome);
        System.out.println(func1.sobrenome);
        System.out.println(func1.idade);
        System.out.println(func1.Saudacao());
        System.out.println(func1.getCpf());
        func1.setCpf("77777777777");
        System.out.println(func1.getCpf());
    }
    
}
