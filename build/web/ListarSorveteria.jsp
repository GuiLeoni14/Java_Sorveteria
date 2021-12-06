<%-- 
    Document   : ListarSorveteria
    Created on : 20/04/2021, 19:29:44
    Author     : user
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Sorveteria"%>
<%@page import="modelo.DAOSorveteria"%>
<%
    DAOSorveteria daoSorveteria = new DAOSorveteria();
    List<Sorveteria> listaSorveteria = daoSorveteria.listar();
%>
<table border="1" class="fl-table">
    <thead>
        <tr>
            <th>C�DIGO</th>
            <th>FORNECEDOR</th>
            <th>ENDERE�O</th>
            <th>HOR�RIO DE FUNCIONAMENTO</th>
            <th>EMAIL</th>
            <th>TELEFONE</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Sorveteria sorveteria: listaSorveteria){%>
        <tr>
            <td><%= sorveteria.getCodSorveteria() %></td>
            <td><%= sorveteria.getNomeSorveteria()%></td>
            <td><%= sorveteria.getEnderecoSorveteria() %></td>
            <td><%= sorveteria.getHorarioFuncionamentoSorveteria() %></td>
            <td><%= sorveteria.getEmailSorveteria() %></td>
            <td><%= sorveteria.getTelefoneSorveteria() %></td>
            <td><a href="CadastroSorveteria.jsp?opcao=alterar&codSorveteria=<%= sorveteria.getCodSorveteria()%>&nomeSorveteria=<%= sorveteria.getNomeSorveteria()%>&enderecoSorveteria=<%= sorveteria.getEnderecoSorveteria()%>&horarioFuncionamentoSorveteria=<%= sorveteria.getHorarioFuncionamentoSorveteria()%>&emailSorveteria=<%= sorveteria.getEmailSorveteria()%>&telefoneSorveteria=<%= sorveteria.getTelefoneSorveteria()%>">alterar</a></td>
            <td><a href="CadastroSorveteria.jsp?opcao=excluir&codSorveteria=<%= sorveteria.getCodSorveteria()%>&nomeSorveteria=<%= sorveteria.getNomeSorveteria()%>&enderecoSorveteria=<%= sorveteria.getEnderecoSorveteria()%>&horarioFuncionamentoSorveteria=<%= sorveteria.getHorarioFuncionamentoSorveteria()%>&emailSorveteria=<%= sorveteria.getEmailSorveteria()%>&telefoneSorveteria=<%= sorveteria.getTelefoneSorveteria()%>">exluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>
