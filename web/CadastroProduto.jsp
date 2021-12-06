<%-- 
    Document   : CadastroProduto
    Created on : 19/04/2021, 14:26:17
    Author     : user
--%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

              if(document.cadastro.nomeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Produto';
            } else if (document.cadastro.estoqueProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Estoque';
            } else if (document.cadastro.valorProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Valor';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEProduto.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeProduto.value = '';
            document.cadastro.estoqueProduto.value = '';
            document.cadastro.valorProduto.value = '';
            document.cadastro.action = 'CadastroProduto.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if(document.cadastro.nomeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Produto';
            } else if (document.cadastro.estoqueProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Estoque';
            } else if (document.cadastro.valorProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Valor';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEProduto.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEProduto.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codProduto = request.getParameter("codProduto");
    if(codProduto==null)codProduto = "0";
    String nomeProduto = request.getParameter("nomeProduto");
    String estoqueProduto = (request.getParameter("estoqueProduto"));
    String valorProduto = request.getParameter("valorProduto"); 
%>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>Cadastro Produto</title>
    </head>
    <body>
        <h1>Cadastro produto</h1>
        <form name="cadastro" >
            <p>  <label>Produto: </label>    <input type="text" name="nomeProduto" value="<%= (nomeProduto==null)?"":nomeProduto %>" size="50" /></p>
            <p>  <label>Estoque: </label>    <input type="text" name="estoqueProduto" value="<%= (estoqueProduto==null)?"":estoqueProduto %>" size="50" /></p>
            <p>  <label>Valor: </label>    <input type="text" name="valorProduto" value="<%= (valorProduto==null)?"":valorProduto %>" size="50" /></p>
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
            <input type="hidden" name="codProduto" value="<%= codProduto %>"/>
            <br><br>
            <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
        <%= (mensagem==null)?"":mensagem %>
        </textarea>
        </form>
        <br>
        <%@include file="ListarProduto.jsp" %>
    </body>
</html>
