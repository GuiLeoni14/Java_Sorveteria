

<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%@page import="modelo.DAOItensVenda"%>
<%@page import="modelo.ItensVenda"%>
<%@page import="modelo.DAOVendaProduto"%>
<%@page import="modelo.VendaProduto"%>
<%@page import="modelo.ConverteData"%>
<%@page import="modelo.DAOVendaProduto"%>

<%
    
    String codVenda = request.getParameter("codVenda");
    String idprodAdquirido = request.getParameter("idProdAdquirido");
    String dataVendaProduto = request.getParameter("dataVendaProduto");
    String opcao = request.getParameter("opcao");
    System.out.println(opcao);
    
    ConverteData converte = new ConverteData();
    VendaProduto vendaProduto = new VendaProduto();
    vendaProduto.getCodCliente().setCodCliente(Integer.parseInt(request.getParameter("codCliente")));
    vendaProduto.getCodFuncionario().setCodFuncionario(Integer.parseInt(request.getParameter("codFuncionario")));
    vendaProduto.setCodVenda(Integer.parseInt(codVenda));
    vendaProduto.setDataVendaProduto(converte.converteCalendario(request.getParameter("dataVendaProduto")));
    
    DAOVendaProduto daoVendaProduto = new DAOVendaProduto();
    ItensVenda itensVenda = new ItensVenda();
    DAOItensVenda daoItens = new DAOItensVenda();

    if (opcao.equals("cadastrar") && codVenda.equals("0")) {
        response.sendRedirect("CadastroVendaProduto.jsp?mensagem=" + daoVendaProduto.incluir(vendaProduto)+"&codVenda="+daoVendaProduto.getLastId()+"&codCliente="+vendaProduto.getCodCliente().getCodCliente()+"&codFuncionario="+vendaProduto.getCodFuncionario().getCodFuncionario()+"&dataVendaProduto="+dataVendaProduto);
    }
    if (opcao.equals("vender")){
        Produto produto = new Produto();
        DAOProduto daoProduto = new DAOProduto();
        produto = daoProduto.localizar(Integer.parseInt(request.getParameter("codProduto")));
        double valorProduto = produto.getValorProduto();
        itensVenda.setCodVenda(Integer.parseInt(codVenda));
        itensVenda.getCodProduto().setCodProduto(Integer.parseInt(request.getParameter("codProduto")));
        itensVenda.setQuantidadeVenda(Integer.parseInt(request.getParameter("quantidadeVenda")));
        itensVenda.setValorVendaProduto(valorProduto);
        response.sendRedirect("CadastroVendaProduto.jsp?mensagem=" + daoItens.incluir(itensVenda)+"&codVenda="+codVenda+"&codCliente="+vendaProduto.getCodCliente().getCodCliente()+"&codFuncionario="+vendaProduto.getCodFuncionario().getCodFuncionario()+"&dataVendaProduto="+dataVendaProduto);
    }
      if (opcao.equals("remover")){
        itensVenda.setCodItemVenda(Integer.parseInt(idprodAdquirido));
        response.sendRedirect("CadastroVendaProduto.jsp?mensagem=" + daoItens.remover(itensVenda)+"&codVenda="+codVenda+"&codCliente="+vendaProduto.getCodCliente().getCodCliente()+"&codFuncionario="+vendaProduto.getCodFuncionario().getCodFuncionario()+"&dataVendaProduto="+dataVendaProduto);
    }
    if (opcao.equals("finalizar")){
        response.sendRedirect("CadastroVendaProduto.jsp?mensagem=Venda Finalizada&codVenda=0");
    }
     if (opcao.equals("cancelar")){
        response.sendRedirect("CadastroVendaProduto.jsp?mensagem=" + daoVendaProduto.remove(vendaProduto)+"&codVenda=0");
    }


%>