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
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;500;600;800&family=Roboto:wght@100;300;400;500;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
        <link rel="stylesheet" href="./static/css/main.css">
        <title>Cadastro Produto</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <section class="s-cadastro">
            <div class="container">
                <h1>Cadastro produto</h1>
                <form name="cadastro" >
                    <p>  <label>Produto: </label>    <input type="text" name="nomeProduto" value="<%= (nomeProduto==null)?"":nomeProduto %>" size="50" /></p>
                    <p>  <label>Estoque: </label>    <input type="text" name="estoqueProduto" value="<%= (estoqueProduto==null)?"":estoqueProduto %>" size="50" /></p>
                    <p>  <label>Valor: </label>    <input type="text" name="valorProduto" value="<%= (valorProduto==null)?"":valorProduto %>" size="50" /></p>
                    <div class="buttons-form">
                        <% if(opcao.equals("cadastrar")){ %>
                        <input type="button" class="btn-cadastrar" value="Cadastrar" name="cadastrar" onclick="enviar('cadastrar')" />
                        <%}%>
                        <% if(opcao.equals("alterar")){ %>
                        <input type="button" value="Alterar" class="btn-alterar" name="alterar" onclick="enviar('alterar')" />
                        <input type="button" class="btn-cancelar" value="Cancelar" name="cancelar" onclick="enviar('cancelar')" />
                        <%}%>
                        <% if(opcao.equals("excluir")){ %>
                        <input type="button" value="Excluir" class="btn-excluir" name="excluir" onclick="enviar('excluir')" />
                        <input type="button" value="Cancelar" class="btn-cancelar" name="cancelar" onclick="enviar('cancelar')" />
                        <%}%>
                    </div>
                    <input type="hidden" name="opcao" value="<%= opcao %>"/>
                    <input type="hidden" name="codProduto" value="<%= codProduto %>"/>
                    <br><br>
                    <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
                <%= (mensagem==null)?"":mensagem %>
                </textarea>
                </form>
                <br>
                <%@include file="ListarProduto.jsp" %>    
            </div>
        </section>
        <script src="./static/js/index.js" ></script>
    </body>
</html>
