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
public class DAOFuncionario {
    String mensagem="";
    ConverteData converte = new ConverteData();
    DAOSorveteria daoSorveteria = new DAOSorveteria();
 public List<Funcionario> listar(){
     
     String sql = "select * from funcionario";
     List<Funcionario> listaFuncionario = new ArrayList<>();
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             Funcionario objFuncionario = new Funcionario();
             objFuncionario.setCodFuncionario(rs.getInt("codFuncionario"));
             objFuncionario.setCodSorveteria(daoSorveteria.localizar(rs.getInt("codSorveteria")));
             objFuncionario.setTipoFuncionario(rs.getString("tipoFuncionario"));
             objFuncionario.setNomeFuncionario(rs.getString("nomeFuncionario")); 
             objFuncionario.setEnderecoFuncionario(rs.getString("enderecoFuncionario"));
             objFuncionario.setEmailFuncionario(rs.getString("emailFuncionario"));                      
             objFuncionario.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
             objFuncionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
             objFuncionario.setDataNascimentoFuncionario(converte.converteCalendario("dataNascimentoFuncionario"));
             objFuncionario.setRgFuncionario(rs.getString("rgFuncionario"));
             objFuncionario.setCargaHorariaFuncionario(rs.getString("cargaHorariaFuncionario"));
             objFuncionario.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
             listaFuncionario.add(objFuncionario);
               }
            }catch(SQLException erro){
         System.out.println("Erro no listar"+erro);
 }
     return listaFuncionario;
 }   
 
 public String inserir (Funcionario obj){
     String sql = "insert into funcionario (codSorveteria, tipoFuncionario, nomeFuncionario, enderecoFuncionario,"
+ " emailFuncionario, telefoneFuncionario, cpfFuncionario, dataNascimentoFuncionario, rgFuncionario, cargaHorariaFuncionario, salarioFuncionario) values (?,?,?,?,?,?,?,?,?,?,?)";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodSorveteria().getCodSorveteria());
         pst.setString(2,obj.getTipoFuncionario());
         pst.setString(3,obj.getNomeFuncionario());
         pst.setString(4,obj.getEnderecoFuncionario());        
         pst.setString(5,obj.getEmailFuncionario());
         pst.setString(6,obj.getTelefoneFuncionario());
         pst.setString(7,obj.getCpfFuncionario());
         pst.setDate(8,converte.converteBanco(obj.getDataNascimentoFuncionario()));
         pst.setString(9,obj.getRgFuncionario());
         pst.setString(10,obj.getCargaHorariaFuncionario());
         pst.setDouble(11,obj.getSalarioFuncionario());
         if(pst.executeUpdate()>0){
             mensagem = "Funcionario cadastrado com sucesso!";
             
         }else{
             mensagem = "Funcionario nao cadastrado!";          
         }
         pst.close(); // fechar conexão
            }catch(SQLException erro){
             mensagem = "Erro de SQL no incluir do DAOFuncionario"+ erro.getMessage()+"\nComando sql="+sql;
            
            }
     return mensagem;
 }
 
 public String alterar(Funcionario obj){
     String sql = "update funcionario set codSorveteria=?, tipoFuncionario=?, nomeFuncionario=?, enderecoFuncionario=?, emailFuncionario=?, telefoneFuncionario=?, cpfFuncionario=?, dataNascimentoFuncionario=?, rgFuncionario=?, cargaHorariaFuncionario=?, salarioFuncionario=? where codFuncionario=?";
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodSorveteria().getCodSorveteria());
         pst.setString(2,obj.getTipoFuncionario());
         pst.setString(3,obj.getNomeFuncionario());
         pst.setString(4,obj.getEnderecoFuncionario());        
         pst.setString(5,obj.getEmailFuncionario());
         pst.setString(6,obj.getTelefoneFuncionario());
         pst.setString(7,obj.getCpfFuncionario());
         pst.setDate(8,converte.converteBanco(obj.getDataNascimentoFuncionario()));
         pst.setString(9,obj.getRgFuncionario());
         pst.setString(10,obj.getCargaHorariaFuncionario());
         pst.setDouble(11,obj.getSalarioFuncionario());
         pst.setInt(12,obj.getCodFuncionario());
         if(pst.executeUpdate()>0){
             mensagem = "Funcionario alterado com sucesso!";         
         }else{
             mensagem = "Funcionario nao alterado";
             
         }
         pst.close(); 
            }catch(SQLException erro){
              mensagem = "Erro de SQL no alterar do DAOFuncionario"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }
 
 
public String remover(Funcionario obj){
     String sql = "delete from funcionario where codFuncionario = ?"; //cadastro
     try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,obj.getCodFuncionario());
         if(pst.executeUpdate()>0){
             mensagem = "Funcionario excluido com sucesso!";
         }else{
             mensagem = "Funcionario não excluido";
         }
         pst.close();
            }catch(SQLException erro){
             mensagem = "Erro de SQL no excluir do DAOFuncionario"+ erro.getMessage()+"\nComando sql="+sql;
            }
     return mensagem;
 }

public Funcionario localizar(Integer id){
    String sql = "select * from Funcionario where codFuncionario=?";
    Funcionario objFuncionario = new Funcionario();
    try{
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         pst.setInt(1,id);
          ResultSet rs = pst.executeQuery();
         while(rs.next()){           
             objFuncionario.setCodFuncionario(rs.getInt("codFuncionario"));
             objFuncionario.setCodSorveteria(daoSorveteria.localizar(rs.getInt("codSorveteria")));
             objFuncionario.setTipoFuncionario(rs.getString("tipoFuncionario"));
             objFuncionario.setNomeFuncionario(rs.getString("nomeFuncionario")); 
             objFuncionario.setEnderecoFuncionario(rs.getString("enderecoFuncionario"));
             objFuncionario.setEmailFuncionario(rs.getString("emailFuncionario"));                      
             objFuncionario.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
             objFuncionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
             objFuncionario.setDataNascimentoFuncionario(converte.converteCalendario("dataNascimentoFuncionario"));
             objFuncionario.setRgFuncionario(rs.getString("rgFuncionario"));
             objFuncionario.setCargaHorariaFuncionario(rs.getString("cargaHorariaFuncionario"));
             objFuncionario.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
               }
               
            }catch(SQLException erro){
             System.out.println("Erro de SQL"+ erro.getMessage());
         
            }
       return null;
}
  public List<Funcionario> getLista(){
        String sql = "select * from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Funcionario obj = new Funcionario();
                obj.setCodFuncionario(rs.getInt("codFuncionario"));
                obj.setNomeFuncionario(rs.getString("nomeFuncionario"));
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
