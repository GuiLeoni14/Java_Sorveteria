<%-- 
    Document   : CadastroFuncionario
    Created on : 30/04/2021, 00:01:58
    Author     : Guilherme
--%>
<%@page import="modelo.Funcionario"%>
<%@page import="modelo.DAOFuncionario"%>
<%@page import="modelo.ConverteData"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="modelo.ItensVenda"%>
<%@page import="modelo.DAOItensVenda"%>
<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.DAOCliente"%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {
               
              if(document.cadastro.dataVendaProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CRUDVendaProduto.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'vender') {
            if (document.cadastro.codProduto.value == '') {
                document.cadastro.mensagem.value = 'Selecione um produto para venda';
            } else {
            document.cadastro.opcao.value = 'vender';
            document.cadastro.action = 'CRUDVendaProduto.jsp';
            document.cadastro.submit();
        }
    }else if (par == 'remover') {
            if (document.cadastro.idProdAdquirido.value == '') {
                document.cadastro.mensagem.value = 'Selecione um produto para remover';
            } else {
            document.cadastro.opcao.value = 'remover';
            document.cadastro.action = 'CRUDVendaProduto.jsp';
            document.cadastro.submit();
        }
    }
            /// }
         else if (par == 'finalizar') {
            document.cadastro.opcao.value = 'finalizar';
            document.cadastro.action = 'CRUDVendaProduto.jsp';
            document.cadastro.submit();
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cancelar';
            document.cadastro.action = 'CRUDVendaProduto.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
   ConverteData data = new ConverteData();
   String dataAtual = data.dataAtual();
    
    DAOCliente daoCliente = new DAOCliente();
    List<Cliente> listaCliente = daoCliente.getLista();

    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.getLista();
    
    DAOFuncionario daoFuncionario = new DAOFuncionario();
    List<Funcionario> listaFuncionario = daoFuncionario.getLista();

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    String codVenda = request.getParameter("codVenda");
    String CodCliente = request.getParameter("codCliente");
    String CodFuncionario = request.getParameter("codFuncionario");
    String dataVendaProduto = request.getParameter("dataVendaProduto");

    if (dataVendaProduto == null) {
       dataVendaProduto = dataAtual;
    }
    if (codVenda == null) {
        codVenda = "0";
        
    }
    if (CodCliente == null) {
        CodCliente = "0";
    }
    if (CodFuncionario == null) {
        CodFuncionario = "0";
    }
    if (opcao == null) {
        opcao = "nulo";
    }

    DAOItensVenda daoItens = new DAOItensVenda();
    List<ItensVenda> listaItens = daoItens.getLista(Integer.parseInt(codVenda));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h1>CAIXA VENDA: <%= codVenda%> - <%= CodCliente%></h1>
                <form name="cadastro" class="form-compra">

                    <p class="p-select">  <label> Cliente:</label> 
                        <select name="codCliente">
                            <% for (Cliente lista : listaCliente) { %>
                            <% if (CodCliente.equals(String.valueOf(lista.getCodCliente()))) {%>
                            <option selected value="<%= lista.getCodCliente()%>"><%= lista.getNomeCliente()%></option>
                            <%} else {%>
                            <option  value="<%= lista.getCodCliente()%>"><%= lista.getNomeCliente()%></option>
                            <% }%>
                            <% }%>
                        </select></p>
                        
                        <p class="p-select">  <label> Funcionario:</label> 
                        <select name="codFuncionario">
                            <% for (Funcionario lista : listaFuncionario) { %>
                            <% if (CodFuncionario.equals(String.valueOf(lista.getCodFuncionario()))) {%>
                            <option selected value="<%= lista.getCodFuncionario()%>"><%= lista.getNomeFuncionario()%></option>
                            <%} else {%>
                            <option  value="<%= lista.getCodFuncionario()%>"><%= lista.getNomeFuncionario()%></option>
                            <% }%>
                            <% }%>
                        </select></p>

                    <p class="p-data">  <label> Data:</label>   <input type="text" name="dataVendaProduto" value="<%= (dataVendaProduto == null) ? "" : dataVendaProduto%>" size="10" /></p>
                    
                        <% if (!codVenda.equals("0")) { %>
                    <table border="0" cellspacing="3" cellpadding="3">
                        <tr>
                            <td>
                                <p class="p-lista">  <label> Lista de Produtos:</label> <br>
                                    <select name="codProduto" size="10">
                                        <% for (Produto lista : listaProduto) {%>
                                        <option  value="<%= lista.getCodProduto()%>"><%= lista.getNomeProduto()%> R$: <%= lista.getValorProduto()%></option>
                                        <% } %>
                                    </select></p>
                            </td>
                            <td>
                                Quant.<br>
                                <input type="text" name="quantidadeVenda" value="1"  size="2" /><br><br>
                                
                                <input type="button" value="Vender" class="btn-alterar" name="vender" onclick="enviar('vender')" />
                            </td>
                            <td>
                                <p class="p-lista">  <label> Produtos Vendidos:</label> <br>
                                    <select name="idProdAdquirido" size="10">
                                        <% for (ItensVenda lista : listaItens) {%>
                                        <option  value="<%= lista.getCodItemVenda() %>"><%= lista.getCodProduto().getNomeProduto()%> Qde: <%= lista.getQuantidadeVenda()%> R$: <%= lista.getValorVendaProduto()%></option>
                                        <% } %>
                                    </select>
                                <input type="button" value="Remover" class="btn-excluir" name="remover" onclick="enviar('remover')" />
                                </p>
                            </td>
                        </tr>
                    </table>
                    <% } %>
                    <% if (codVenda.equals("0")) { %>
                    <input type="button" class="btn-cadastrar" value="Cadastrar" name="cadastrar" onclick="enviar('cadastrar')" />
                    <% } %>

                    <% if (!codVenda.equals("0")) { %>
                    <input type="button" class="btn-cadastrar" value="Finalizar" name="finalizar" onclick="enviar('finalizar')"/>
                    <br>
                    <input type="button" value="Cancelar" class="btn-cancelar" name="cancelar" onclick="enviar('cancelar')"/>
                    <% }%>
                </p>
                <p><textarea name="mensagem" rows="2" cols="60">
                        <%= (mensagem == null) ? "" : mensagem%></textarea></p>

                <input type="hidden" name="opcao" />
                <input type="hidden" name="codVenda" value="<%= codVenda%>"/>
            </form>
        </div>
    </section> 
    <%@include file="footer.jsp" %>
    </body>
    <script src="./static/js/index.js" ></script>
</html>
