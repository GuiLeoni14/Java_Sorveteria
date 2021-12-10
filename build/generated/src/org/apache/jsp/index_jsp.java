package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
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
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroCompraProduto.jsp\">\r\n");
      out.write("                        <strong>Compras</strong>\r\n");
      out.write("                        <p>Pagina de cadastro das Compras</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/CadastroVendaProduto.jsp\">\r\n");
      out.write("                        <strong>Vendas</strong>\r\n");
      out.write("                        <p>Pagina de cadastro das Vendas</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"dropdown-relatorio js-dropdown-relatorio\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"RelatorioFuncionario.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Funcionario</strong>\r\n");
      out.write("                        <p>Relatorio de Funcionario</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioProduto.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Relatorio Produtos</strong>\r\n");
      out.write("                        <p>Relatorio de Produtos</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioCliente.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Relatorio Clientes</strong>\r\n");
      out.write("                        <p>Relatorio de Clientes</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioFornecedor.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Relatorio Fornecedores</strong>\r\n");
      out.write("                        <p>Relatorio de Fornecedores</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioCompra.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Relatorio Compras</strong>\r\n");
      out.write("                        <p>Relatorio de Compras</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <a href=\"/Sorveteria/RelatorioVenda.jsp\" target=\"_blank\">\r\n");
      out.write("                        <strong>Relatorio Vendas</strong>\r\n");
      out.write("                        <p>Relatorio de Vendas</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"ul-main\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/Sorveteria/home.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" id=\"btnCadastro\">Cadastro</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" id=\"btnRelatorio\">Relatorio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#contato\">Contato</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#sobre\">Sobre</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                ");
 if (session.getAttribute("nome") != null) {
      out.write("\r\n");
      out.write("                    <div id=\"login\">\r\n");
      out.write("                        <span>Bem Vindo, ");
      out.print( session.getAttribute("nome"));
      out.write("</span>\r\n");
      out.write("                        <a href=\"logoff.jsp\" class=\"btn btn-primary\">Sair</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 }else{ 
      out.write("\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-primary\">login</a>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>");
      out.write("\n");
      out.write("<script>\n");
      out.write("            function enviar(par){\n");
      out.write("                if (par == 'login'){\n");
      out.write("                    if (document.cadastro.email.value == ''){\n");
      out.write("                      alert(\"Preencha o campo email\");\n");
      out.write("                    }else if (document.cadastro.senha.value == ''){\n");
      out.write("                        alert(\"Preencha o campo senha\");\n");
      out.write("                    }else {\n");
      out.write("                        document.cadastro.action='LoginUsuario.jsp';\n");
      out.write("                        document.cadastro.submit();\n");
      out.write("                    }\n");
      out.write("                } \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");
 String mensagem = request.getParameter("mensagem"); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/main.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"s-login\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"\"  name=\"cadastro\" method=\"get\">\n");
      out.write("                <label for=\"email\">Email</label>\n");
      out.write("                <input type=\"text\" name=\"email\" id=\"email\" value=\"\" size=\"20\" /> </p>\n");
      out.write("                <label for=\"senha\">Senha</label>\n");
      out.write("                <input type=\"password\" name=\"senha\" id=\"senha\" value=\"\" size=\"20\" /> </p>    \n");
      out.write("                <input  type=\"submit\" class=\"btn-primary\" name=\"login\"  onClick=\"enviar('login')\"  value=\"OK\">\n");
      out.write("                ");
 if (mensagem != null){
      out.write("<p class=\"msg-login\">");
{ 
      out.print( mensagem );
 } 
      out.write("</p>");
}
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("<footer id=\"contato\">\r\n");
      out.write("    <div class=\"container\" id=\"contato\">\r\n");
      out.write("        <div class=\"main-footer\">\r\n");
      out.write("            <div class=\"f-contato\">\r\n");
      out.write("                <h2>Contate-nos</h2>\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <span>Nome</span>\r\n");
      out.write("                    <input type=\"text\">\r\n");
      out.write("                    <span>Seu melhor e-mail:</span>\r\n");
      out.write("                    <input type=\"text\">\r\n");
      out.write("                    <span>Escreva sua mensagem:</span>\r\n");
      out.write("                    <textarea name=\"\" id=\"\" cols=\"30\" rows=\"10\"></textarea>\r\n");
      out.write("                </form>\r\n");
      out.write("                <a href=\"#\" class=\" btn-primary\" type=\"submit\">ENVIAR</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f-social\">\r\n");
      out.write("                <h4>Redes sociais</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">\r\n");
      out.write("                        <img src=\"./static/img/icon-twitter.svg\" alt=\"\">\r\n");
      out.write("                        <span>Twitter</span>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"#\">\r\n");
      out.write("                        <img src=\"./static/img/icon-linkedin.svg\" alt=\"\">\r\n");
      out.write("                        <span>LinkedIn</span>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"#\">\r\n");
      out.write("                        <img src=\"./static/img/icon-instagram.svg\" alt=\"\">\r\n");
      out.write("                        <span>Instagram</span>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"#\">\r\n");
      out.write("                        <img src=\"./static/img/icon-facebook.svg\" alt=\"\">\r\n");
      out.write("                        <span>Facebook</span>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"#\">\r\n");
      out.write("                        <img src=\"./static/img/icon-gmail.svg\" alt=\"\">\r\n");
      out.write("                        <span>G-mail</span>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f-links\">\r\n");
      out.write("                <h4>Nossos links</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Sobre nos</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Contato</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Login</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f-logo\">\r\n");
      out.write("                <img src=\"./static/img/logo.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"f-end\">\r\n");
      out.write("        <span>Desenvolvido por Guilherme Leoni(@guileoni14) - Alexandre Bueno(@ale_buenof)</span>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"./static/js/index.js\" ></script>\n");
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
