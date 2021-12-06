package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import modelo.DAOCliente;
import modelo.Cliente;

public final class CAECliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Cliente objCliente = new Cliente();
    objCliente.setCodCliente(Integer.parseInt(request.getParameter("codCliente")));
    objCliente.setNomeCliente(request.getParameter("nomeCliente"));
    objCliente.setEnderecoCliente(request.getParameter("enderecoCliente"));
    objCliente.setEmailCliente(request.getParameter("emailCliente"));
    objCliente.setTelefoneCliente(request.getParameter("telefoneCliente"));
    objCliente.setCpfCliente(request.getParameter("cpfCliente"));
    objCliente.setDataNascimentoCliente(request.getParameter("dataNascimentoCliente"));
    //java.sql.Date dt = rs.getDate("dataNascimentoCliente");
    //Calendar c = Calendar.getInstance();
    //c.setTime(dt);
    //objCliente.setDataNascimentoCliente(c);
    objCliente.setRgCliente(request.getParameter("rgCliente"));
    
    DAOCliente daoCliente = new DAOCliente();
    if(opcao.equals("cadastrar")){
    mensagem = daoCliente.inserir(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoCliente.alterar(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoCliente.remover(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    }

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
