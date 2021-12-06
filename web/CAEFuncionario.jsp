<%-- 
    Document   : CAEFuncionario
    Created on : 30/04/2021, 00:31:15
    Author     : Luis Roberto
--%>
<%@page import="modelo.ConverteData"%>
<%@page import="java.util.Calendar"%>
<%@page import="modelo.DAOFuncionario"%>
<%@page import="modelo.Funcionario"%>
<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    ConverteData converte = new ConverteData();
    
    Funcionario objFuncionario = new Funcionario();
    objFuncionario.setCodFuncionario(Integer.parseInt(request.getParameter("codFuncionario")));
    objFuncionario.getCodSorveteria().setCodSorveteria(Integer.parseInt(request.getParameter("codSorveteria")));
    objFuncionario.setTipoFuncionario(request.getParameter("tipoFuncionario"));
    objFuncionario.setNomeFuncionario(request.getParameter("nomeFuncionario"));
    objFuncionario.setEnderecoFuncionario(request.getParameter("enderecoFuncionario"));
    objFuncionario.setEmailFuncionario(request.getParameter("emailFuncionario"));
    objFuncionario.setTelefoneFuncionario(request.getParameter("telefoneFuncionario"));
    objFuncionario.setCpfFuncionario(request.getParameter("cpfFuncionario"));
    objFuncionario.setDataNascimentoFuncionario(converte.converteCalendario(request.getParameter("dataNascimentoFuncionario")));
    objFuncionario.setRgFuncionario(request.getParameter("rgFuncionario"));
    objFuncionario.setCargaHorariaFuncionario(request.getParameter("cargaHorariaFuncionario"));
    objFuncionario.setSalarioFuncionario(Double.parseDouble(request.getParameter("salarioFuncionario")));
    
    DAOFuncionario daoFuncionario = new DAOFuncionario();
    if(opcao.equals("cadastrar")){
    mensagem = daoFuncionario.inserir(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoFuncionario.alterar(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoFuncionario.remover(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
%>