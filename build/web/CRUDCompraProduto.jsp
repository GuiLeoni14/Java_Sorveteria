

<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%@page import="modelo.DAOItensCompra"%>
<%@page import="modelo.ItensCompra"%>
<%@page import="modelo.DAOCompraProduto"%>
<%@page import="modelo.CompraProduto"%>
<%@page import="modelo.ConverteData"%>
<%@page import="modelo.DAOCompraProduto"%>

<%
    
    String codCompra = request.getParameter("codCompra");
    String idprodAdquirido = request.getParameter("idProdAdquirido");
    String dataCompraProduto = request.getParameter("dataCompraProduto");
    String opcao = request.getParameter("opcao");
    
    ConverteData converte = new ConverteData();
    CompraProduto vendaProduto = new CompraProduto();
    vendaProduto.getCodSorveteria().setCodSorveteria(Integer.parseInt(request.getParameter("codSorveteria")));
    vendaProduto.getCodFornecedor().setCodFornecedor(Integer.parseInt(request.getParameter("codFornecedor")));
    vendaProduto.setCodCompra(Integer.parseInt(codCompra));
    vendaProduto.setDataCompraProduto(converte.converteCalendario(request.getParameter("dataCompraProduto")));
    
    DAOCompraProduto daoCompraProduto = new DAOCompraProduto();
    ItensCompra itensCompra = new ItensCompra();
    DAOItensCompra daoItens = new DAOItensCompra();

    if (opcao.equals("cadastrar") && codCompra.equals("0")) {
        response.sendRedirect("CadastroCompraProduto.jsp?mensagem=" + daoCompraProduto.incluir(vendaProduto)+"&codCompra="+daoCompraProduto.getLastId()+"&codSorveteria="+vendaProduto.getCodSorveteria().getCodSorveteria()+"&codFornecedor="+vendaProduto.getCodFornecedor().getCodFornecedor()+"&dataCompraProduto="+dataCompraProduto);
    }
    if (opcao.equals("vender")){
        Produto produto = new Produto();
        DAOProduto daoProduto = new DAOProduto();
        produto = daoProduto.localizar(Integer.parseInt(request.getParameter("codProduto")));
        double valorProduto = produto.getValorProduto();
        itensCompra.setCodCompra(Integer.parseInt(codCompra));
        itensCompra.getCodProduto().setCodProduto(Integer.parseInt(request.getParameter("codProduto")));
        itensCompra.setQuantidadeCompra(Integer.parseInt(request.getParameter("quantidadeCompra")));
        itensCompra.setValorCompraProduto(valorProduto);
        response.sendRedirect("CadastroCompraProduto.jsp?mensagem=" + daoItens.incluir(itensCompra)+"&codCompra="+codCompra+"&codSorveteria="+vendaProduto.getCodSorveteria().getCodSorveteria()+"&codFornecedor="+vendaProduto.getCodFornecedor().getCodFornecedor()+"&dataCompraProduto="+dataCompraProduto);
    }
      if (opcao.equals("remover")){
        itensCompra.setCodItemCompra(Integer.parseInt(idprodAdquirido));
        response.sendRedirect("CadastroCompraProduto.jsp?mensagem=" + daoItens.remover(itensCompra)+"&codCompra="+codCompra+"&codSorveteria="+vendaProduto.getCodSorveteria().getCodSorveteria()+"&codFornecedor="+vendaProduto.getCodFornecedor().getCodFornecedor()+"&dataCompraProduto="+dataCompraProduto);
    }
    if (opcao.equals("finalizar")){
        response.sendRedirect("CadastroCompraProduto.jsp?mensagem=Compra Finalizada&codCompra=0");
    }
     if (opcao.equals("cancelar")){
        response.sendRedirect("CadastroCompraProduto.jsp?mensagem=" + daoCompraProduto.remove(vendaProduto)+"&codCompra=0");
    }


%>