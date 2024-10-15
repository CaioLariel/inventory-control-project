package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;
import java.util.ArrayList;


public class ProdutoRepository { 
    public void cadastrarProduto (Produto produto){
        
        String sql = "INSERT INTO produto (id,nome,quantidade,valor_unidade) VALUES (?, ? ,? ,?)";
        PreparedStatement ps = null;
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1,produto.getId());
            ps.setString(2,produto.getNome());
            ps.setInt(3,produto.getQuantidade());
            ps.setDouble(4,produto.getValor_unidade());
            ps.execute();
            ps.close();
           
        
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        }
    
    public void deletaProduto(int id){

        String sql = "DELETE FROM produto WHERE id = ? ";
        PreparedStatement ps = null;
        
 
        try{
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    
        public float valorProduto(int id) {
        String sql = "SELECT valor_unidade FROM produto WHERE id = ?";
        PreparedStatement ps = null;
        float totalProduto = 0.0f;

        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    totalProduto = rs.getFloat("valor_unidade");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalProduto;
    }
        
     public void atualizarQuantidadeDoEstoque (int qnt, int id){
        String sql = "UPDATE produto SET quantidade = quantidade -? WHERE id = ?";
        PreparedStatement ps = null;
      
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, qnt);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
     }
     
     public void atualizarQuantidadeDoEstoquePorId (int qnt, int id){
        String sql = "UPDATE produto SET quantidade = ? WHERE id = ?";
        PreparedStatement ps = null;
      
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, qnt);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
     }
     
     
        public ArrayList<Produto> consultarProdutoPorId (int id) {
        String sql = "SELECT * FROM produto WHERE id =?";
        PreparedStatement ps = null;
        ArrayList<Produto> vendas = new ArrayList<>();
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    
                    vendas.add(produto);
                }
            }
           
        }catch (SQLException e){
            e.printStackTrace();
            
        }
        
        return vendas;

            
    }
    
    public ArrayList<Produto> consultarTodosOsProdutos () {
        String sql = "SELECT *FROM produto";
        PreparedStatement ps = null;
        ArrayList<Produto> produtos = new ArrayList<>();
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    
                    produtos.add(produto);
                }
            }
           
        }catch (SQLException e){
            e.printStackTrace();
            
        }
        
        return produtos;

        
    }
        
  }



