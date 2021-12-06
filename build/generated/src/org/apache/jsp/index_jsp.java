package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@200;300;500;600;800&family=Roboto:wght@100;300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./static/css/main.css\">\n");
      out.write("    <title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("\n");
      out.write("    <section class=\"s-home\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-home\">\n");
      out.write("                <div class=\"text-home\">\n");
      out.write("                    <h2>Barato, bonito e gostoso!</h2>\n");
      out.write("                    <h1>Delicioso, como vocÃª imagina...</h1>\n");
      out.write("                    <div class=\"slide-sorvetes\">\n");
      out.write("                        <div class=\"swiper-wrapper\">\n");
      out.write("                            <div class=\"swiper-slide\">\n");
      out.write("                                <div class=\"cards-home\">\n");
      out.write("                                    <img src=\"./static/img/card-s-01.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"swiper-slide\">\n");
      out.write("                                <div class=\"cards-home\">\n");
      out.write("                                    <img src=\"./static/img/card-s-02.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"swiper-slide\">\n");
      out.write("                                <div class=\"cards-home\">\n");
      out.write("                                    <img src=\"./static/img/card-s-03.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"swiper-slide\">\n");
      out.write("                                <div class=\"cards-home\">\n");
      out.write("                                    <img src=\"./static/img/card-s-04.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"swiper-button-next\"></div>\n");
      out.write("                        <div class=\"swiper-button-prev\"></div>\n");
      out.write("                        <div class=\"swiper-pagination\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"img-home\">\n");
      out.write("                    <img src=\"./static/img/art-sorvete.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"s-sobre\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-sobre\">\n");
      out.write("                <div class=\"projeto\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2>Sobre o projeto</h2>\n");
      out.write("                        <div class=\"linha\"></div>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Itaque ipsa a vel expedita, laudantium ea qui eum omnis, dignissimos maxime aspernatur, consequatur necessitatibus aut quidem odio quam laborum? Facere, excepturi?</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"./static/img/art-sorvete2.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"criadores\">\n");
      out.write("                    <div class=\"criador\">\n");
      out.write("                        <img src=\"./static/img/gui.jpg\" alt=\"\">\n");
      out.write("                        <h3>Guilherme dos Reis Leoni <div class=\"linha\"></div> </h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Nome: </li>\n");
      out.write("                            <li>Idade: 17 anos.</li>\n");
      out.write("                            <li>Cidade: ParaguaÃ§u/MG</li>\n");
      out.write("                            <li>Turma: 3Â° info F</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"criador\">\n");
      out.write("                        <img src=\"./static/img/gui.jpg\" alt=\"\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Nome:</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"./static/js/index.js\" ></script>\n");
      out.write("    <script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        var swiper = new Swiper(\".slide-sorvetes\", {\n");
      out.write("            slidesPerView: 1,\n");
      out.write("            spaceBetween: 32,\n");
      out.write("            autoplay: {\n");
      out.write("\t\t\t\tdelay: 3000,\n");
      out.write("\t\t\t\tdisableOnInteraction: false,\n");
      out.write("\t\t\t\tpauseOnMouseEnter: true,\n");
      out.write("\t\t\t},\n");
      out.write("            pagination: {\n");
      out.write("                el: \".swiper-pagination\",\n");
      out.write("                type: \"progressbar\",\n");
      out.write("            },\n");
      out.write("            navigation: {\n");
      out.write("                nextEl: \".slide-sorvetes .swiper-button-next\",\n");
      out.write("                prevEl: \".slide-sorvetes .swiper-button-prev\",\n");
      out.write("            },\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
