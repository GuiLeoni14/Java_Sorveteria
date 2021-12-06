/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class CompraProduto {
    private Integer codCompra;
    private Sorveteria codSorveteria = new Sorveteria();
    private Fornecedor codFornecedor = new Fornecedor();
    private Calendar dataCompraProduto;


    public Sorveteria getCodSorveteria() {
        return codSorveteria;
    }

    public void setCodSorveteria(Sorveteria codSorveteria) {
        this.codSorveteria = codSorveteria;
    }

    public Fornecedor getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Fornecedor codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Calendar getDataCompraProduto() {
        return dataCompraProduto;
    }

    public void setDataCompraProduto(Calendar dataCompraProduto) {
        this.dataCompraProduto = dataCompraProduto;
    }

    
    
}

    

