package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    <header id=\"header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a href=\"RelatorioFuncionario.jsp\"> gerar relatorio <a/>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                \r\n");
      out.write("                <img src=\"./static/img/logo.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"dropdown js-dropdown\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroSorveteria.jsp\">\r\n");
      out.write("                        <strong>Sorveteria</strong>\r\n");
      out.write("                        <p>Pï¿½gina de cadastro da sorveteria</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroFuncionario.jsp\">\r\n");
      out.write("                        <strong>Funcionï¿½rio</strong>\r\n");
      out.write("                        <p>Pï¿½gina de cadastro da FuncionÃ¡rio</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroProduto.jsp\">\r\n");
      out.write("                        <strong>Produtos</strong>\r\n");
      out.write("                        <p>Pï¿½gina de cadastro da Produtos</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroCliente.jsp\">\r\n");
      out.write("                        <strong>Clientes</strong>\r\n");
      out.write("                        <p>Pï¿½gina de cadastro da Clientes</p>\r\n");
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
      out.write("                        <a href=\"\">Relatï¿½rio</a>\r\n");
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
