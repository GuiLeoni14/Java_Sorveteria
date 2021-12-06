<%-- 
    Document   : CAEProduto
    Created on : 19/04/2021, 14:32:35
    Author     : user
--%>


<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Produto objProduto = new Produto();
    objProduto.setCodProduto(Integer.parseInt(request.getParameter("codProduto")));
    objProduto.setNomeProduto(request.getParameter("nomeProduto"));
    //objProduto.setEstoqueProduto(Int.pareInt(request.getParameter("estoqueProduto")));
    objProduto.setEstoqueProduto(Integer.parseInt(request.getParameter("estoqueProduto")));
    objProduto.setValorProduto(Double.parseDouble(request.getParameter("valorProduto")));  
    DAOProduto daoProduto = new DAOProduto();
    if(opcao.equals("cadastrar")){
    mensagem = daoProduto.inserir(objProduto);
    response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoProduto.alterar(objProduto);
    response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoProduto.remover(objProduto);
    response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem);
    }
%>
