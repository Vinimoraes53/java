package supermercado;

public class Eletronico extends Produto {
    private String voltagem;
    private String garantia;
    
    
    public Eletronico(String cod, String descricao, int quantidade, float valor, String voltagem, String garantia) {
        super(cod, descricao, quantidade, valor);
        this.voltagem = voltagem;
        this.garantia = garantia;
    }

    public String getVoltagem(){
        return voltagem;
    }
    
    public String getGarantia(){
        return garantia;
    }
    
    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }
    
    public void setGarantia(String garantia){
        this.garantia = garantia;
    }
    
   
public String toString(){
    return String.format("O produto de código: %s tem descrição: %s, valor: R$%.2f, quantidade: %d, voltagem: %s e garantia até: %s.", 
        this.getCod(), this.getDescricao(), this.getValor(), this.getQuantidade(), this.voltagem, this.garantia);
}

}
