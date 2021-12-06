package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Produto;
import modelo.DAOProduto;

public final class CadastroProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarProduto.jsp");
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
      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("              if(document.cadastro.nomeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Produto';\n");
      out.write("            } else if (document.cadastro.estoqueProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Estoque';\n");
      out.write("            } else if (document.cadastro.valorProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Valor';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeProduto.value = '';\n");
      out.write("            document.cadastro.estoqueProduto.value = '';\n");
      out.write("            document.cadastro.valorProduto.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            \n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("             if(document.cadastro.nomeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Produto';\n");
      out.write("            } else if (document.cadastro.estoqueProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Estoque';\n");
      out.write("            } else if (document.cadastro.valorProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Valor';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("            } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

    String mensagem = request.getParameter("mensagem");
    String opcao = request.getParameter("opcao");
    if (opcao==null)opcao = "cadastrar";
    String codProduto = request.getParameter("codProduto");
    if(codProduto==null)codProduto = "0";
    String nomeProduto = request.getParameter("nomeProduto");
    String estoqueProduto = (request.getParameter("estoqueProduto"));
    String valorProduto = request.getParameter("valorProduto"); 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <title>Cadastro Produto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro produto</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("            <p>  <label>Produto: </label>    <input type=\"text\" name=\"nomeProduto\" value=\"");
      out.print( (nomeProduto==null)?"":nomeProduto );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Estoque: </label>    <input type=\"text\" name=\"estoqueProduto\" value=\"");
      out.print( (estoqueProduto==null)?"":estoqueProduto );
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <p>  <label>Valor: </label>    <input type=\"text\" name=\"valorProduto\" value=\"");
      out.print( (valorProduto==null)?"":valorProduto );
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
      out.write("            <input type=\"hidden\" name=\"codProduto\" value=\"");
      out.print( codProduto );
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
