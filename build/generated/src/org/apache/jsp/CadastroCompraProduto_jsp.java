package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Fornecedor;
import modelo.DAOFornecedor;
import modelo.ConverteData;
import java.sql.Date;
import java.text.SimpleDateFormat;
import modelo.ItensCompra;
import modelo.DAOItensCompra;
import modelo.DAOProduto;
import modelo.Produto;
import java.util.List;
import modelo.Sorveteria;
import modelo.DAOSorveteria;

public final class CadastroCompraProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=Latin1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("               \n");
      out.write("              if(document.cadastro.dataCompraProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Data';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CRUDCompraProduto.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'vender') {\n");
      out.write("            if (document.cadastro.codProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Selecione um produto para venda';\n");
      out.write("            } else {\n");
      out.write("            document.cadastro.opcao.value = 'vender';\n");
      out.write("            document.cadastro.action = 'CRUDCompraProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }else if (par == 'remover') {\n");
      out.write("            if (document.cadastro.idProdAdquirido.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Selecione um produto para remover';\n");
      out.write("            } else {\n");
      out.write("            document.cadastro.opcao.value = 'remover';\n");
      out.write("            document.cadastro.action = 'CRUDCompraProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("            /// }\n");
      out.write("         else if (par == 'finalizar') {\n");
      out.write("            document.cadastro.opcao.value = 'finalizar';\n");
      out.write("            document.cadastro.action = 'CRUDCompraProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cancelar';\n");
      out.write("            document.cadastro.action = 'CRUDCompraProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

   ConverteData data = new ConverteData();
   String dataAtual = data.dataAtual();
    
    DAOSorveteria daoSorveteria = new DAOSorveteria();
    List<Sorveteria> listaSorveteria = daoSorveteria.getLista();

    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.getLista();
    
    DAOFornecedor daoFornecedor = new DAOFornecedor();
    List<Fornecedor> listaFornecedor = daoFornecedor.getLista();

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    //System.out.println(opcao);
    String codCompra = request.getParameter("codCompra");
    String CodSorveteria = request.getParameter("codSorveteria");
    String CodFornecedor = request.getParameter("codFornecedor");
    String dataCompraProduto = request.getParameter("dataCompraProduto");

    if (dataCompraProduto == null) {
       dataCompraProduto = dataAtual;
    }
    if (codCompra == null) {
        codCompra = "0";
        
    }
    if (CodSorveteria == null) {
        CodSorveteria = "0";
    }
    if (CodFornecedor == null) {
        CodFornecedor = "0";
    }
    if (opcao == null) {
        opcao = "nulo";
    }

    DAOItensCompra daoItens = new DAOItensCompra();
    List<ItensCompra> listaItens = daoItens.getLista(Integer.parseInt(codCompra));

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@200;300;500;600;800&family=Roboto:wght@100;300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/main.css\">\n");
      out.write("        <title>Cadastro Produto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                \r\n");
      out.write("                <img src=\"./static/img/logo.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"dropdown js-dropdown\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroSorveteria.jsp\">\r\n");
      out.write("                        <strong>Sorveteria</strong>\r\n");
      out.write("                        <p>Pagina de cadastro da sorveteria</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroFuncionario.jsp\">\r\n");
      out.write("                        <strong>Funcionario</strong>\r\n");
      out.write("                        <p>Pagina de cadastro da Funcionario</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroProduto.jsp\">\r\n");
      out.write("                        <strong>Produtos</strong>\r\n");
      out.write("                        <p>Pagina de cadastro da Produtos</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroCliente.jsp\">\r\n");
      out.write("                        <strong>Clientes</strong>\r\n");
      out.write("                        <p>Pagina de cadastro da Clientes</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"dropdown-relatorio js-dropdown-relatorio\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"RelatorioFuncionario.jsp\">\r\n");
      out.write("                        <strong>Funcionario</strong>\r\n");
      out.write("                        <p>Relatorio de Funcionario</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroProduto.jsp\">\r\n");
      out.write("                        <strong>Relatorio Produtos</strong>\r\n");
      out.write("                        <p>Relatorio de Produtos</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioCliente.jsp\">\r\n");
      out.write("                        <strong>Relatorio Clientes</strong>\r\n");
      out.write("                        <p>Relatorio de Clientes</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioFornecedor.jsp\">\r\n");
      out.write("                        <strong>Relatorio Fornecedores</strong>\r\n");
      out.write("                        <p>Relatorio de Fornecedores</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioCompra.jsp\">\r\n");
      out.write("                        <strong>Relatorio Compras</strong>\r\n");
      out.write("                        <p>Relatorio de Compras</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioVenda.jsp\">\r\n");
      out.write("                        <strong>Relatorio Vendas</strong>\r\n");
      out.write("                        <p>Relatorio de Vendas</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"ul-main\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Sorveteria/index.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" id=\"btnCadastro\">Cadastro</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" id=\"btnRelatorio\">Relatorio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">Contato</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">Sobre</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <a href=\"\" class=\"btn btn-primary\">login</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>");
      out.write("\n");
      out.write("        <section class=\"s-cadastro\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>CAIXA Nï¿½ VENDA: ");
      out.print( codCompra);
      out.write(" - ");
      out.print( CodSorveteria);
      out.write("</h1>\n");
      out.write("                <form name=\"cadastro\" class=\"form-compra\">\n");
      out.write("                <p class=\"p-select\">  <label> Sorveteria:</label> \n");
      out.write("                    <select name=\"codSorveteria\">\n");
      out.write("                        ");
 for (Sorveteria lista : listaSorveteria) { 
      out.write("\n");
      out.write("                        ");
 if (CodSorveteria.equals(String.valueOf(lista.getCodSorveteria()))) {
      out.write("\n");
      out.write("                        <option selected value=\"");
      out.print( lista.getCodSorveteria());
      out.write('"');
      out.write('>');
      out.print( lista.getNomeSorveteria());
      out.write("</option>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <option  value=\"");
      out.print( lista.getCodSorveteria());
      out.write('"');
      out.write('>');
      out.print( lista.getNomeSorveteria());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </select></p>\n");
      out.write("                    \n");
      out.write("                    <p class=\"p-select\">  <label> Fornecedor:</label> \n");
      out.write("                    <select name=\"codFornecedor\">\n");
      out.write("                        ");
 for (Fornecedor lista : listaFornecedor) { 
      out.write("\n");
      out.write("                        ");
 if (CodFornecedor.equals(String.valueOf(lista.getCodFornecedor()))) {
      out.write("\n");
      out.write("                        <option selected value=\"");
      out.print( lista.getCodFornecedor());
      out.write('"');
      out.write('>');
      out.print( lista.getNomeFornecedor());
      out.write("</option>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <option  value=\"");
      out.print( lista.getCodFornecedor());
      out.write('"');
      out.write('>');
      out.print( lista.getNomeFornecedor());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </select></p>\n");
      out.write("\n");
      out.write("                <p class=\"p-data\">  <label> Data:</label>   <input type=\"text\" name=\"dataCompraProduto\" value=\"");
      out.print( (dataCompraProduto == null) ? "" : dataCompraProduto);
      out.write("\" size=\"10\" /></p>\n");
      out.write("                \n");
      out.write("                    ");
 if (!codCompra.equals("0")) { 
      out.write("\n");
      out.write("                <table border=\"0\" cellspacing=\"3\" cellpadding=\"3\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"p-lista\">  <label> Lista de Produtos:</label> <br>\n");
      out.write("                                <select name=\"codProduto\" size=\"10\">\n");
      out.write("                                    ");
 for (Produto lista : listaProduto) {
      out.write("\n");
      out.write("                                    <option  value=\"");
      out.print( lista.getCodProduto());
      out.write('"');
      out.write('>');
      out.print( lista.getNomeProduto());
      out.write(" R$: ");
      out.print( lista.getValorProduto());
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                                </select></p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            Quant.<br>\n");
      out.write("                            <input type=\"text\" name=\"quantidadeCompra\" value=\"1\"  size=\"2\" /><br><br>\n");
      out.write("                            \n");
      out.write("                            <input type=\"button\" class=\"btn-alterar\" value=\"Vender\" name=\"vender\" onclick=\"enviar('vender')\" />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p id=\"p-lista\">  <label> Produtos Vendidos:</label> <br>\n");
      out.write("                                <select name=\"idProdAdquirido\" size=\"10\">\n");
      out.write("                                    ");
 for (ItensCompra lista : listaItens) {
      out.write("\n");
      out.write("                                    <option  value=\"");
      out.print( lista.getCodItemCompra() );
      out.write('"');
      out.write('>');
      out.print( lista.getCodProduto().getNomeProduto());
      out.write(" Qde: ");
      out.print( lista.getQuantidadeCompra());
      out.write(" R$: ");
      out.print( lista.getValorCompraProduto());
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            <input type=\"button\" class=\"btn-excluir\" value=\"Remover\" name=\"remover\" onclick=\"enviar('remover')\" />\n");
      out.write("                            </p>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                ");
 if (codCompra.equals("0")) { 
      out.write("\n");
      out.write("                <input type=\"button\" class=\"btn-cadastrar\" value=\"Cadastrar\" name=\"cadastrar\" onclick=\"enviar('cadastrar')\" />\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (!codCompra.equals("0")) { 
      out.write("\n");
      out.write("                <input type=\"button\" class=\"btn-cadastrar\" value=\"Finalizar\" name=\"finalizar\" onclick=\"enviar('finalizar')\"/>\n");
      out.write("                <input type=\"button\" value=\"Cancelar\" class=\"btn-cancelar\" name=\"cancelar\" onclick=\"enviar('cancelar')\"/>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <p><textarea name=\"mensagem\" rows=\"2\" cols=\"60\">\n");
      out.write("                        ");
      out.print( (mensagem == null) ? "" : mensagem);
      out.write("</textarea></p>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"opcao\" />\n");
      out.write("                <input type=\"hidden\" name=\"codCompra\" value=\"");
      out.print( codCompra);
      out.write("\"/>\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("</body>\n");
      out.write("<script src=\"./static/js/index.js\" ></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
