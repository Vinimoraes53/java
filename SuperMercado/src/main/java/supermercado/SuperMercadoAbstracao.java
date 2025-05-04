package supermercado;
import java.util.Scanner;

public class SuperMercadoAbstracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alimento alimento = new Alimento("001", "Arroz", 10, 25.99f, 5.0f, "10/12/2024");
        Eletronico produto = new Eletronico("002", "Celular", 5, 1500.00f, "220V", "1 ano");

        // Digitar o código do produto, e irá aparecer todas as descrições listadas acima
        System.out.println("Digite o código do alimento:");
        alimento.setCod(sc.nextLine());
        System.out.println("O código é:");
        System.out.println(alimento.getCod());

        // Descrição
        System.out.println("A descrição do produto é:");
        System.out.println(alimento.getDescricao());

        // Quantidade
        System.out.println("A quantidade do produto é:");
        System.out.println(alimento.getQuantidade());
        
        System.out.println("o preço do produto é:");
        System.out.println(alimento.getValor());

        // Peso
        System.out.println("O peso do produto é:");
        System.out.println(alimento.getPeso());

        // Validade
        System.out.println("A validade do produto é:");
        System.out.println(alimento.getValidade());

        // Equipamento
        System.out.println("======================================================");
        
        //Digitar o código do equipamento, e irá aparecer todas as descrições listadas acima
        System.out.println("Digite o Código do equipamento"); 
        produto.setCod(sc.nextLine());
        System.out.println("O código do Equipamento é:");
        System.out.println(produto.getCod());

        System.out.println("A descrição do Equipamento é:");
        System.out.println(produto.getDescricao());

        System.out.println("A quantidade do Equipamento é:");
        System.out.println(produto.getQuantidade());
        
        System.out.println("O preço do equipamento é:");
        System.out.println(produto.getValor());

        System.out.println("A voltagem do Equipamento é:");
        System.out.println(produto.getVoltagem());
        
        System.out.println("A garantia do Equipamento é:");
        System.out.println(produto.getGarantia());

        sc.close();
    }
}
