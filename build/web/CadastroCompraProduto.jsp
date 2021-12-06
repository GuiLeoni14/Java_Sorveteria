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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CAIXA</title>
    </head>
    <body>
        <h1>CAIXA Nº VENDA: <%= codCompra%> - <%= CodSorveteria%></h1>
        <form name="cadastro">

            <p>  <label> Sorveteria:</label> 
                <select name="codSorveteria">
                    <% for (Sorveteria lista : listaSorveteria) { %>
                    <% if (CodSorveteria.equals(String.valueOf(lista.getCodSorveteria()))) {%>
                    <option selected value="<%= lista.getCodSorveteria()%>"><%= lista.getNomeSorveteria()%></option>
                    <%} else {%>
                    <option  value="<%= lista.getCodSorveteria()%>"><%= lista.getNomeSorveteria()%></option>
                    <% }%>
                    <% }%>
                </select></p>
                 
                <p>  <label> Fornecedor:</label> 
                <select name="codFornecedor">
                    <% for (Fornecedor lista : listaFornecedor) { %>
                    <% if (CodFornecedor.equals(String.valueOf(lista.getCodFornecedor()))) {%>
                    <option selected value="<%= lista.getCodFornecedor()%>"><%= lista.getNomeFornecedor()%></option>
                    <%} else {%>
                    <option  value="<%= lista.getCodFornecedor()%>"><%= lista.getNomeFornecedor()%></option>
                    <% }%>
                    <% }%>
                </select></p>

            <p>  <label> Data:</label>   <input type="text" name="dataCompraProduto" value="<%= (dataCompraProduto == null) ? "" : dataCompraProduto%>" size="10" /></p>
            
                <% if (!codCompra.equals("0")) { %>
            <table border="0" cellspacing="3" cellpadding="3">
                <tr>
                    <td>
                        <p>  <label> Lista de Produtos:</label> <br>
                            <select name="codProduto" size="10">
                                <% for (Produto lista : listaProduto) {%>
                                <option  value="<%= lista.getCodProduto()%>"><%= lista.getNomeProduto()%> R$: <%= lista.getValorProduto()%></option>
                                <% } %>
                            </select></p>
                    </td>
                    <td>
                        Quant.<br>
                        <input type="text" name="quantidadeCompra" value="1"  size="2" /><br><br>
                        
                        <input type="button" value="Vender" name="vender" onclick="enviar('vender')" />
                    </td>
                    <td>
                        <p>  <label> Produtos Vendidos:</label> <br>
                            <select name="idProdAdquirido" size="10">
                                <% for (ItensCompra lista : listaItens) {%>
                                <option  value="<%= lista.getCodItemCompra() %>"><%= lista.getCodProduto().getNomeProduto()%> Qde: <%= lista.getQuantidadeCompra()%> R$: <%= lista.getValorCompraProduto()%></option>
                                <% } %>
                            </select>
                        <input type="button" value="Remover" name="remover" onclick="enviar('remover')" />
                        </p>
                    </td>
                </tr>

            </table>





            <% } %>
            <% if (codCompra.equals("0")) { %>
            <input type="button" value="Cadastrar" name="cadastrar" onclick="enviar('cadastrar')" />
            <% } %>

            <% if (!codCompra.equals("0")) { %>
            <input type="button" value="Finalizar" name="finalizar" onclick="enviar('finalizar')"/>
            <input type="button" value="Cancelar" name="cancelar" onclick="enviar('cancelar')"/>
            <% }%>

        </p>
        <p><textarea name="mensagem" rows="2" cols="60">
                <%= (mensagem == null) ? "" : mensagem%></textarea></p>

        <input type="hidden" name="opcao" />
        <input type="hidden" name="codCompra" value="<%= codCompra%>"/>
      </form> 


</body>
</html>
