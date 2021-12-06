<%-- 
    Document   : CAEFornecedor
    Created on : 19/04/2021, 14:32:35
    Author     : user
--%>

<%@page import="modelo.DAOFornecedor"%>
<%@page import="modelo.Fornecedor"%>
<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Fornecedor objFornecedor = new Fornecedor();
    objFornecedor.setCodFornecedor(Integer.parseInt(request.getParameter("codFornecedor")));
    objFornecedor.setNomeFornecedor(request.getParameter("nomeFornecedor"));
    objFornecedor.setEnderecoFornecedor(request.getParameter("enderecoFornecedor"));
    objFornecedor.setHorarioFuncionamento(request.getParameter("horarioFuncionamentoFornecedor"));
    objFornecedor.setEmailFornecedor(request.getParameter("emailFornecedor"));
    objFornecedor.setTelefoneFornecedor(request.getParameter("telefoneFornecedor"));
    
    DAOFornecedor daoFornecedor = new DAOFornecedor();
    if(opcao.equals("cadastrar")){
    mensagem = daoFornecedor.inserir(objFornecedor);
    response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoFornecedor.alterar(objFornecedor);
    response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoFornecedor.remover(objFornecedor);
    response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
    }
%>
