package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;
import model.Venda;
import repository.MySQLDatabaseConnection;
import repository.ProdutoRepository;


public class ProdutoController {

    ProdutoRepository pr = new ProdutoRepository();
    

    public void cadastrarProduto(String id, String nome, String quantidade, String valor_unitario) {

        int idInt = Integer.parseInt(id);

        int quantidadeInt = Integer.parseInt(quantidade);

        double valorUnitarioDouble = Double.parseDouble(valor_unitario);

        if (nome != null && nome.length() > 0 && quantidadeInt > 0 && valorUnitarioDouble > 0) {
            Produto produto = new Produto();
            produto.setId(idInt);
            produto.setNome(nome);
            produto.setQuantidade(quantidadeInt);
            produto.setValor_unidade(valorUnitarioDouble);

            pr.cadastrarProduto(produto);

        }

    }

    public void deletarProduto(String id){

        int idInt = Integer.parseInt(id);

        pr.deletaProduto(idInt);
        
    }
    
    public float obterValorUnidade(int id){
 
        float valorUnidade = pr.valorProduto(id);
        
        return valorUnidade;
    }
    
    public void atualizarQuantidadeDoEstoque (String id,String quantidade){
        int idInt = Integer.parseInt(id);
        int quantidadeInt = Integer.parseInt(quantidade);
        
        if (idInt > 0 && quantidadeInt > 0){
            pr.atualizarQuantidadeDoEstoque(quantidadeInt, idInt);
        }
    }
    
    public ArrayList<Produto> consultarProdutoPorId (int id){
  
            return new repository.ProdutoRepository().consultarProdutoPorId(id);
            
    }
    
     public ArrayList <Produto> consultarTodosOsProdutos (){
        return new repository.ProdutoRepository().consultarTodosOsProdutos();
    }
    
    public void atualizarQuantidadeDoEstoquePorID (String id,String quantidade){
        int idInt = Integer.parseInt(id);
        int quantidadeInt = Integer.parseInt(quantidade);
        
        if (idInt > 0 && quantidadeInt > 0){
            pr.atualizarQuantidadeDoEstoquePorId(quantidadeInt, idInt);
        }
    }
    
}   