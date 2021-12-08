<%-- 
    Document   : CadastroSorveteria
    Created on : 19/04/2021, 14:26:17
    Author     : user
--%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

              if(document.cadastro.nomeSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';
                document.cadastro.nomeSorveteria.focus();
            } else if (document.cadastro.enderecoSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
                document.cadastro.enderecoSorveteria.focus();
            } else if (document.cadastro.horarioFuncionamentoSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
                document.cadastro.horarioFuncionamentoSorveteria.focus();
            } else if (document.cadastro.emailSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
                document.cadastro.emailSorveteria.focus()
            } else if (document.cadastro.telefoneSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
                document.cadastro.telefoneSorveteria.focus();
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAESorveteria.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeSorveteria.value = '';
            document.cadastro.enderecoSorveteria.value = '';
            document.cadastro.horarioFuncionamentoSorveteria.value = '';
            document.cadastro.emailSorveteria.value = '';
            document.cadastro.telefoneSorveteria.value = '';
            document.cadastro.action = 'CadastroSorveteria.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if (document.cadastro.nomeSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';
            } else if (document.cadastro.enderecoSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endere�o';
            } else if (document.cadastro.horarioFuncionamentoSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
            } else if (document.cadastro.emailSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneSorveteria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAESorveteria.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAESorveteria.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codSorveteria = request.getParameter("codSorveteria");
    if(codSorveteria==null)codSorveteria = "0";
    String nomeSorveteria = request.getParameter("nomeSorveteria");
    String enderecoSorveteria = request.getParameter("enderecoSorveteria");
    String horarioFuncionamentoSorveteria = request.getParameter("horarioFuncionamentoSorveteria");
    String emailSorveteria = request.getParameter("emailSorveteria");
    String telefoneSorveteria = request.getParameter("telefoneSorveteria");
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
        <title>Cadastro Sorveteria</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <section class="s-cadastro">
            <div class="container">
                <h1>Cadastro sorveteria</h1>
                <form name="cadastro" >
                    <p>  <label>Sorveteria: </label>    <input type="text" name="nomeSorveteria" value="<%= (nomeSorveteria==null)?"":nomeSorveteria %>" size="50" /></p>
                    <p>  <label>Endereco: </label>    <input type="text" name="enderecoSorveteria" value="<%= (enderecoSorveteria==null)?"":enderecoSorveteria %>" size="50" /></p>
                    <p>  <label>Horario de Fucionamento: </label>    <input type="text" name="horarioFuncionamentoSorveteria" value="<%= (horarioFuncionamentoSorveteria==null)?"":horarioFuncionamentoSorveteria %>" size="50" /></p>
                    <p>  <label>Email: </label>    <input type="text" name="emailSorveteria" value="<%= (emailSorveteria==null)?"":emailSorveteria %>" size="50" /></p>
                    <p>  <label>Telefone: </label>    <input type="text" name="telefoneSorveteria" value="<%= (telefoneSorveteria==null)?"":telefoneSorveteria %>" size="50" /></p>
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
                    <input type="hidden" name="codSorveteria" value="<%= codSorveteria %>"/>
                    <br><br>
                    <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
                <%= (mensagem==null)?"":mensagem %>
                </textarea>
                </form>
                <br>
                <%@include file="ListarSorveteria.jsp" %>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
    <script src="./static/js/index.js" ></script>
</html>
