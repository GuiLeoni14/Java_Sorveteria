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
public class DAOSorveteria {
    String mensagem="";
 public List<Sorveteria> listar(){
     
     String sql = "select * from sorveteria";
     List<Sorveteria> listaSorveteria = new ArrayList<>();
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             Sorveteria objSorveteria = new Sorveteria();
             objSorveteria.setCodSorveteria(rs.getInt("codSorveteria"));
             objSorveteria.setEmailSorveteria(rs.getString("emailSorveteria"));
             objSorveteria.setNomeSorveteria(rs.getString("nomeSorveteria"));           
             objSorveteria.setTelefoneSorveteria(rs.getString("telefoneSorveteria"));
             objSorveteria.setHorarioFuncionamentoSorveteria(rs.getString("horarioFuncionamentoSorveteria"));
             objSorveteria.setEnderecoSorveteria(rs.getString("enderecoSorveteria"));
             listaSorveteria.add(objSorveteria);
               }
            }catch(SQLException erro){
         System.out.println("Erro no listar"+erro);
 }
     return listaSorveteria;
 }   
 
 public String inserir (Sorveteria obj){
     String sql = "insert into sorveteria (nomeSorveteria, enderecoSorveteria,"
+ " horarioFuncionamentoSorveteria, emailSorveteria, telefoneSorveteria) values (?,?,?,?,?)";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeSorveteria());
         pst.setString(2,obj.getEnderecoSorveteria());
         pst.setString(3,obj.getHorarioFuncionamentoSorveteria());
         pst.setString(4,obj.getEmailSorveteria());
         pst.setString(5,obj.getTelefoneSorveteria());
        
         if(pst.executeUpdate()>0){
             mensagem = "Sorveteria cadastrada com sucesso!";
             
         }else{
             mensagem = "Sorveteria não cadastrada!";          
         }
         pst.close(); // fechar conexão
            }catch(SQLException erro){
             mensagem = "Erro de SQL no incluir do DAOSorveteria"+ erro.getMessage()+"\nComando sql="+sql;
            
            }
     return mensagem;
 }
 
 public String alterar(Sorveteria obj){
     String sql = "update sorveteria set nomeSorveteria=?, enderecoSorveteria=?, horarioFuncionamentoSorveteria=?, emailSorveteria=?, telefoneSorveteria=? where codSorveteria=?";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setString(1,obj.getNomeSorveteria());
         pst.setString(2,obj.getEnderecoSorveteria());
         pst.setString(3,obj.getHorarioFuncionamentoSorveteria());
         pst.setString(4,obj.getEmailSorveteria());
         pst.setString(5,obj.getTelefoneSorveteria());
         pst.setInt(6,obj.getCodSorveteria());
         if(pst.executeUpdate()>0){
             mensagem = "Sorveteria alterada com sucesso!";         
         }else{
             mensagem = "Sorveteria não alterado";
             
         }
         pst.close(); 
            }catch(SQLException erro){
              mensagem = "Erro de SQL no alterar do DAOSorveteria"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
 
 
public String remover(Sorveteria obj){
     String sql = "delete from sorveteria where codSorveteria = ?"; //cadastro
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodSorveteria());
         if(pst.executeUpdate()>0){
             mensagem = "Sorveteria excluida com sucesso!";
         }else{
             mensagem = "Sorveteria não excluída";
         }
         pst.close();
            }catch(SQLException erro){
             mensagem = "Erro de SQL no excluir do DAOSorveteria"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
        public List<Sorveteria> getLista(){
        String sql = "select * from sorveteria";
        List<Sorveteria> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Sorveteria obj = new Sorveteria();
                obj.setCodSorveteria(rs.getInt("codSorveteria"));
                obj.setNomeSorveteria(rs.getString("nomeSorveteria"));             
                lista.add(obj);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Erro de SQL: "+e.getMessage());
        }
        return lista;
    }

public Sorveteria localizar(Integer id){
    String sql = "select * from Sorveteria where codSorveteria=?";
    Sorveteria objSorveteria = new Sorveteria();
    try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,id);
          ResultSet rs = pst.executeQuery();
         while(rs.next()){
             
             objSorveteria.setCodSorveteria(rs.getInt("codSorveteria"));
             objSorveteria.setEmailSorveteria(rs.getString("emailSorveteria"));
             objSorveteria.setNomeSorveteria(rs.getString("nomeSorveteria"));           
             objSorveteria.setTelefoneSorveteria(rs.getString("telefoneSorveteria"));
             objSorveteria.setHorarioFuncionamentoSorveteria(rs.getString("horarioFuncionamentoSorveteria"));
             objSorveteria.setEnderecoSorveteria(rs.getString("enderecoSorveteria"));
             
            return objSorveteria;
               }
            }catch(SQLException erro){
             System.out.println("Erro de SQL"+ erro.getMessage());
         
            }
       return null;
}
}
