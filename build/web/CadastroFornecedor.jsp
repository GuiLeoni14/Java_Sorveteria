<%-- 
    Document   : CadastroForncedor
    Created on : 19/04/2021, 14:26:17
    Author     : user
--%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

              if(document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';
            } else if (document.cadastro.enderecoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endere�o';
            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
            } else if (document.cadastro.emailFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeFornecedor.value = '';
            document.cadastro.enderecoFornecedor.value = '';
            document.cadastro.horarioFuncionamentoFornecedor.value = '';
            document.cadastro.emailFornecedor.value = '';
            document.cadastro.telefoneFornecedor.value = '';
            document.cadastro.action = 'CadastroFornecedor.jsp';
            document.cadastro.submit();
            
        } else if (par == 'alterar') {

             if (document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';
            } else if (document.cadastro.enderecoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endere�o';
            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';
            } else if (document.cadastro.emailFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefoneFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
            } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEFornecedor.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codFornecedor = request.getParameter("codFornecedor");
    if(codFornecedor==null)codFornecedor = "0";
    String nomeFornecedor = request.getParameter("nomeFornecedor");
    String enderecoFornecedor = request.getParameter("enderecoFornecedor");
    String horarioFuncionamentoFornecedor = request.getParameter("horarioFuncionamentoFornecedor");
    String emailFornecedor = request.getParameter("emailFornecedor");
    String telefoneFornecedor = request.getParameter("telefoneFornecedor");
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
        <section class="s-cadastro">
            <div class="container">
                <h1>Cadastro fornecedor</h1>
                <form name="cadastro" >
                    <p>  <label>Fornecedor: </label>    <input type="text" name="nomeFornecedor" value="<%= (nomeFornecedor==null)?"":nomeFornecedor %>" size="50" /></p>
                    <p>  <label>Endereco: </label>    <input type="text" name="enderecoFornecedor" value="<%= (enderecoFornecedor==null)?"":enderecoFornecedor %>" size="50" /></p>
                    <p>  <label>Horario de Fucionamento: </label>    <input type="text" name="horarioFuncionamentoFornecedor" value="<%= (horarioFuncionamentoFornecedor==null)?"":horarioFuncionamentoFornecedor %>" size="50" /></p>
                    <p>  <label>Email: </label>    <input type="text" name="emailFornecedor" value="<%= (emailFornecedor==null)?"":emailFornecedor %>" size="50" /></p>
                    <p>  <label>Telefone: </label>    <input type="text" name="telefoneFornecedor" value="<%= (telefoneFornecedor==null)?"":telefoneFornecedor %>" size="50" /></p>
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
                    <input type="hidden" name="codFornecedor" value="<%= codFornecedor %>"/>
                    <br><br>
                    <textarea name="mensagem" rows="2" cols="100" readonly="readonly">
                <%= (mensagem==null)?"":mensagem %>
                </textarea>
                </form>
                <br>
                <%@include file="ListarFornecedor.jsp" %>
            </div>
        </section>
        <%@include file="footer.jsp" %>        
    </body>
    <script src="./static/js/index.js" ></script>
</html>
