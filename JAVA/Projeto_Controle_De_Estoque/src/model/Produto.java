
package model;


public class Produto {
    
    private int id;
    
    private String nome;
    
    private int quantidade;
    
    private double valor_unidade;
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unidade() {
        return valor_unidade;
    }

    public void setValor_unidade(double valor_unidade) {
        this.valor_unidade = valor_unidade;
    }


}
