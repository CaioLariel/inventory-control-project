/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Venda;
import model.Produto;

public class VendaRepository {
    
    
    public void cadastrarVenda (Venda venda){
        
        String sql = "INSERT INTO venda (cpf, id_produto, quantidade,total) VALUES (?, ? ,?,?)";
        PreparedStatement ps = null;
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setLong(1, venda.getCpf());
            ps.setInt(2, venda.getId_produto());
            ps.setInt(3, venda.getQuantidade());
            ps.setFloat(4, venda.getTotal());
            ps.execute();
            ps.close();
            
        
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }
   
    
    public ArrayList<Venda> consultarVendaPorId (int id) {
        String sql = "SELECT * FROM venda WHERE id =?";
        PreparedStatement ps = null;
        ArrayList<Venda> vendas = new ArrayList<>();
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Venda venda = new Venda();
                    venda.setId(rs.getInt("id"));
                    venda.setCpf(rs.getLong("cpf"));
                    venda.setId_produto(rs.getInt("id_produto"));
                    venda.setQuantidade(rs.getInt("quantidade"));
                    venda.setTotal(rs.getFloat("total"));
                    
                    vendas.add(venda);
                }
            }
           
        }catch (SQLException e){
            e.printStackTrace();
            
        }
        
        return vendas;

            
    }
    
    public ArrayList<Venda> consultarTodasAsVendas () {
        String sql = "SELECT * FROM venda";
        PreparedStatement ps = null;
        ArrayList<Venda> vendas = new ArrayList<>();
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Venda venda = new Venda();
                    venda.setId(rs.getInt("id"));
                    venda.setCpf(rs.getLong("cpf"));
                    venda.setId_produto(rs.getInt("id_produto"));
                    venda.setQuantidade(rs.getInt("quantidade"));
                    venda.setTotal(rs.getFloat("total"));
                    
                    vendas.add(venda);
                }
            }
           
        }catch (SQLException e){
            e.printStackTrace();
            
        }
        
        return vendas;

        
    }
    
    
    public ArrayList<Venda> consultarVendaPorCpf (long cpf) {
        String sql = "SELECT * FROM venda WHERE cpf =?";
        PreparedStatement ps = null;
        ArrayList<Venda> vendas = new ArrayList<>();
        
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setLong(1,cpf);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Venda venda = new Venda();
                    venda.setCpf(rs.getLong("cpf"));
                    venda.setId(rs.getInt("id"));
                    venda.setId_produto(rs.getInt("id_produto"));
                    venda.setQuantidade(rs.getInt("quantidade"));
                    venda.setTotal(rs.getFloat("total"));
                    
                    vendas.add(venda);
                }
            }
           
        }catch (SQLException e){
            e.printStackTrace();
            
        }
        
        return vendas;

            
    }
    
}
   

