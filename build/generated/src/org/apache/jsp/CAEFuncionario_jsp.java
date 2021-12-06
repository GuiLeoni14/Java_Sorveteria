package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.ConverteData;
import java.util.Calendar;
import modelo.DAOFuncionario;
import modelo.Funcionario;

public final class CAEFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String mensagem = "";
    String opcao = request.getParameter("opcao");
    ConverteData converte = new ConverteData();
    
    Funcionario objFuncionario = new Funcionario();
    objFuncionario.setCodFuncionario(Integer.parseInt(request.getParameter("codFuncionario")));
    objFuncionario.getCodSorveteria().setCodSorveteria(Integer.parseInt(request.getParameter("codSorveteria")));
    objFuncionario.setTipoFuncionario(request.getParameter("tipoFuncionario"));
    objFuncionario.setNomeFuncionario(request.getParameter("nomeFuncionario"));
    objFuncionario.setEnderecoFuncionario(request.getParameter("enderecoFuncionario"));
    objFuncionario.setEmailFuncionario(request.getParameter("emailFuncionario"));
    objFuncionario.setTelefoneFuncionario(request.getParameter("telefoneFuncionario"));
    objFuncionario.setCpfFuncionario(request.getParameter("cpfFuncionario"));
    objFuncionario.setDataNascimentoFuncionario(converte.converteCalendario(request.getParameter("dataNascimentoFuncionario")));
    objFuncionario.setRgFuncionario(request.getParameter("rgFuncionario"));
    objFuncionario.setCargaHorariaFuncionario(request.getParameter("cargaHorariaFuncionario"));
    objFuncionario.setSalarioFuncionario(Double.parseDouble(request.getParameter("salarioFuncionario")));
    
    DAOFuncionario daoFuncionario = new DAOFuncionario();
    if(opcao.equals("cadastrar")){
    mensagem = daoFuncionario.inserir(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("alterar")){
    mensagem = daoFuncionario.alterar(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
    if(opcao.equals("excluir")){
    mensagem = daoFuncionario.remover(objFuncionario);
    response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
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
