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
 * @author user
 */
public class DAOCompraProduto {
    ConverteData converte = new ConverteData();
    private int lastId;

    public int getLastId() {
        return lastId;
    }

    public String incluir(CompraProduto obj) {
        String mensagem;
        String sql = "insert into compraproduto (codSorveteria,codFornecedor,dataCompraProduto) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodSorveteria().getCodSorveteria());
            pst.setInt(2, obj.getCodFornecedor().getCodFornecedor());
            pst.setDate(3, converte.converteBanco(obj.getDataCompraProduto()));

            if (pst.executeUpdate() > 0) {
                 ResultSet rs = pst.getGeneratedKeys();// retorna o último codCompraProduto cadastrado
                if (rs.next()) {
                    lastId = rs.getInt(1); //armazena o último codCompraProduto cadastrado
                }
                mensagem = "Compra cadastrada com sucesso";
            } else {
                mensagem = "Compra não cadastrado!";
            }
            pst.close();
        } catch (SQLException e) {
            mensagem = e.getMessage();
        }
        return mensagem;
    }

    public String remove(CompraProduto obj) {
        String mensagem;
        String sql = "delete from compraProduto where codCompra=?";
        try {
            PreparedStatement stmt = Conexao.getPreparedStatement(sql);
            stmt.setInt(1, obj.getCodCompra());
            if (stmt.executeUpdate() > 0) {
                mensagem = "Compra cancelada";
            } else {
                mensagem = "Compra não cancelada";
            }
            stmt.close();
        } catch (SQLException e) {
            mensagem = e.getMessage() + "\nComando SQL = " + sql;

        }
        return mensagem;
    }

}

    

