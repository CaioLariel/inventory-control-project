package controller;


import java.util.ArrayList;
import model.Produto;
import model.Venda;
import repository.VendaRepository;

public class VendaController {
    VendaRepository vr = new VendaRepository();
    ProdutoController pc = new ProdutoController();
    
    
    
    
     public void cadastrarVenda (String cpf,String id_produto, String quantidade){
        
        long cpfLong = Long.parseLong(cpf);
         
         int idProdutoInt = Integer.parseInt(id_produto);
        
         int quantidadeInt = Integer.parseInt(quantidade);
         
         float unidadeProduto = pc.obterValorUnidade(idProdutoInt);
         
         float totalVenda = unidadeProduto * quantidadeInt;
         
         if (cpfLong > 0 && idProdutoInt > 0 && quantidadeInt > 0){
           
            Venda venda = new Venda();
            venda.setCpf(cpfLong);
            venda.setId_produto(idProdutoInt);
            venda.setQuantidade(quantidadeInt);
            venda.setTotal(totalVenda);
            
            vr.cadastrarVenda(venda);
            
            
        }
    }
    
     public ArrayList<Venda> consultarVendaPorId (int id){
         
            return new repository.VendaRepository().consultarVendaPorId(id);
            
        }
     
      public ArrayList <Venda> consultarVendaPorCpf (Long cpf){
        return new repository.VendaRepository().consultarVendaPorCpf(cpf);
    }
     
    public ArrayList <Venda> consultarTodasVendas (){
        return new repository.VendaRepository().consultarTodasAsVendas();
    }
     
     
     
      
}  
     

 