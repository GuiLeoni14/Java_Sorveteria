<%-- 
    Document   : CadastroFornecedor
    Created on : 30/04/2021, 00:01:58
    Author     : Guilherme
--%>
<%@page import="modelo.Fornecedor"%>
<%@page import="modelo.DAOFornecedor"%>
<%@page import="modelo.ConverteData"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="modelo.ItensCompra"%>
<%@page import="modelo.DAOItensCompra"%>
<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Sorveteria"%>
<%@page import="modelo.DAOSorveteria"%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {
               
              if(document.cadastro.dataCompraProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CRUDCompraProduto.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'vender') {
            if (document.cadastro.codProduto.value == '') {
                document.cadastro.mensagem.value = 'Selecione um produto para venda';
            } else {
            document.cadastro.opcao.value = 'vender';
            document.cadastro.action = 'CRUDCompraProduto.jsp';
            document.cadastro.submit();
        }
    }else if (par == 'remover') {
            if (document.cadastro.idProdAdquirido.value == '') {
                document.cadastro.mensagem.value = 'Selecione um produto para remover';
            } else {
            document.cadastro.opcao.value = 'remover';
            document.cadastro.action = 'CRUDCompraProduto.jsp';
            document.cadastro.submit();
        }
    }
            /// }
         else if (par == 'finalizar') {
            document.cadastro.opcao.value = 'finalizar';
            document.cadastro.action = 'CRUDCompraProduto.jsp';
            document.cadastro.submit();
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cancelar';
            document.cadastro.action = 'CRUDCompraProduto.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
   ConverteData data = new ConverteData();
   String dataAtual = data.dataAtual();
    
    DAOSorveteria daoSorveteria = new DAOSorveteria();
    List<Sorveteria> listaSorveteria = daoSorveteria.getLista();

    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.getLista();
    
    DAOFornecedor daoFornecedor = new DAOFornecedor();
    List<Fornecedor> listaFornecedor = daoFornecedor.getLista();

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    //System.out.println(opcao);
    String codCompra = request.getParameter("codCompra");
    String CodSorveteria = request.getParameter("codSorveteria");
    String CodFornecedor = request.getParameter("codFornecedor");
    String dataCompraProduto = request.getParameter("dataCompraProduto");

    if (dataCompraProduto == null) {
       dataCompraProduto = dataAtual;
    }
    if (codCompra == null) {
        codCompra = "0";
        
    }
    if (CodSorveteria == null) {
        CodSorveteria = "0";
    }
    if (CodFornecedor == null) {
        CodFornecedor = "0";
    }
    if (opcao == null) {
        opcao = "nulo";
    }

    DAOItensCompra daoItens = new DAOItensCompra();
    List<ItensCompra> listaItens = daoItens.getLista(Integer.parseInt(codCompra));
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
                <h1>CAIXA COMPRA: <%= codCompra%> - <%= CodSorveteria%></h1>
                <form name="cadastro" class="form-compra">
                <p class="p-select">  <label> Sorveteria:</label> 
                    <select name="codSorveteria">
                        <% for (Sorveteria lista : listaSorveteria) { %>
                        <% if (CodSorveteria.equals(String.valueOf(lista.getCodSorveteria()))) {%>
                        <option selected value="<%= lista.getCodSorveteria()%>"><%= lista.getNomeSorveteria()%></option>
                        <%} else {%>
                        <option  value="<%= lista.getCodSorveteria()%>"><%= lista.getNomeSorveteria()%></option>
                        <% }%>
                        <% }%>
                    </select></p>
                    
                    <p class="p-select">  <label> Fornecedor:</label> 
                    <select name="codFornecedor">
                        <% for (Fornecedor lista : listaFornecedor) { %>
                        <% if (CodFornecedor.equals(String.valueOf(lista.getCodFornecedor()))) {%>
                        <option selected value="<%= lista.getCodFornecedor()%>"><%= lista.getNomeFornecedor()%></option>
                        <%} else {%>
                        <option  value="<%= lista.getCodFornecedor()%>"><%= lista.getNomeFornecedor()%></option>
                        <% }%>
                        <% }%>
                    </select></p>

                <p class="p-data">  <label> Data:</label>   <input type="text" name="dataCompraProduto" value="<%= (dataCompraProduto == null) ? "" : dataCompraProduto%>" size="10" /></p>
                
                    <% if (!codCompra.equals("0")) { %>
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
                            <input type="text" name="quantidadeCompra" value="1"  size="2" /><br><br>
                            
                            <input type="button" class="btn-alterar" value="Vender" name="vender" onclick="enviar('vender')" />
                        </td>
                        <td>
                            <p class="p-lista">  <label> Produtos Vendidos:</label> <br>
                                <select name="idProdAdquirido" size="10">
                                    <% for (ItensCompra lista : listaItens) {%>
                                    <option  value="<%= lista.getCodItemCompra() %>"><%= lista.getCodProduto().getNomeProduto()%> Qde: <%= lista.getQuantidadeCompra()%> R$: <%= lista.getValorCompraProduto()%></option>
                                    <% } %>
                                </select>
                            <input type="button" class="btn-excluir" value="Remover" name="remover" onclick="enviar('remover')" />
                            </p>
                        </td>
                    </tr>
                </table>
                <% } %>
                <% if (codCompra.equals("0")) { %>
                <input type="button" class="btn-cadastrar" value="Cadastrar" name="cadastrar" onclick="enviar('cadastrar')" />
                <% } %>

                <% if (!codCompra.equals("0")) { %>
                <input type="button" class="btn-cadastrar" value="Finalizar" name="finalizar" onclick="enviar('finalizar')"/>
                <br>
                <input type="button" value="Cancelar" class="btn-cancelar" name="cancelar" onclick="enviar('cancelar')"/>
                <% }%>
                </p>
                <p><textarea name="mensagem" rows="2" cols="60">
                        <%= (mensagem == null) ? "" : mensagem%></textarea></p>

                <input type="hidden" name="opcao" />
                <input type="hidden" name="codCompra" value="<%= codCompra%>"/>
                </form> 
            </div>
        </section>
        <%@include file="footer.jsp" %>
</body>
<script src="./static/js/index.js" ></script>
</html>
