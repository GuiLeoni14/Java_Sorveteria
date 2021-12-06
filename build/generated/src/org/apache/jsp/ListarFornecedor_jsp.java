package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Fornecedor;
import modelo.DAOFornecedor;

public final class ListarFornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    DAOFornecedor daoFornecedor = new DAOFornecedor();
    List<Fornecedor> listaFornecedor = daoFornecedor.listar();

      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CÓDIGO</th>\n");
      out.write("            <th>FORNECEDOR</th>\n");
      out.write("            <th>ENDEREÇO</th>\n");
      out.write("            <th>HORÁRIO DE FUNCIONAMENTO</th>\n");
      out.write("            <th>EMAIL</th>\n");
      out.write("            <th>TELEFONE</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Fornecedor fornecedor: listaFornecedor){
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( fornecedor.getCodFornecedor() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fornecedor.getNomeFornecedor());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fornecedor.getEnderecoFornecedor() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fornecedor.getHorarioFuncionamentoFornecedor() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fornecedor.getEmailFornecedor() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fornecedor.getTelefoneFornecedor() );
      out.write("</td>\n");
      out.write("            <td><a href=\"CadastroFornecedor.jsp?opcao=alterar&codFornecedor=");
      out.print( fornecedor.getCodFornecedor());
      out.write("&nomeFornecedor=");
      out.print( fornecedor.getNomeFornecedor());
      out.write("&enderecoFornecedor=");
      out.print( fornecedor.getEnderecoFornecedor());
      out.write("&horarioFuncionamentoFornecedor=");
      out.print( fornecedor.getHorarioFuncionamentoFornecedor());
      out.write("&emailFornecedor=");
      out.print( fornecedor.getEmailFornecedor());
      out.write("&telefoneFornecedor=");
      out.print( fornecedor.getTelefoneFornecedor());
      out.write("\">alterar</a></td>\n");
      out.write("            <td><a href=\"CadastroFornecedor.jsp?opcao=excluir&codFornecedor=");
      out.print( fornecedor.getCodFornecedor());
      out.write("&nomeFornecedor=");
      out.print( fornecedor.getNomeFornecedor());
      out.write("&enderecoFornecedor=");
      out.print( fornecedor.getEnderecoFornecedor());
      out.write("&horarioFuncionamentoFornecedor=");
      out.print( fornecedor.getHorarioFuncionamentoFornecedor());
      out.write("&emailFornecedor=");
      out.print( fornecedor.getEmailFornecedor());
      out.write("&telefoneFornecedor=");
      out.print( fornecedor.getTelefoneFornecedor());
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
