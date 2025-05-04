package supermercado;

public class Produto {
    private String cod;
    private String descricao;
    private float valor;
    private int quantidade;
    
    public Produto(String cod, String descricao, int quantidade, float valor) {
        this.cod = cod;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public String getCod(){
        return cod;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public float getValor(){
        return valor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setCod(String cod){
        this.cod = cod;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
