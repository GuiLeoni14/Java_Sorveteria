/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tulio
 */
public class Relatorio {
   
   //para cada relatório crie um método 
     
     public ResultSet relatorioFuncionario() {
        String sql = "SELECT funcionario.codFuncionario, funcionario.nomeFuncionario, funcionario.tipoFuncionario, funcionario.salarioFuncionario FROM funcionario, sorveteria WHERE funcionario.codSorveteria = sorveteria.codSorveteria";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }
     public ResultSet relatorioCliente() {
        String sql = "SELECT * FROM cliente";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }
     public ResultSet relatorioFornecedor() {
        String sql = "SELECT * FROM fornecedor";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }
     public ResultSet relatorioCompra() {
        String sql = "SELECT compraproduto.codCompra, sorveteria.nomeSorveteria, fornecedor.nomeFornecedor, compraproduto.dataCompraProduto FROM compraproduto, sorveteria, fornecedor WHERE compraproduto.codSorveteria = sorveteria.codSorveteria AND compraproduto.codFornecedor = fornecedor.codFornecedor";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }
     public ResultSet relatorioVenda() {
        String sql = "SELECT vendaproduto.codVenda, funcionario.nomeFuncionario, cliente.nomeCliente, vendaproduto.dataVendaProduto FROM vendaproduto, funcionario, cliente WHERE vendaproduto.codFuncionario = funcionario.codFuncionario AND vendaproduto.codCliente = cliente.codCliente";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }
     public ResultSet relatorioProduto() {
        String sql = "SELECT * FROM produto";
        ResultSet rs=null;
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return rs;
    }     
    
}
