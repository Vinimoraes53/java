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
public class Alimentos extends Produtos {

    public float peso;
    public String validade;

    public Alimentos(Double preco, String descricao, int quantidade, String cod, float peso, String validade) {
        super(preco, descricao, quantidade, cod);

        this.peso = peso;
        this.validade = validade;

    }

    public float getPeso() {
        return this.peso;
    }

    public float setPeso(float peso) {
        return this.peso = peso;
    }

    public String getValidade() {
        return this.validade;
    }

    public String setValidade(String validade) {
        return this.validade = validade;
    }
    
 public String descProduto() {
        return String.format("o Preco do produto é %f, Sua descrição %s, sua quantidade %d, e seu código %s, seu peso é %f, sua validade é no dia %s"
                + " ", this.preco, this.descricao, this.quantidade, this.cod, this.peso, this.validade);
    }
}

