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
public class DAOItensVenda { // data acess object
    
    DAOProduto daoProduto = new DAOProduto();
    DAOVendaProduto daoVendaProduro = new DAOVendaProduto();
    
    
   
    
    public List<ItensVenda> getLista(Integer id){
        String sql = "select * from itensvenda where codVenda=?";
        List<ItensVenda> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ItensVenda obj = new ItensVenda();
                obj.setCodVenda(rs.getInt("codVenda"));
                obj.setCodItemVenda(rs.getInt("codItemVenda"));
                obj.setCodProduto(daoProduto.localizar(rs.getInt("codProduto")));
                obj.setQuantidadeVenda(rs.getInt("quantidadeVenda"));
                obj.setValorVendaProduto(rs.getDouble("valorVendaProduto"));
                lista.add(obj);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Erro de SQL DAO Itens getLista(): "+e.getMessage());
        }
        return lista;
    }
    
     public String incluir(ItensVenda obj) {
        String mensagem;
        String sql = "insert into itensvenda (codVenda,codProduto,quantidadeVenda,valorVendaProduto) values (?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodVenda());
            pst.setInt(2, obj.getCodProduto().getCodProduto());           
            pst.setInt(3, obj.getQuantidadeVenda());
            pst.setDouble(4, obj.getValorVendaProduto());
            
            if (pst.executeUpdate() > 0) {
                 
                mensagem = "Item de venda cadastrado com sucesso";
            } else {
                mensagem = "Item de venda não cadastrado!";
            }
            pst.close();
        } catch (SQLException e) {
            mensagem = e.getMessage();
        }
        return mensagem;
    }
     
     public String remover(ItensVenda obj){
        String sql = "delete from itensvenda where codItemVenda=?";
        String mensagem;
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodItemVenda()); 
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
