<%-- 
    Document   : CAESorveteria
    Created on : 20/04/2021, 19:28:12
    Author     : user
--%>

<%@page import="modelo.DAOSorveteria"%>
<%@page import="modelo.Sorveteria"%>
<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Sorveteria objSorveteria = new Sorveteria();
    objSorveteria.setCodSorveteria(Integer.parseInt(request.getParameter("codSorveteria")));
    objSorveteria.setNomeSorveteria(request.getParameter("nomeSorveteria"));
    objSorveteria.setEnderecoSorveteria(request.getParameter("enderecoSorveteria"));
    objSorveteria.setHorarioFuncionamentoSorveteria(request.getParameter("horarioFuncionamentoSorveteria"));
    objSorveteria.setEmailSorveteria(request.getParameter("emailSorveteria"));
    objSorveteria.setTelefoneSorveteria(request.getParameter("telefoneSorveteria"));
    
    DAOSorveteria daoSorveteria = new DAOSorveteria();
    if(opcao.equals("cadastrar")){
    mensagem = daoSorveteria.inserir(objSorveteria);
    response.sendRedirect("CadastroSorveteria.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoSorveteria.alterar(objSorveteria);
    response.sendRedirect("CadastroSorveteria.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoSorveteria.remover(objSorveteria);
    response.sendRedirect("CadastroSorveteria.jsp?mensagem="+mensagem);
    }
%>
