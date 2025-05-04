
package petshopjava;
import java.util.Scanner;

public final class Login {
    private static Login instance;
    private Usuario usuariologado;
    public Usuarios usuarios = Usuarios.getInstance();
    Scanner scanner = new Scanner(System.in);
    
    public void exibeLogin(){
        while(true){
            System.out.println("=============================");
            System.out.println("+ Bem-vindo ao Java PETSHOP +");
            System.out.println("+ ------------------------- +");
            System.out.println("+ ------------------------- +");
            System.out.println("+ Matricula --------------- +");
            String matricula = scanner.next();
            System.out.println("+ Senha ------------------- +");
            String senha = scanner.next();
            realizaLogin(matricula,senha);
        }
    }
    
    public boolean realizaLogin(String matricula, String senha){
        Usuario usuario = usuarios.checkCredenciais(matricula, senha);
        if (usuario != null){
            this.usuariologado = usuario;
            System.out.println("Login realizado com sucesso!!!");
            return true;
        }
        System.out.println("Credenciais são invalidas.");
        return false;
    }
    
    public static Login getInstance(){
        if(instance == null){
            instance = new Login();
        }
        return instance;
    }

    public Usuario getUsuariologado() {
        return usuariologado;
    }

    public void setUsuariologado(Usuario usuariologado) {
        this.usuariologado = usuariologado;
    }
}
