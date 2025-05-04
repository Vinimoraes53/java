
package petshopjava;

import java.util.ArrayList;
import java.util.List;


public final class Usuarios {
    private List<Usuario> usuarios;
    
    private static Usuarios instace;
    public Usuarios(){
        this.usuarios = new ArrayList<>();
        Usuario manuel = new Usuario ("Manuel", "123", "123", "gerente");
        usuarios.add(manuel);
    }
    
    //Método Adicionar usuário
    public Usuario adicionaUsuario(String nome, String matricula, String senha, String tipo){
        Usuario usuario = new Usuario(nome, matricula, senha, tipo);
        usuarios.add(usuario);
        System.out.println("Usuário foi cadastrado com sucesso!");
        return usuario;
    }
    //Método para indexar a matrícula
    public int indexof(String matricula){
        for(int i = 0; i < usuarios.size();i++){
            if(usuarios.get(i).getMatricula().equals(matricula)){
                return i;
            }
        }
        return -1;
    }
    
     public Usuario checkCredenciais(String matricula, String senha){
         for(int i = 0; i < usuarios.size();i++){
             if(usuarios.get(i).getMatricula().equals(matricula)){
                 if(usuarios.get(i).getClass().equals(senha)){
                     return usuarios.get(i);
                 }
             }
         }
         return null;
     }
    //Método para remover o usuário
    public void removeUsuario(String matricula){
        int indice = this.indexof(matricula);
        if(indice != -1){
            usuarios.remove(indice);
            System.out.println("Usuário removido com sucesso!");
        }else{
            System.out.println("Usuário não foi encontrado");
        }
    }
    //Método para listar os atuais usuários
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public static Usuarios getInstance(){
        if (instace == null){
            instace = new Usuarios ();
        }
        return instace;
    }
   
}
