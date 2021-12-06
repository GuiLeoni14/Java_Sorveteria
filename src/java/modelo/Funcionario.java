/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Luis Roberto
 */
public class Funcionario {
    private String tipoFuncionario, nomeFuncionario, telefoneFuncionario, emailFuncionario;
    private String cpfFuncionario, cargaHorariaFuncionario, rgFuncionario, enderecoFuncionario;
    private Integer codFuncionario;
    private Double salarioFuncionario;
    private Calendar dataNascimentoFuncionario;
    private Sorveteria codSorveteria = new Sorveteria();

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getCargaHorariaFuncionario() {
        return cargaHorariaFuncionario;
    }

    public void setCargaHorariaFuncionario(String cargaHorariaFuncionario) {
        this.cargaHorariaFuncionario = cargaHorariaFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Calendar getDataNascimentoFuncionario() {
        return dataNascimentoFuncionario;
    }

    public void setDataNascimentoFuncionario(Calendar dataNascimentoFuncionario) {
        this.dataNascimentoFuncionario = dataNascimentoFuncionario;
    }

    public Sorveteria getCodSorveteria() {
        return codSorveteria;
    }

    public void setCodSorveteria(Sorveteria codSorveteria) {
        this.codSorveteria = codSorveteria;
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }
    
}
