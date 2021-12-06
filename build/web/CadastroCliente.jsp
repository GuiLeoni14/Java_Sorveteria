<%-- 
    Document   : CadastroCliente
    Created on : 19/04/2021, 14:26:17
    Author     : user
--%>
<%@page import="java.util.Calendar"%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

              if(document.cadastro.nomeCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cliente';
            } else if (document.cadastro.enderecoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.emailCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.cpfCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.dataNascimentoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';
            } else if (document.cadastro.rgCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAECliente.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeCliente.value = '';
            document.cadastro.enderecoCliente.value = '';
            document.cadastro.emailCliente.value = '';
            document.cadastro.telefoneCliente.value = '';
            document.cadastro.cpfCliente.value = '';
            document.cadastro.dataNascimentoCliente.value = '';
            document.cadastro.rgCliente.value = '';
            document.cadastro.action = 'CadastroCliente.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if(document.cadastro.nomeCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cliente';
            } else if (document.cadastro.enderecoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.emailCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.cpfCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.dataNascimentoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';
            } else if (document.cadastro.rgCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAECliente.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAECliente.jsp';
            document.cadastro.submit();
        }     
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codCliente = request.getParameter("codCliente");
    if(codCliente==null)codCliente = "0";
    String nomeCliente = request.getParameter("nomeCliente");
    String enderecoCliente = request.getParameter("enderecoCliente");
    String emailCliente = request.getParameter("emailCliente");
    String telefoneCliente = request.getParameter("telefoneCliente");
    String cpfCliente = request.getParameter("cpfCliente");
    //java.sql.Date dt = rs.getDate("dataNascimentoCliente");
    //Calendar c = (Calendar) value;
    //return sdf.format(c.getTime());
    String dataNascimentoCliente = request.getParameter("dataNascimentoCliente");
    String rgCliente = request.getParameter("rgCliente");         
%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>Cadastro Cliente</title>
    </head>
    <body>
        <h1>Cadastro Cliente</h1>
        <form name="cadastro" >
            <p>  <label>Cliente: </label>    <input type="text" name="nomeCliente" value="<%= (nomeCliente==null)?"":nomeCliente %>" size="50" /></p>
            <p>  <label>Endereço: </label>    <input type="text" name="enderecoCliente" value="<%= (enderecoCliente==null)?"":enderecoCliente %>" size="50" /></p>            
            <p>  <label>Email: </label>    <input type="text" name="emailCliente" value="<%= (emailCliente==null)?"":emailCliente %>" size="50" /></p>
            <p>  <label>Telefone: </label>    <input type="text" name="telefoneCliente" value="<%= (telefoneCliente==null)?"":telefoneCliente %>" size="50" /></p>
            <p>  <label>CPF: </label>    <input type="text" name="cpfCliente" value="<%= (cpfCliente==null)?"":cpfCliente %>" size="50" /></p>
            <p>  <label>Data de Nascimento: </label>    <input type="text" name="dataNascimentoCliente" value="<%= (dataNascimentoCliente==null)?"":dataNascimentoCliente %>" size="50" /></p>
            <p>  <label>RG: </label>    <input type="text" name="rgCliente" value="<%= (rgCliente==null)?"":rgCliente %>" size="50" /></p>
            <% if(opcao.equals("cadastrar")){ %>
            <input type="button" value="Cadastrar" name="cadastrar" onclick="enviar('cadastrar')" />
            <%}%>
            <% if(opcao.equals("alterar")){ %>
            <input type="button" value="Alterar" name="alterar" onclick="enviar('alterar')" />
            <input type="button" value="Cancelar" name="cancelar" onclick="enviar('cancelar')" />
            <%}%>
            <% if(opcao.equals("excluir")){ %>
            <input type="button" value="Excluir" name="excluir" onclick="enviar('excluir')" />
            <input type="button" value="Cancelar" name="cancelar" onclick="enviar('cancelar')" />
            <%}%>
            <input type="hidden" name="opcao" value="<%= opcao %>"/>
            <input type="hidden" name="codCliente" value="<%= codCliente %>"/>
            <br><br>
            <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
        <%= (mensagem==null)?"":mensagem %>
        </textarea>
        </form>
        <br>
        <%@include file="ListarCliente.jsp" %>
    </body>
</html>