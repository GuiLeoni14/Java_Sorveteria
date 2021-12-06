<%-- 
    Document   : ListarVendaProduto
    Created on : 30/04/2021, 00:17:15
    Author     : Guilherme
--%>
<%@page import="modelo.ConverteData"%>
<%@page import="java.util.List"%>
<%@page import="modelo.VendaProduto"%>
<%@page import="modelo.DAOVendaProduto"%>
<%
    DAOVendaProduto daoVendaProduto = new DAOVendaProduto();
    List<VendaProduto> listaVendaProduto = daoVendaProduto.listar();
    ConverteData converte = new ConverteData();
%>
<table border="1">
    <thead>
        <tr>
            <th>CÓDIGO</th>
            <th>CLIENTE</th>
            <th>FUNCIONARIO</th>
            <th>DATA</th>           
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (VendaProduto vendaProduto: listaVendaProduto){%>
        <tr>
            <td><%= vendaProduto.getCodVendaProduto() %></td>
            <td><%= vendaProduto.getCodCliente().getNomeCliente()%></td>
            <td><%= vendaProduto.getCodFuncionario().getNomeFuncionario()%></td>
            <td><%= converte.converteTela(vendaProduto.getDataVendaProduto()) %></td>
            <td><a href="CadastroVendaProduto.jsp?opcao=alterar&codVenda=<%= vendaProduto.getCodVendaProduto()%>&codCliente=<%= vendaProduto.getCodCliente().getNomeCliente()%>&codFuncionario=<%= vendaProduto.getCodFuncionario().getNomeFuncionario()%>&dataVendaProduto=<%= converte.converteTela(vendaProduto.getDataVendaProduto())%>">alterar</a></td>
            <td><a href="CadastroVendaProduto.jsp?opcao=excluir&codVenda=<%= vendaProduto.getCodVendaProduto()%>&codCliente=<%= vendaProduto.getCodCliente().getNomeCliente()%>&codFuncionario=<%= vendaProduto.getCodFuncionario().getNomeFuncionario()%>&dataVendaProduto=<%= converte.converteTela(vendaProduto.getDataVendaProduto())%>">excluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>