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
import java.util.Calendar;

/**
 *
 *
 */
public class DAOCliente {
    String mensagem="";
 public List<Cliente> listar(){
     
     String sql = "select * from cliente";
     List<Cliente> listaCliente = new ArrayList<>();
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             Cliente objCliente = new Cliente();
             objCliente.setCodCliente(rs.getInt("codCliente"));
             objCliente.setEmailCliente(rs.getString("emailCliente"));
             objCliente.setNomeCliente(rs.getString("nomeCliente"));           
             objCliente.setTelefoneCliente(rs.getString("telefoneCliente"));
             objCliente.setCpfCliente(rs.getString("cpfCliente"));
             objCliente.setEnderecoCliente(rs.getString("enderecoCliente"));
             objCliente.setDataNascimentoCliente(rs.getString("dataNascimentoCliente"));
             //java.sql.Date dt = rs.getDate("dataNascimentoCliente");
             //Calendar c = Calendar.getInstance();
             //c.setTime(dt);
             //objCliente.setDataNascimentoCliente(c);
             objCliente.setRgCliente(rs.getString("rgCliente"));
             listaCliente.add(objCliente);
               }
            }catch(SQLException erro){
         System.out.println("Erro no listar"+erro);
 }
     return listaCliente;
 }   
 
 public String inserir (Cliente obj){
     String sql = "insert into cliente (nomeCliente, enderecoCliente,"
+ " emailCliente, telefoneCliente, cpfCliente, dataNascimentoCliente, rgCliente) values (?,?,?,?,?,?,?)";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeCliente());
         pst.setString(2,obj.getEnderecoCliente());        
         pst.setString(3,obj.getEmailCliente());
         pst.setString(4,obj.getTelefoneCliente());
         pst.setString(5,obj.getCpfCliente());
         //pst.setDate(6,new java.sql.Date(obj.getDataNascimentoCliente().getTimeInMillis()));
         pst.setString(6,obj.getDataNascimentoCliente());
         pst.setString(7,obj.getRgCliente());
         if(pst.executeUpdate()>0){
             mensagem = "Cliente cadastrado com sucesso!";
             
         }else{
             mensagem = "Cliente nao cadastrado!";          
         }
         pst.close(); // fechar conexão
            }catch(SQLException erro){
             mensagem = "Erro de SQL no incluir do DAOCliente"+ erro.getMessage()+"\nComando sql="+sql;
            
            }
     return mensagem;
 }
 
 public String alterar(Cliente obj){
     String sql = "update cliente set nomeCliente=?, enderecoCliente=?, emailCliente=?, telefoneCliente=?, cpfCliente=?, dataNascimentoCliente=?, rgCliente=? where codCliente=?";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeCliente());
         pst.setString(2,obj.getEnderecoCliente());
         pst.setString(3,obj.getEmailCliente());
         pst.setString(4,obj.getTelefoneCliente());
         pst.setString(5,obj.getCpfCliente());
         //pst.setDate(6,new java.sql.Date(obj.getDataNascimentoCliente().getTimeInMillis()));
         pst.setString(6,obj.getDataNascimentoCliente());
         pst.setString(7,obj.getRgCliente());
         pst.setInt(8,obj.getCodCliente());
         if(pst.executeUpdate()>0){
             mensagem = "Cliente alterado com sucesso!";         
         }else{
             mensagem = "Cliente nao alterado";
             
         }
         pst.close(); 
            }catch(SQLException erro){
              mensagem = "Erro de SQL no alterar do DAOCliente"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
 
 
public String remover(Cliente obj){
     String sql = "delete from cliente where codCliente = ?"; //cadastro
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodCliente());
         if(pst.executeUpdate()>0){
             mensagem = "Cliente excluido com sucesso!";
         }else{
             mensagem = "Cliente não excluido";
         }
         pst.close();
            }catch(SQLException erro){
             mensagem = "Erro de SQL no excluir do DAOCliente"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }

public Cliente localizar(Integer id){
    String sql = "select * from Cliente where codCliente=?";
    Cliente objCliente = new Cliente();
    try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,id);
          ResultSet rs = pst.executeQuery();
         while(rs.next()){           
             objCliente.setCodCliente(rs.getInt("codCliente"));
             objCliente.setEmailCliente(rs.getString("emailCliente"));
             objCliente.setNomeCliente(rs.getString("nomeCliente"));           
             objCliente.setTelefoneCliente(rs.getString("telefoneCliente"));
             objCliente.setCpf(rs.getString("cpfCliente"));
             objCliente.setEnderecoCliente(rs.getString("enderecoCliente"));
             //java.sql.Date dt = rs.getDate("dataNascimentoCliente");
             //Calendar c = Calendar.getInstance();
             //c.setTime(dt);
             //objCliente.setDataNascimentoCliente(c);
             objCliente.setDataNascimentoCliente(rs.getString("dataNascimentoCliente"));
             objCliente.setRgCliente(rs.getString("rgCliente"));
               }
               
            }catch(SQLException erro){
             System.out.println("Erro de SQL"+ erro.getMessage());
         
            }
       return null;
}    
    public List<Cliente> getLista(){
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cliente obj = new Cliente();
                obj.setCodCliente(rs.getInt("codCliente"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
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
