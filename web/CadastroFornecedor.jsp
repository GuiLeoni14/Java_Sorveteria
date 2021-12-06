<%-- 
    Document   : CadastroForncedor
    Created on : 19/04/2021, 14:26:17
    Author     : user
--%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

              if(document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';
            } else if (document.cadastro.enderecoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
            } else if (document.cadastro.emailFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeFornecedor.value = '';
            document.cadastro.enderecoFornecedor.value = '';
            document.cadastro.horarioFuncionamentoFornecedor.value = '';
            document.cadastro.emailFornecedor.value = '';
            document.cadastro.telefoneFornecedor.value = '';
            document.cadastro.action = 'CadastroFornecedor.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if (document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';
            } else if (document.cadastro.enderecoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
            } else if (document.cadastro.emailFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEFornecedor.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codFornecedor = request.getParameter("codFornecedor");
    if(codFornecedor==null)codFornecedor = "0";
    String nomeFornecedor = request.getParameter("nomeFornecedor");
    String enderecoFornecedor = request.getParameter("enderecoFornecedor");
    String horarioFuncionamentoFornecedor = request.getParameter("horarioFuncionamentoFornecedor");
    String emailFornecedor = request.getParameter("emailFornecedor");
    String telefoneFornecedor = request.getParameter("telefoneFornecedor");
%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>Cadastro Fornecedor</title>
    </head>
    <body>
        <h1>Cadastro fornecedor</h1>
        <form name="cadastro" >
            <p>  <label>Fornecedor: </label>    <input type="text" name="nomeFornecedor" value="<%= (nomeFornecedor==null)?"":nomeFornecedor %>" size="50" /></p>
            <p>  <label>Endereço: </label>    <input type="text" name="enderecoFornecedor" value="<%= (enderecoFornecedor==null)?"":enderecoFornecedor %>" size="50" /></p>
            <p>  <label>Horário de Fucionamento: </label>    <input type="text" name="horarioFuncionamentoFornecedor" value="<%= (horarioFuncionamentoFornecedor==null)?"":horarioFuncionamentoFornecedor %>" size="50" /></p>
            <p>  <label>Email: </label>    <input type="text" name="emailFornecedor" value="<%= (emailFornecedor==null)?"":emailFornecedor %>" size="50" /></p>
            <p>  <label>Telefone: </label>    <input type="text" name="telefoneFornecedor" value="<%= (telefoneFornecedor==null)?"":telefoneFornecedor %>" size="50" /></p>
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
            <input type="hidden" name="codFornecedor" value="<%= codFornecedor %>"/>
            <br><br>
            <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
        <%= (mensagem==null)?"":mensagem %>
        </textarea>
        </form>
        <br>
        <%@include file="ListarFornecedor.jsp" %>
    </body>
</html>
