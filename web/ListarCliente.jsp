<%-- 
    Document   : ListarCliente
    Created on : 19/04/2021, 17:02:32
    Author     : user
--%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.DAOCliente"%>
<%
    DAOCliente daoCliente = new DAOCliente();
    List<Cliente> listaCliente = daoCliente.listar();
%>
<table border="1" class="fl-table">
    <thead>
        <tr>
            <th>C�DIGO</th>
            <th>CLIENTE</th>
            <th>ENDERE�O</th>
            <th>EMAIL</th>
            <th>TELEFONE</th>
            <th>CPF</th>
            <th>DATA DE NASCIMENTO</th>
            <th>RG</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Cliente cliente: listaCliente){%>
        <tr>
            <td><%= cliente.getCodCliente() %></td>
            <td><%= cliente.getNomeCliente()%></td>
            <td><%= cliente.getEnderecoCliente() %></td>
            <td><%= cliente.getEmailCliente() %></td>
            <td><%= cliente.getTelefoneCliente() %></td>
            <td><%= cliente.getCpfCliente() %></td>
            <td><%= cliente.getDataNascimentoCliente() %></td>
            <td><%= cliente.getRgCliente() %></td>
            <td><a href="CadastroCliente.jsp?opcao=alterar&codCliente=<%= cliente.getCodCliente()%>&nomeCliente=<%= cliente.getNomeCliente()%>&enderecoCliente=<%= cliente.getEnderecoCliente()%>&emailCliente=<%= cliente.getEmailCliente()%>&telefoneCliente=<%= cliente.getTelefoneCliente()%>&cpfCliente=<%= cliente.getCpfCliente()%>&dataNascimentoCliente=<%= cliente.getDataNascimentoCliente()%>&rgCliente=<%= cliente.getRgCliente()%>">alterar</a></td>
            <td><a href="CadastroCliente.jsp?opcao=excluir&codCliente=<%= cliente.getCodCliente()%>&nomeCliente=<%= cliente.getNomeCliente()%>&enderecoCliente=<%= cliente.getEnderecoCliente()%>&emailCliente=<%= cliente.getEmailCliente()%>&telefoneCliente=<%= cliente.getTelefoneCliente()%>&cpfCliente=<%= cliente.getCpfCliente()%>&dataNascimentoCliente=<%= cliente.getDataNascimentoCliente()%>&rgCliente=<%= cliente.getRgCliente()%>">exluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>