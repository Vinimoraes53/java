
package petshopjava;

public class Gerente extends Usuario {
    
    Usuario usuarios;
    
     public Gerente (String nome, String matricula, String senha, String tipo){
        super(nome, matricula, senha, "Gerente");
    }
     
     public void cadastraVendedor(String nome, String matricula, String senha){
         usuarios.adcionaUsuario(nome, matricula, senha, "Vendedor");
     }
    
     public void removeUsuario(String nome, String matricula, String senha){
         usuarios.removeUsuario(matricula);
     }
}
