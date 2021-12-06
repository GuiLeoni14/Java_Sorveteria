/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * 
 */
public class VendaProduto {
    private Integer codVenda;
    private Cliente codCliente = new Cliente();
    private Funcionario codFuncionario = new Funcionario();
    private Calendar dataVendaProduto;


    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public Funcionario getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Calendar getDataVendaProduto() {
        return dataVendaProduto;
    }

    public void setDataVendaProduto(Calendar dataVendaProduto) {
        this.dataVendaProduto = dataVendaProduto;
    }

    
    
}
