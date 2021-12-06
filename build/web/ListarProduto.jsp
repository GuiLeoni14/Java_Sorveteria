<%-- 
    Document   : ListarProduto
    Created on : 23/04/2021, 18:25:32
    Author     : user
--%>
<%@page import="java.util.List"%>
<%@page import="modelo.Produto"%>
<%@page import="modelo.DAOProduto"%>
<%
    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.listar();
%>
<table border="1" class="fl-table">
    <thead>
        <tr>
            <th>C�DIGO</th>
            <th>PRODUTO</th>
            <th>ESTOQUE</th>
            <th>VALOR</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Produto produto: listaProduto){%>
        <tr>
            <td><%= produto.getCodProduto() %></td>
            <td><%= produto.getNomeProduto()%></td>
            <td><%= produto.getEstoqueProduto() %></td>
            <td><%= produto.getValorProduto() %></td>
            <td><a href="CadastroProduto.jsp?opcao=alterar&codProduto=<%= produto.getCodProduto()%>&nomeProduto=<%= produto.getNomeProduto()%>&estoqueProduto=<%= produto.getEstoqueProduto()%>&valorProduto=<%= produto.getValorProduto()%>">alterar</a></td>
            <td><a href="CadastroProduto.jsp?opcao=excluir&codProduto=<%= produto.getCodProduto()%>&nomeProduto=<%= produto.getNomeProduto()%>&estoqueProduto=<%= produto.getEstoqueProduto()%>&valorProduto=<%= produto.getValorProduto()%>">exluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>
