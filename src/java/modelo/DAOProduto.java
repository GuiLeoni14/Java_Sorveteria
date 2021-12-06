/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class DAOProduto {
    String mensagem="";
 public List<Produto> listar(){
     
     String sql = "select * from produto";
     List<Produto> listaProduto = new ArrayList<>();
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             Produto objProduto = new Produto();
             objProduto.setCodProduto(rs.getInt("codProduto"));
             objProduto.setNomeProduto(rs.getString("nomeProduto"));  
             objProduto.setEstoqueProduto(rs.getInt("estoqueProduto"));          
             objProduto.setValorProduto(rs.getDouble("valorProduto"));            
             listaProduto.add(objProduto);
               }
            }catch(SQLException erro){
         System.out.println("Erro no listar"+erro);
 }
     return listaProduto;
 }   
 
 public String inserir (Produto obj){
     String sql = "insert into produto (nomeProduto, estoqueProduto, valorProduto) values (?,?,?)";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeProduto());
         pst.setInt(2,obj.getEstoqueProduto());
         pst.setDouble(3,obj.getValorProduto());
        
         if(pst.executeUpdate()>0){
             mensagem = "Produto cadastrado com sucesso!";
             
         }else{
             mensagem = "Produto não cadastrado!";          
         }
         pst.close(); // fechar conexão
            }catch(SQLException erro){
             mensagem = "Erro de SQL no incluir do DAOProduto"+ erro.getMessage()+"\nComando sql="+sql;
            
            }
     return mensagem;
 }
 
 public String alterar(Produto obj){
     String sql = "update produto set nomeProduto=?, estoqueProduto=?, valorProduto=? where codProduto=?";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeProduto());
         pst.setInt(2,obj.getEstoqueProduto());
         pst.setDouble(3,obj.getValorProduto());
         pst.setInt(4,obj.getCodProduto());
         if(pst.executeUpdate()>0){
             mensagem = "Produto alterado com sucesso!";         
         }else{
             mensagem = "Produto não alterado";
             
         }
         pst.close(); 
            }catch(SQLException erro){
              mensagem = "Erro de SQL no alterar do DAOProduto"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
 
 
public String remover(Produto obj){
     String sql = "delete from produto where codProduto = ?"; //cadastro
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodProduto());
         if(pst.executeUpdate()>0){
             mensagem = "Produto excluido com sucesso!";
         }else{
             mensagem = "Produto não excluído";
         }
         pst.close();
            }catch(SQLException erro){
             mensagem = "Erro de SQL no excluir do DAOProduto"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }

public Produto localizar(Integer id){
    String sql = "select * from Produto where codProduto=?";
    Produto objProduto = new Produto();
    try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,id);
          ResultSet rs = pst.executeQuery();
         while(rs.next()){
             
             objProduto.setCodProduto(rs.getInt("codProduto"));
             objProduto.setNomeProduto(rs.getString("nomeProduto"));  
             objProduto.setEstoqueProduto(rs.getInt("estoqueProduto"));          
             objProduto.setValorProduto(rs.getDouble("valorProduto"));            
             
            return objProduto;
               }
            }catch(SQLException erro){
             System.out.println("Erro de SQL"+ erro.getMessage());
         
            }
       return null;
}
  
    public List<Produto> getLista(){
        String sql = "select * from produto";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Produto obj = new Produto();
                obj.setCodProduto(rs.getInt("codProduto"));
                obj.setNomeProduto(rs.getString("nomeProduto"));
                obj.setValorProduto(rs.getDouble("valorProduto"));
                lista.add(obj);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Erro de SQL: "+e.getMessage());
        }
        return lista;
    }
    
     
}
