<%-- 
    Document   : CAECliente
    Created on : 19/04/2021, 14:32:35
    Author     : user
--%>
<%@page import="java.util.Calendar"%>
<%@page import="modelo.DAOCliente"%>
<%@page import="modelo.Cliente"%>
<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Cliente objCliente = new Cliente();
    objCliente.setCodCliente(Integer.parseInt(request.getParameter("codCliente")));
    objCliente.setNomeCliente(request.getParameter("nomeCliente"));
    objCliente.setEnderecoCliente(request.getParameter("enderecoCliente"));
    objCliente.setEmailCliente(request.getParameter("emailCliente"));
    objCliente.setTelefoneCliente(request.getParameter("telefoneCliente"));
    objCliente.setCpfCliente(request.getParameter("cpfCliente"));
    objCliente.setDataNascimentoCliente(request.getParameter("dataNascimentoCliente"));
    //java.sql.Date dt = rs.getDate("dataNascimentoCliente");
    //Calendar c = Calendar.getInstance();
    //c.setTime(dt);
    //objCliente.setDataNascimentoCliente(c);
    objCliente.setRgCliente(request.getParameter("rgCliente"));
    
    DAOCliente daoCliente = new DAOCliente();
    if(opcao.equals("cadastrar")){
    mensagem = daoCliente.inserir(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoCliente.alterar(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoCliente.remover(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }
%>