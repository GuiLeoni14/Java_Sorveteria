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
public class DAOFornecedor {
    String mensagem="";
 public List<Fornecedor> listar(){
     
     String sql = "select * from fornecedor";
     List<Fornecedor> listaFornecedor = new ArrayList<>();
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             Fornecedor objFornecedor = new Fornecedor();
             objFornecedor.setCodFornecedor(rs.getInt("codFornecedor"));
             objFornecedor.setEmailFornecedor(rs.getString("emailFornecedor"));
             objFornecedor.setNomeFornecedor(rs.getString("nomeFornecedor"));           
             objFornecedor.setTelefoneFornecedor(rs.getString("telefoneFornecedor"));
             objFornecedor.setHorarioFuncionamento(rs.getString("horarioFuncionamentoFornecedor"));
             objFornecedor.setEnderecoFornecedor(rs.getString("enderecoFornecedor"));
             listaFornecedor.add(objFornecedor);
               }
            }catch(SQLException erro){
         System.out.println("Erro no listar"+erro);
 }
     return listaFornecedor;
 }   
 
 public String inserir (Fornecedor obj){
     String sql = "insert into fornecedor (nomeFornecedor, enderecoFornecedor,"
+ " horarioFuncionamentoFornecedor, emailFornecedor, telefoneFornecedor) values (?,?,?,?,?)";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeFornecedor());
         pst.setString(2,obj.getEnderecoFornecedor());
         pst.setString(3,obj.getHorarioFuncionamentoFornecedor());
         pst.setString(4,obj.getEmailFornecedor());
         pst.setString(5,obj.getTelefoneFornecedor());
        
         if(pst.executeUpdate()>0){
             mensagem = "Fornecedor cadastrado com sucesso!";
             
         }else{
             mensagem = "Fornecedor não cadastrada!";          
         }
         pst.close(); // fechar conexão
            }catch(SQLException erro){
             mensagem = "Erro de SQL no incluir do DAOFornecedor"+ erro.getMessage()+"\nComando sql="+sql;
            
            }
     return mensagem;
 }
 
 public String alterar(Fornecedor obj){
     String sql = "update fornecedor set nomeFornecedor=?, enderecoFornecedor=?, horarioFuncionamentoFornecedor=?, emailFornecedor=?, telefoneFornecedor=? where codFornecedor=?";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeFornecedor());
         pst.setString(2,obj.getEnderecoFornecedor());
         pst.setString(3,obj.getHorarioFuncionamentoFornecedor());
         pst.setString(4,obj.getEmailFornecedor());
         pst.setString(5,obj.getTelefoneFornecedor());
         pst.setInt(6,obj.getCodFornecedor());
         if(pst.executeUpdate()>0){
             mensagem = "Fornecedor alterado com sucesso!";         
         }else{
             mensagem = "Fornecedor não alterado";
             
         }
         pst.close(); 
            }catch(SQLException erro){
              mensagem = "Erro de SQL no alterar do DAOFornecedor"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
 
 
public String remover(Fornecedor obj){
     String sql = "delete from fornecedor where codFornecedor = ?"; //cadastro
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodFornecedor());
         if(pst.executeUpdate()>0){
             mensagem = "Fornecedor excluido com sucesso!";
         }else{
             mensagem = "Fornecedor não excluída";
         }
         pst.close();
            }catch(SQLException erro){
             mensagem = "Erro de SQL no excluir do DAOFornecedor"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
        public List<Fornecedor> getLista(){
        String sql = "select * from fornecedor";
        List<Fornecedor> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Fornecedor obj = new Fornecedor();
                obj.setCodFornecedor(rs.getInt("codFornecedor"));
                obj.setNomeFornecedor(rs.getString("nomeFornecedor"));
                lista.add(obj);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Erro de SQL: "+e.getMessage());
        }
        return lista;
    }

public Fornecedor localizar(Integer id){
    String sql = "select * from Fornecedor where codFornecedor=?";
    Fornecedor objFornecedor = new Fornecedor();
    try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,id);
          ResultSet rs = pst.executeQuery();
         while(rs.next()){
             
             objFornecedor.setCodFornecedor(rs.getInt("codFornecedor"));
             objFornecedor.setEmailFornecedor(rs.getString("emailFornecedor"));
             objFornecedor.setNomeFornecedor(rs.getString("nomeFornecedor"));           
             objFornecedor.setTelefoneFornecedor(rs.getString("telefoneFornecedor"));
             objFornecedor.setHorarioFuncionamento(rs.getString("horarioFuncionamentoFornecedor"));
             objFornecedor.setEnderecoFornecedor(rs.getString("enderecoFornecedor"));
             
            return objFornecedor;
               }
            }catch(SQLException erro){
             System.out.println("Erro de SQL"+ erro.getMessage());
         
            }
       return null;
}
}
