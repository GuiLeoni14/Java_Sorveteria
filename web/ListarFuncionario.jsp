<%-- 
    Document   : ListarFuncionario
    Created on : 30/04/2021, 00:17:15
    Author     : Luis Roberto
--%>
<%@page import="modelo.ConverteData"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Funcionario"%>
<%@page import="modelo.DAOFuncionario"%>
<%
    DAOFuncionario daoFuncionario = new DAOFuncionario();
    List<Funcionario> listaFuncionario = daoFuncionario.listar();
    ConverteData converte = new ConverteData();
%>
<table border="1" class="fl-table">
    <thead>
        <tr>
            <th>CODIGO</th>
            <th>SORVETERIA</th>
            <th>CARGO</th>
            <th>FUNCIONARIO</th>
            <th>ENDERECO</th>
            <%-- <th>EMAIL</th> --%>
            <th>TELEFONE</th>
            <%-- <th>CPF</th> --%>
            <th>DATA DE NASCIMENTO</th>
            <%-- <th>RG</th> --%>
            <%-- <th>CARGA HORARIA</th> --%>
            <th>SALARIO</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Funcionario funcionario: listaFuncionario){%>
        <tr>
            <td><%= funcionario.getCodFuncionario() %></td>
            <td><%= funcionario.getCodSorveteria().getNomeSorveteria()%></td>
            <td><%= funcionario.getTipoFuncionario() %></td>
            <td><%= funcionario.getNomeFuncionario()%></td>
            <td><%= funcionario.getEnderecoFuncionario() %></td>
            <%-- <td><%= funcionario.getEmailFuncionario() %></td> --%>
            <td><%= funcionario.getTelefoneFuncionario() %></td>
            <%-- <td><%= funcionario.getCpfFuncionario() %></td> --%>
            <td><%= converte.converteTela(funcionario.getDataNascimentoFuncionario()) %></td>
            <%-- <td><%= funcionario.getRgFuncionario() %></td> --%>
            <%-- <td><%= funcionario.getCargaHorariaFuncionario() %></td> --%>
            <td><%= funcionario.getSalarioFuncionario() %></td>
            <td><a href="CadastroFuncionario.jsp?opcao=alterar&codFuncionario=<%= funcionario.getCodFuncionario()%>&codSorveteria=<%= funcionario.getCodSorveteria().getNomeSorveteria()%>&tipoFuncionario=<%= funcionario.getTipoFuncionario()%>&nomeFuncionario=<%= funcionario.getNomeFuncionario()%>&enderecoFuncionario=<%= funcionario.getEnderecoFuncionario()%>&emailFuncionario=<%= funcionario.getEmailFuncionario()%>&telefoneFuncionario=<%= funcionario.getTelefoneFuncionario()%>&cpfFuncionario=<%= funcionario.getCpfFuncionario()%>&dataNascimentoFuncionario=<%= converte.converteTela(funcionario.getDataNascimentoFuncionario())%>&rgFuncionario=<%= funcionario.getRgFuncionario()%>&cargaHorariaFuncionario=<%= funcionario.getCargaHorariaFuncionario()%>&salarioFuncionario=<%= funcionario.getSalarioFuncionario()%>">alterar</a></td>
            <td><a href="CadastroFuncionario.jsp?opcao=excluir&codFuncionario=<%= funcionario.getCodFuncionario()%>&codSorveteria=<%= funcionario.getCodSorveteria().getNomeSorveteria()%>&tipoFuncionario=<%= funcionario.getTipoFuncionario()%>&nomeFuncionario=<%= funcionario.getNomeFuncionario()%>&enderecoFuncionario=<%= funcionario.getEnderecoFuncionario()%>&emailFuncionario=<%= funcionario.getEmailFuncionario()%>&telefoneFuncionario=<%= funcionario.getTelefoneFuncionario()%>&cpfFuncionario=<%= funcionario.getCpfFuncionario()%>&dataNascimentoFuncionario=<%= converte.converteTela(funcionario.getDataNascimentoFuncionario())%>&rgFuncionario=<%= funcionario.getRgFuncionario()%>&cargaHorariaFuncionario=<%= funcionario.getCargaHorariaFuncionario()%>&salarioFuncionario=<%= funcionario.getSalarioFuncionario()%>">excluir</a></td>
        </tr>
        <% } %>
    </tbody>
</table>