package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Produto;
import modelo.DAOProduto;

public final class ListarProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.listar();

      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CÓDIGO</th>\n");
      out.write("            <th>PRODUTO</th>\n");
      out.write("            <th>ESTOQUE</th>\n");
      out.write("            <th>VALOR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Produto produto: listaProduto){
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( produto.getCodProduto() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getNomeProduto());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getEstoqueProduto() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getValorProduto() );
      out.write("</td>\n");
      out.write("            <td><a href=\"CadastroProduto.jsp?opcao=alterar&codProduto=");
      out.print( produto.getCodProduto());
      out.write("&nomeProduto=");
      out.print( produto.getNomeProduto());
      out.write("&estoqueProduto=");
      out.print( produto.getEstoqueProduto());
      out.write("&valorProduto=");
      out.print( produto.getValorProduto());
      out.write("\">alterar</a></td>\n");
      out.write("            <td><a href=\"CadastroProduto.jsp?opcao=excluir&codProduto=");
      out.print( produto.getCodProduto());
      out.write("&nomeProduto=");
      out.print( produto.getNomeProduto());
      out.write("&estoqueProduto=");
      out.print( produto.getEstoqueProduto());
      out.write("&valorProduto=");
      out.print( produto.getValorProduto());
      out.write("\">exluir</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
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
