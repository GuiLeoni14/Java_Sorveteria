package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Sorveteria;
import modelo.DAOSorveteria;
import java.util.Calendar;
import modelo.ConverteData;
import java.util.List;
import modelo.Funcionario;
import modelo.DAOFuncionario;

public final class CadastroFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarFuncionario.jsp");
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
      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("               if(document.cadastro.codSorveteria.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';\n");
      out.write("            }else if (document.cadastro.tipoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cargo';\n");
      out.write("            }else if (document.cadastro.nomeFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Funcionario';\n");
      out.write("            } else if (document.cadastro.enderecoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.emailFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefoneFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else if (document.cadastro.cpfFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo CPF';\n");
      out.write("            } else if (document.cadastro.dataNascimentoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';\n");
      out.write("            } else if (document.cadastro.rgFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo RG';\n");
      out.write("            } else if (document.cadastro.cargaHorariaFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';\n");
      out.write("            } else if (document.cadastro.salarioFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Salario';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.codSorveteria.value = '';\n");
      out.write("            document.cadastro.tipoFuncionario.value = '';\n");
      out.write("            document.cadastro.nomeFuncionario.value = '';\n");
      out.write("            document.cadastro.enderecoFuncionario.value = '';\n");
      out.write("            document.cadastro.emailFuncionario.value = '';\n");
      out.write("            document.cadastro.telefoneFuncionario.value = '';\n");
      out.write("            document.cadastro.cpfFuncionario.value = '';\n");
      out.write("            document.cadastro.dataNascimentoFuncionario.value = '';\n");
      out.write("            document.cadastro.rgFuncionario.value = '';\n");
      out.write("            document.cadastro.cargaHorariaFuncionario.value = '';\n");
      out.write("            document.cadastro.salarioFuncionario.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroFuncionario.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            \n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("             if(document.cadastro.codSorveteria.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Sorveteria';\n");
      out.write("            }else if (document.cadastro.tipoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Cargo';\n");
      out.write("            }else if (document.cadastro.nomeFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Funcionario';\n");
      out.write("            } else if (document.cadastro.enderecoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Endereço';\n");
      out.write("            } else if (document.cadastro.emailFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Email';\n");
      out.write("            } else if (document.cadastro.telefoneFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Telefone';\n");
      out.write("            } else if (document.cadastro.cpfFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo CPF';\n");
      out.write("            } else if (document.cadastro.dataNascimentoFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Data de Nascimento';\n");
      out.write("            } else if (document.cadastro.rgFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo RG';\n");
      out.write("            } else if (document.cadastro.cargaHorariaFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';\n");
      out.write("            } else if (document.cadastro.salarioFuncionario.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Salario';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("            } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEFuncionario.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }     \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codFuncionario = request.getParameter("codFuncionario");
    if(codFuncionario==null)codFuncionario = "0";
    String codSorveteria = request.getParameter("codSorveteria");
    if(codSorveteria==null)codSorveteria = "0";
    String tipoFuncionario = request.getParameter("tipoFuncionario");
    String nomeFuncionario = request.getParameter("nomeFuncionario");
    String enderecoFuncionario = request.getParameter("enderecoFuncionario");
    String emailFuncionario = request.getParameter("emailFuncionario");
    String telefoneFuncionario = request.getParameter("telefoneFuncionario");
    String cpfFuncionario = request.getParameter("cpfFuncionario");
    String dataNascimentoFuncionario = request.getParameter("dataNascimentoFuncionario");
    String rgFuncionario = request.getParameter("rgFuncionario");
    String cargaHorariaFuncionario = request.getParameter("cargaHorariaFuncionario");
    String salarioFuncionario = request.getParameter("salarioFuncionario");
    
DAOSorveteria daoSorveteria = new DAOSorveteria();
List<Sorveteria> listaSorveteria = daoSorveteria.listar();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <title>Cadastro Funcionário</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro Funcionario</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("            <p>  <label>Sorveteria: </label>\n");
      out.write("            <select name=\"codSorveteria\">\n");
      out.write("                ");
 for (Sorveteria sorveteria:listaSorveteria){
      out.write("\n");
      out.write("                ");
 if(codSorveteria.equals(String.valueOf(sorveteria.getCodSorveteria()))){
      out.write("                                  \n");
      out.write("                <option selected value=\"");
      out.print( sorveteria.getCodSorveteria());
      out.write('"');
      out.write('>');
      out.print( sorveteria.getNomeSorveteria());
      out.write("</option>\n");
      out.write("                ");
}else{
      out.write("\n");
      out.write("                <option value=\"");
      out.print( sorveteria.getCodSorveteria());
      out.write('"');
      out.write('>');
      out.print( sorveteria.getNomeSorveteria());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            </p>\n");
      out.write("            <p>  <label>Cargo: </label>    <input type=\"text\" name=\"tipoFuncionario\" value=\"");
      out.print( (tipoFuncionario==null)?"":tipoFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Funcionario: </label>    <input type=\"text\" name=\"nomeFuncionario\" value=\"");
      out.print( (nomeFuncionario==null)?"":nomeFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Endereço: </label>    <input type=\"text\" name=\"enderecoFuncionario\" value=\"");
      out.print( (enderecoFuncionario==null)?"":enderecoFuncionario );
      out.write("\" size=\"50\" /></p>            \n");
      out.write("            <p>  <label>Email: </label>    <input type=\"text\" name=\"emailFuncionario\" value=\"");
      out.print( (emailFuncionario==null)?"":emailFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Telefone: </label>    <input type=\"text\" name=\"telefoneFuncionario\" value=\"");
      out.print( (telefoneFuncionario==null)?"":telefoneFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>CPF: </label>    <input type=\"text\" name=\"cpfFuncionario\" value=\"");
      out.print( (cpfFuncionario==null)?"":cpfFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Data de Nascimento: </label>    <input type=\"text\" name=\"dataNascimentoFuncionario\" value=\"");
      out.print( (dataNascimentoFuncionario==null)?"":dataNascimentoFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>RG: </label>    <input type=\"text\" name=\"rgFuncionario\" value=\"");
      out.print( (rgFuncionario==null)?"":rgFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Carga Horaria: </label>    <input type=\"text\" name=\"cargaHorariaFuncionario\" value=\"");
      out.print( (cargaHorariaFuncionario==null)?"":cargaHorariaFuncionario );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Salario: </label>    <input type=\"text\" name=\"salarioFuncionario\" value=\"");
      out.print( (salarioFuncionario==null)?"":salarioFuncionario );
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
      out.write("            <input type=\"hidden\" name=\"codFuncionario\" value=\"");
      out.print( codFuncionario );
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
