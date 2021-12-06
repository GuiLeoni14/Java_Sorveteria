package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Fornecedor;
import modelo.DAOFornecedor;

public final class CadastroFornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarFornecedor.jsp");
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

      out.write("\n");
      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("              if(document.cadastro.nomeFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';\n");
      out.write("            } else if (document.cadastro.enderecoFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';\n");
      out.write("            } else if (document.cadastro.emailFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefoneFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeFornecedor.value = '';\n");
      out.write("            document.cadastro.enderecoFornecedor.value = '';\n");
      out.write("            document.cadastro.horarioFuncionamentoFornecedor.value = '';\n");
      out.write("            document.cadastro.emailFornecedor.value = '';\n");
      out.write("            document.cadastro.telefoneFornecedor.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroFornecedor.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            \n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("             if (document.cadastro.nomeFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Fornecedor';\n");
      out.write("            } else if (document.cadastro.enderecoFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.horarioFuncionamentoFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Horario de Funcionamento';\n");
      out.write("            } else if (document.cadastro.emailFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefoneFornecedor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("            } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEFornecedor.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codFornecedor = request.getParameter("codFornecedor");
    if(codFornecedor==null)codFornecedor = "0";
    String nomeFornecedor = request.getParameter("nomeFornecedor");
    String enderecoFornecedor = request.getParameter("enderecoFornecedor");
    String horarioFuncionamentoFornecedor = request.getParameter("horarioFuncionamentoFornecedor");
    String emailFornecedor = request.getParameter("emailFornecedor");
    String telefoneFornecedor = request.getParameter("telefoneFornecedor");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Fornecedor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro fornecedor</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("            <p>  <label>Fornecedor: </label>    <input type=\"text\" name=\"nomeFornecedor\" value=\"");
      out.print( (nomeFornecedor==null)?"":nomeFornecedor );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Endereço: </label>    <input type=\"text\" name=\"enderecoFornecedor\" value=\"");
      out.print( (enderecoFornecedor==null)?"":enderecoFornecedor );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Horário de Fucionamento: </label>    <input type=\"text\" name=\"horarioFuncionamentoFornecedor\" value=\"");
      out.print( (horarioFuncionamentoFornecedor==null)?"":horarioFuncionamentoFornecedor );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Email: </label>    <input type=\"text\" name=\"emailFornecedor\" value=\"");
      out.print( (emailFornecedor==null)?"":emailFornecedor );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Telefone: </label>    <input type=\"text\" name=\"telefoneFornecedor\" value=\"");
      out.print( (telefoneFornecedor==null)?"":telefoneFornecedor );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            ");
 if(opcao.equals("cadastrar")){ 
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Cadastrar\" name=\"cadastrar\" onclick=\"enviar('cadastrar')\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
 if(opcao.equals("alterar")){ 
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Alterar\" name=\"alterar\" onclick=\"enviar('alterar')\" />\n");
      out.write("            <input type=\"button\" value=\"Cancelar\" name=\"cancelar\" onclick=\"enviar('cancelar')\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
 if(opcao.equals("excluir")){ 
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Excluir\" name=\"excluir\" onclick=\"enviar('excluir')\" />\n");
      out.write("            <input type=\"button\" value=\"Cancelar\" name=\"cancelar\" onclick=\"enviar('cancelar')\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"opcao\" value=\"");
      out.print( opcao );
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"codFornecedor\" value=\"");
      out.print( codFornecedor );
      out.write("\"/>\n");
      out.write("            <br><br>\n");
      out.write("            <textarea name=\"mensagem\" rows=\"2\" cols=\"100\" readonly=\"readonly\">\n");
      out.write("        ");
      out.print( (mensagem==null)?"":mensagem );
      out.write("\n");
      out.write("        </textarea>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        ");
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
      out.write("\n");
      out.write("    </body>\n");
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
