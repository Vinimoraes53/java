package petshopjava;

public final class Login {
	
	private static Login instance;
	private static Menu menus = new Menu();
	private static Usuarios usuarios = Usuarios.getInstance();
	private Usuario usuarioLogado;
		
	public void exibeLogin() {
    while (true) {
        menus.exibeBoasVindas();
        System.out.println("+ 1 - Fazer login ------------+");
        System.out.println("+ 2 - Sair ------------------+");
        System.out.println("===============================");
        System.out.print("Escolha uma opção: ");
        String escolha = new java.util.Scanner(System.in).nextLine();

        if (escolha.equals("1")) {
            String matricula = menus.getDadoMenu("Matricula");
            String senha = menus.getDadoMenu("Senha");
            boolean retornoLogin = this.realizaLogin(matricula, senha);

            if (retornoLogin) {
                if (this.usuarioLogado.getTipo().equals("Gerente")) {
                    menus.menuGerente();
                } else if (this.usuarioLogado.getTipo().equals("Vendedor")) {
                    menus.menuVendedor();
                }
            }

        } else if (escolha.equals("2")) {
            System.out.println("Encerrando o sistema...");
            System.exit(0);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}

	
	public boolean realizaLogin(String matricula, String senha) {
		
		Usuario usuario = usuarios.checkCredenciais(matricula, senha);
		
		if(usuario != null) {
			this.usuarioLogado = usuario;
			System.out.println("Login realizado com sucesso!!!");
			return true;
		}
		System.out.println("Credenciais inválidas");
		return false;
		
	}

	public Usuario getUsuariologado() {
		return usuarioLogado;
	}

	public void setUsuariologado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	
	public static Login getInstance() {
        if (instance == null) {
        	instance = new Login();
        }
        return instance;
    }
	
	
}
    
    
