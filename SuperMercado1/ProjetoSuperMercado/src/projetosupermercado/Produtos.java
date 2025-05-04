/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosupermercado;

/**
 *
 * @author iagov
 */
public class Produtos {

    public Double preco;
    public String descricao;
    public int quantidade;
    public String cod;

    Produtos(Double preco, String descricao, int quantidade, String cod) {
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.cod = cod;

    }


    public Double getPreco() {
        return this.preco;
    }

    public Double setPreco(Double preco) {
        return this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String setDescricao(String descricao) {
        return this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int setQuantidade(int quantidade) {
        return this.quantidade = quantidade;
    }

    public String getCod() {
        return this.cod;
    }

    public String setCod(String cod) {
        return this.cod = cod;
    }

}
