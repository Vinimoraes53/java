/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosupermercado;

import java.util.Scanner;

/**
 *
 * @author iagov
 */
public class ProjetoSuperMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("começou");
        System.out.println("Digite 1 para estocar 1 alimento, digite 2 ou qualquer outro número para estocar um eletrônico");
        opcao = sc.nextInt();

        if (opcao == 1) {
            Alimentos alimento = new Alimentos(5.95, "uma maça saborosa", 30, "982828", 2000, "09/10/26");
            System.out.println("Estocando Alimento");
            //preco
            System.out.println("Digite o preço do produto");
            alimento.setPreco(sc.nextDouble());
            alimento.getPreco();
            sc.nextLine();

            //descrição
            System.out.println("Digite a descrição do produto");
            alimento.setDescricao(sc.nextLine());
            alimento.getDescricao();
            sc.nextLine();

            //quantidade
            System.out.println("Digite a quantidade do produto");
            alimento.setQuantidade(sc.nextInt());
            alimento.getQuantidade();
            sc.nextLine();

            //código
            System.out.println("Digite o código do produto");
            alimento.setCod(sc.nextLine());
            alimento.getCod();
            sc.nextLine();

            //peso
            System.out.println("Digite o peso do produto");
            alimento.setPeso(sc.nextFloat());
            alimento.getPeso();
            sc.nextLine();

            //data de validade
            System.out.println("Digite a data de validade do produto");
            alimento.setValidade(sc.nextLine());
            alimento.getValidade();
            sc.nextLine();

            System.out.println(alimento.descProduto());
        } else {
            System.out.println("Estocando Eletrônico");
            //Eletrônico
            Eletronico eletronico = new Eletronico(100.00, "Um Teclado de boa qualidade", 30, "22222222222222", "vai até dia: 29/10/26 ou 3 meses","200Watts");

            //preço
            System.out.println("Digite o preço");
            eletronico.setPreco(sc.nextDouble());
            eletronico.getPreco();
            sc.nextLine();

            //descrição
            System.out.println("Digite a descrição do produto");
            eletronico.setDescricao(sc.nextLine());
            eletronico.getDescricao();
            sc.nextLine();

            //quantidade
            System.out.println("Digite a quantidade do produto");
            eletronico.setQuantidade(sc.nextInt());
            eletronico.getQuantidade();
            sc.nextLine();
            //código
            System.out.println("Digite o código do produto");
            eletronico.setCod(sc.nextLine());
            eletronico.getCod();
            sc.nextLine();
            //garantia
            System.out.println("digite a garantia do produto");
            eletronico.setGarantia(sc.nextLine());
            eletronico.getGarantia();
            sc.nextLine();
            //Watts
                  System.out.println("digite a voltagem do produto");
            eletronico.setVoltagem(sc.nextLine());
            eletronico.getVoltagem();
            sc.nextLine();
            
            System.out.println(eletronico.descProduto()); ;
            sc.close();
        }
    }
}
