/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Guilherme
 */
public class DAOItensCompra { // data acess object
    
    DAOProduto daoProduto = new DAOProduto();
    DAOCompraProduto daoCompraProduro = new DAOCompraProduto();
    
    
   
    
    public List<ItensCompra> getLista(Integer id){
        String sql = "select * from itenscompra where codCompra=?";
        List<ItensCompra> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ItensCompra obj = new ItensCompra();
                obj.setCodCompra(rs.getInt("codCompra"));
                obj.setCodItemCompra(rs.getInt("codItemCompra"));
                obj.setCodProduto(daoProduto.localizar(rs.getInt("codProduto")));
                obj.setQuantidadeCompra(rs.getInt("quantidadeCompra"));
                obj.setValorCompraProduto(rs.getDouble("valorCompraProduto"));
                lista.add(obj);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Erro de SQL DAO Itens getLista(): "+e.getMessage());
        }
        return lista;
    }
    
     public String incluir(ItensCompra obj) {
        String mensagem;
        String sql = "insert into itenscompra (codCompra,codProduto,quantidadeCompra,valorCompraProduto) values (?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCompra());
            pst.setInt(2, obj.getCodProduto().getCodProduto());        
            pst.setInt(3, obj.getQuantidadeCompra());
            pst.setDouble(4, obj.getValorCompraProduto());
            
            if (pst.executeUpdate() > 0) {
                 
                mensagem = "Item de compra cadastrado com sucesso";
            } else {
                mensagem = "Item de compra não cadastrado!";
            }
            pst.close();
        } catch (SQLException e) {
            mensagem = e.getMessage();
        }
        return mensagem;
    }
     
     public String remover(ItensCompra obj){
        String sql = "delete from itenscompra where codItemCompra=?";
        String mensagem;
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodItemCompra()); 
            if (pst.executeUpdate() > 0) {
                mensagem = "Item removido com sucesso!";
            } else {
                mensagem = "Item não excluído";
            }
            pst.close();
        } catch (SQLException e) {
            mensagem = e.getMessage();
        }
        return mensagem;
    }
    
 

  
    
    
}
