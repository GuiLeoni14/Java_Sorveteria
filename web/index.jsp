<%-- 
    Document   : index
    Created on : 22/10/2018, 14:47:50
    Author     : tulio
--%>
<%@include file="header.jsp" %>
<script>
            function enviar(par){
                if (par == 'login'){
                    if (document.cadastro.email.value == ''){
                      alert("Preencha o campo email");
                    }else if (document.cadastro.senha.value == ''){
                        alert("Preencha o campo senha");
                    }else {
                        document.cadastro.action='LoginUsuario.jsp';
                        document.cadastro.submit();
                    }
                } 
            }
        </script>
        <% String mensagem = request.getParameter("mensagem"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" href="./static/css/main.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section class="s-login">
            <div class="container">
                <form action=""  name="cadastro" method="get">
                <label for="email">Email</label>
                <input type="text" name="email" id="email" value="" size="20" /> </p>
                <label for="senha">Senha</label>
                <input type="password" name="senha" id="senha" value="" size="20" /> </p>    
                <input  type="submit" class="btn-primary" name="login"  onClick="enviar('login')"  value="OK">
                <% if (mensagem != null){%><p class="msg-login"><%{ %><%= mensagem %><% } %></p><%}%>
                </form>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
    <script src="./static/js/index.js" ></script>
</html>
