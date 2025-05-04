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
public class Eletronico extends Produtos {

    public String garantia;
    public String voltagem;
    public Eletronico(Double preco, String descricao, int quantidade, String cod, String garantia,String voltagem) {
        super(preco, descricao, quantidade, cod);
        this.garantia = garantia;
                this.voltagem = voltagem;

    }

    public String getGarantia() {
        return this.garantia;
    }

    public String setGarantia(String garantia) {
        return this.garantia = garantia;
    }
    
       public String getVoltagem() {
        return this.voltagem;
    }

    public String setVoltagem(String voltagem) {
        return this.voltagem = voltagem;
    }
    public String descProduto() {
     return String.format("o Preco do produto é %f, Sua descrição %s, sua quantidade %d, e seu código %s, sua garantia vai até: %s, sua voltagem é %s"
                + " ", this.preco, this.descricao, this.quantidade, this.cod,this.garantia,this.voltagem);
             }
}
