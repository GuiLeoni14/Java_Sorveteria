<%-- 
    Document   : CadastroFuncionario
    Created on : 30/04/2021, 00:01:58
    Author     : Guilherme
--%>
<%@page import="modelo.Sorveteria"%>
<%@page import="modelo.DAOSorveteria"%>
<%@page import="java.util.Calendar"%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

               if(document.cadastro.codSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';
            }else if (document.cadastro.tipoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cargo';
            }else if (document.cadastro.nomeFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Funcionario';
            } else if (document.cadastro.enderecoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endere�o';
            } else if (document.cadastro.emailFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.cpfFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.dataNascimentoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';
            } else if (document.cadastro.rgFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else if (document.cadastro.cargaHorariaFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';
            } else if (document.cadastro.salarioFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Salario';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEFuncionario.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.codSorveteria.value = '';
            document.cadastro.tipoFuncionario.value = '';
            document.cadastro.nomeFuncionario.value = '';
            document.cadastro.enderecoFuncionario.value = '';
            document.cadastro.emailFuncionario.value = '';
            document.cadastro.telefoneFuncionario.value = '';
            document.cadastro.cpfFuncionario.value = '';
            document.cadastro.dataNascimentoFuncionario.value = '';
            document.cadastro.rgFuncionario.value = '';
            document.cadastro.cargaHorariaFuncionario.value = '';
            document.cadastro.salarioFuncionario.value = '';
            document.cadastro.action = 'CadastroFuncionario.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if(document.cadastro.codSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';
            }else if (document.cadastro.tipoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cargo';
            }else if (document.cadastro.nomeFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Funcionario';
            } else if (document.cadastro.enderecoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endere�o';
            } else if (document.cadastro.emailFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.cpfFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.dataNascimentoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';
            } else if (document.cadastro.rgFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else if (document.cadastro.cargaHorariaFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';
            } else if (document.cadastro.salarioFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Salario';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEFuncionario.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEFuncionario.jsp';
            document.cadastro.submit();
        }     
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codFuncionario = request.getParameter("codFuncionario");
    if(codFuncionario==null)codFuncionario = "0";
    String codSorveteria = request.getParameter("codSorveteria");
    if(codSorveteria==null)codSorveteria = "0";
    String tipoFuncionario = request.getParameter("tipoFuncionario");
    String nomeFuncionario = request.getParameter("nomeFuncionario");
    String enderecoFuncionario = request.getParameter("enderecoFuncionario");
    String emailFuncionario = request.getParameter("emailFuncionario");
    String telefoneFuncionario = request.getParameter("telefoneFuncionario");
    String cpfFuncionario = request.getParameter("cpfFuncionario");
    String dataNascimentoFuncionario = request.getParameter("dataNascimentoFuncionario");
    String rgFuncionario = request.getParameter("rgFuncionario");
    String cargaHorariaFuncionario = request.getParameter("cargaHorariaFuncionario");
    String salarioFuncionario = request.getParameter("salarioFuncionario");
    
DAOSorveteria daoSorveteria = new DAOSorveteria();
List<Sorveteria> listaSorveteria = daoSorveteria.listar();
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
        <title>Cadastro Funcionario</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <% if (session.getAttribute("nome") != null){%>
        <section class="s-cadastro">
            <div class="container">
                <h1>Cadastro Funcion�rio</h1>
                <form name="cadastro" >
                    <p class="p-select">  <label>Sorveteria: </label>
                    <select name="codSorveteria">
                        <% for (Sorveteria sorveteria:listaSorveteria){%>
                        <% if(codSorveteria.equals(String.valueOf(sorveteria.getCodSorveteria()))){%>                                  
                        <option selected value="<%= sorveteria.getCodSorveteria()%>"><%= sorveteria.getNomeSorveteria()%></option>
                        <%}else{%>
                        <option value="<%= sorveteria.getCodSorveteria()%>"><%= sorveteria.getNomeSorveteria()%></option>
                        <%}%>
                        <%}%>
                    </select>
                    </p>
                    <p>  <label>Cargo: </label>    <input type="text" name="tipoFuncionario" value="<%= (tipoFuncionario==null)?"":tipoFuncionario %>" size="50" /></p>
                    <p>  <label>Funcionario: </label>    <input type="text" name="nomeFuncionario" value="<%= (nomeFuncionario==null)?"":nomeFuncionario %>" size="50" /></p>
                    <p>  <label>Endere�o: </label>    <input type="text" name="enderecoFuncionario" value="<%= (enderecoFuncionario==null)?"":enderecoFuncionario %>" size="50" /></p>            
                    <p>  <label>Email: </label>    <input type="text" name="emailFuncionario" value="<%= (emailFuncionario==null)?"":emailFuncionario %>" size="50" /></p>
                    <p>  <label>Telefone: </label>    <input type="text" name="telefoneFuncionario" value="<%= (telefoneFuncionario==null)?"":telefoneFuncionario %>" size="50" /></p>
                    <p>  <label>CPF: </label>    <input type="text" name="cpfFuncionario" value="<%= (cpfFuncionario==null)?"":cpfFuncionario %>" size="50" /></p>
                    <p>  <label>Data de Nascimento: </label>    <input type="text" name="dataNascimentoFuncionario" value="<%= (dataNascimentoFuncionario==null)?"":dataNascimentoFuncionario %>" size="50" /></p>
                    <p>  <label>RG: </label>    <input type="text" name="rgFuncionario" value="<%= (rgFuncionario==null)?"":rgFuncionario %>" size="50" /></p>
                    <p>  <label>Carga Horaria: </label>    <input type="text" name="cargaHorariaFuncionario" value="<%= (cargaHorariaFuncionario==null)?"":cargaHorariaFuncionario %>" size="50" /></p>
                    <p>  <label>Salario: </label>    <input type="text" name="salarioFuncionario" value="<%= (salarioFuncionario==null)?"":salarioFuncionario %>" size="50" /></p>
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
                    <input type="hidden" name="codFuncionario" value="<%= codFuncionario %>"/>
                    <br><br>
                    <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
                <%= (mensagem==null)?"":mensagem %>
                </textarea>
                </form>        
                <br>
                <%@include file="ListarFuncionario.jsp" %>        
            </div>
        </section>
        <% } else {%>
        <jsp:forward page="index.jsp">
        <jsp:param name="mensagem" value="Acesso negado, efetue seu login!"/>
        </jsp:forward>
        <% } %>
        <%@include file="footer.jsp" %>  
    </body>
    <script src="./static/js/index.js" ></script>
</html>
