
package petshopjava;

import java.util.Arrays;


public class PetShopJava {

    
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        Usuario manuel = usuarios.adicionaUsuario("Manuel","123","123","gerente");
        Usuario edval = usuarios.adicionaUsuario("Edval", "1234", "1234", "vendedor");
        Usuario bruno = usuarios.adicionaUsuario("Bruno", "321", "321", "vendedor");
        System.out.println(manuel.getMatricula());
        System.out.println(edval.getMatricula());
        System.out.println(bruno.getMatricula());
        System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
        usuarios.removeUsuario("321");
        System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
    }
    
}
