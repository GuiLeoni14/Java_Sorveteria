/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author user
 */
public class ItensVenda {
    private Integer codItemVenda, codVenda;
    private Produto codProduto = new Produto();
    private Double valorVendaProduto;
    private Integer quantidadeVenda;

    public Integer getCodItemVenda() {
        return codItemVenda;
    }

    public void setCodItemVenda(Integer codItemVenda) {
        this.codItemVenda = codItemVenda;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

  

    public Produto getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produto codProduto) {
        this.codProduto = codProduto;
    }

    public Double getValorVendaProduto() {
        return valorVendaProduto;
    }

    public void setValorVendaProduto(Double valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }

    

    public Integer getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(Integer quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

   
    
    
    
    
}
