<%-- 
    Document   : ListarFornecedor
    Created on : 19/04/2021, 17:02:32
    Author     : user
--%>
<%@page import="java.util.List"%>
<%@page import="modelo.Fornecedor"%>
<%@page import="modelo.DAOFornecedor"%>
<%
    DAOFornecedor daoFornecedor = new DAOFornecedor();
    List<Fornecedor> listaFornecedor = daoFornecedor.listar();
%>
<table border="1" class="fl-table">
    <thead>
        <tr>
            <th>CODIGO</th>
            <th>FORNECEDOR</th>
            <th>ENDERECO</th>
            <th>HORARIO DE FUNCIONAMENTO</th>
            <th>EMAIL</th>
            <th>TELEFONE</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Fornecedor fornecedor: listaFornecedor){%>
        <tr>
            <td><%= fornecedor.getCodFornecedor() %></td>
            <td><%= fornecedor.getNomeFornecedor()%></td>
            <td><%= fornecedor.getEnderecoFornecedor() %></td>
            <td><%= fornecedor.getHorarioFuncionamentoFornecedor() %></td>
            <td><%= fornecedor.getEmailFornecedor() %></td>
            <td><%= fornecedor.getTelefoneFornecedor() %></td>
            <td><a href="CadastroFornecedor.jsp?opcao=alterar&codFornecedor=<%= fornecedor.getCodFornecedor()%>&nomeFornecedor=<%= fornecedor.getNomeFornecedor()%>&enderecoFornecedor=<%= fornecedor.getEnderecoFornecedor()%>&horarioFuncionamentoFornecedor=<%= fornecedor.getHorarioFuncionamentoFornecedor()%>&emailFornecedor=<%= fornecedor.getEmailFornecedor()%>&telefoneFornecedor=<%= fornecedor.getTelefoneFornecedor()%>">alterar</a></td>
            <td><a href="CadastroFornecedor.jsp?opcao=excluir&codFornecedor=<%= fornecedor.getCodFornecedor()%>&nomeFornecedor=<%= fornecedor.getNomeFornecedor()%>&enderecoFornecedor=<%= fornecedor.getEnderecoFornecedor()%>&horarioFuncionamentoFornecedor=<%= fornecedor.getHorarioFuncionamentoFornecedor()%>&emailFornecedor=<%= fornecedor.getEmailFornecedor()%>&telefoneFornecedor=<%= fornecedor.getTelefoneFornecedor()%>">exluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>
