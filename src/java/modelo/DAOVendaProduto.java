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
 * @author Guilherme
 */
public class DAOVendaProduto { // data acess object

    ConverteData converte = new ConverteData();
    private int lastId;

    public int getLastId() {
        return lastId;
    }

    public String incluir(VendaProduto obj) {
        String mensagem;
        String sql = "insert into vendaproduto (codCliente,codFuncionario,dataVendaProduto) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCliente().getCodCliente());
            pst.setInt(2, obj.getCodFuncionario().getCodFuncionario());
            pst.setDate(3, converte.converteBanco(obj.getDataVendaProduto()));

            if (pst.executeUpdate() > 0) {
                 ResultSet rs = pst.getGeneratedKeys();// retorna o último codVendaProduto cadastrado
                if (rs.next()) {
                    lastId = rs.getInt(1); //armazena o último codVendaProduto cadastrado
                }
                mensagem = "Venda cadastrada com sucesso";
            } else {
                mensagem = "Venda não cadastrado!";
            }
            pst.close();
        } catch (SQLException e) {
            mensagem = e.getMessage();
        }
        return mensagem;
    }

    public String remove(VendaProduto obj) {
        String mensagem;
        String sql = "delete from vendaProduto where codVenda=?";
        try {
            PreparedStatement stmt = Conexao.getPreparedStatement(sql);
            stmt.setInt(1, obj.getCodVenda());
            if (stmt.executeUpdate() > 0) {
                mensagem = "Venda cancelada";
            } else {
                mensagem = "Venda não cancelada";
            }
            stmt.close();
        } catch (SQLException e) {
            mensagem = e.getMessage() + "\nComando SQL = " + sql;

        }
        return mensagem;
    }

}
