package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.ConverteData;
import java.util.List;
import modelo.Funcionario;
import modelo.DAOFuncionario;

public final class ListarFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    DAOFuncionario daoFuncionario = new DAOFuncionario();
    List<Funcionario> listaFuncionario = daoFuncionario.listar();
    ConverteData converte = new ConverteData();

      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CÓDIGO</th>\n");
      out.write("            <th>SORVETERIA</th>\n");
      out.write("            <th>CARGO</th>\n");
      out.write("            <th>FUNCIONARIO</th>\n");
      out.write("            <th>ENDEREÇO</th>\n");
      out.write("            <th>EMAIL</th>\n");
      out.write("            <th>TELEFONE</th>\n");
      out.write("            <th>CPF</th>\n");
      out.write("            <th>DATA DE NASCIMENTO</th>\n");
      out.write("            <th>RG</th>\n");
      out.write("            <th>CARGA HORARIA</th>\n");
      out.write("            <th>SALARIO</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Funcionario funcionario: listaFuncionario){
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( funcionario.getCodFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getCodSorveteria().getNomeSorveteria());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getTipoFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getNomeFuncionario());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getEnderecoFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getEmailFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getTelefoneFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getCpfFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( converte.converteTela(funcionario.getDataNascimentoFuncionario()) );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getRgFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getCargaHorariaFuncionario() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( funcionario.getSalarioFuncionario() );
      out.write("</td>\n");
      out.write("            <td><a href=\"CadastroFuncionario.jsp?opcao=alterar&codFuncionario=");
      out.print( funcionario.getCodFuncionario());
      out.write("&codSorveteria=");
      out.print( funcionario.getCodSorveteria().getNomeSorveteria());
      out.write("&tipoFuncionario=");
      out.print( funcionario.getTipoFuncionario());
      out.write("&nomeFuncionario=");
      out.print( funcionario.getNomeFuncionario());
      out.write("&enderecoFuncionario=");
      out.print( funcionario.getEnderecoFuncionario());
      out.write("&emailFuncionario=");
      out.print( funcionario.getEmailFuncionario());
      out.write("&telefoneFuncionario=");
      out.print( funcionario.getTelefoneFuncionario());
      out.write("&cpfFuncionario=");
      out.print( funcionario.getCpfFuncionario());
      out.write("&dataNascimentoFuncionario=");
      out.print( converte.converteTela(funcionario.getDataNascimentoFuncionario()));
      out.write("&rgFuncionario=");
      out.print( funcionario.getRgFuncionario());
      out.write("&cargaHorariaFuncionario=");
      out.print( funcionario.getCargaHorariaFuncionario());
      out.write("&salarioFuncionario=");
      out.print( funcionario.getSalarioFuncionario());
      out.write("\">alterar</a></td>\n");
      out.write("            <td><a href=\"CadastroFuncionario.jsp?opcao=excluir&codFuncionario=");
      out.print( funcionario.getCodFuncionario());
      out.write("&codSorveteria=");
      out.print( funcionario.getCodSorveteria().getNomeSorveteria());
      out.write("&tipoFuncionario=");
      out.print( funcionario.getTipoFuncionario());
      out.write("&nomeFuncionario=");
      out.print( funcionario.getNomeFuncionario());
      out.write("&enderecoFuncionario=");
      out.print( funcionario.getEnderecoFuncionario());
      out.write("&emailFuncionario=");
      out.print( funcionario.getEmailFuncionario());
      out.write("&telefoneFuncionario=");
      out.print( funcionario.getTelefoneFuncionario());
      out.write("&cpfFuncionario=");
      out.print( funcionario.getCpfFuncionario());
      out.write("&dataNascimentoFuncionario=");
      out.print( converte.converteTela(funcionario.getDataNascimentoFuncionario()));
      out.write("&rgFuncionario=");
      out.print( funcionario.getRgFuncionario());
      out.write("&cargaHorariaFuncionario=");
      out.print( funcionario.getCargaHorariaFuncionario());
      out.write("&salarioFuncionario=");
      out.print( funcionario.getSalarioFuncionario());
      out.write("\">excluir</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>");
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
