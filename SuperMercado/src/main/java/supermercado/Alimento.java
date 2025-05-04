package supermercado;

public class Alimento extends Produto {
    
    private float peso;
    private String validade;
    
    
    public Alimento(String cod, String descricao, int quantidade, float valor, float peso, String validade) {
        super(cod, descricao, quantidade, valor);
        this.peso = peso;
        this.validade = validade;
    }

    public float getPeso(){
        return peso;
    }
    
    public String getValidade(){
        return validade;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setValidade(String validade){
        this.validade = validade;
    }
    
  
public String toString(){
    return String.format("O produto de código: %s tem descrição: %s, valor: R$%.2f, quantidade: %d, peso: %.2f g e validade até: %s.", 
        this.getCod(), this.getDescricao(), this.getValor(), this.getQuantidade(), this.peso, this.validade);
}

}
