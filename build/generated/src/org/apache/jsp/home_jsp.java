package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <section class=\"s-home\" id=\"home\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-home\">\n");
      out.write("                <div class=\"text-home\">\n");
      out.write("                    <h2>Barato, bonito e gostoso!</h2>\n");
      out.write("                    <h1>Delicioso, como voce imagina...</h1>\n");
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
      out.write("    <section class=\"s-sobe\" id=\"sobre\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-sobre\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <img src=\"./static/img/art-sorvete3.png\" id=\"img-sobre\" alt=\"\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2>Sobre a empresa <div class=\"linha\"></div></h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui nobis libero sequi, vero laboriosam iure illo, cupiditate ipsam, animi fugiat itaque recusandae earum perspiciatis omnis quis dicta totam iste consequatur. Lorem ipsum dolor, sit amet consectetur adipisicing elit. Amet minima velit veritatis voluptates deleniti ipsam laudantium labore at. Et itaque nobis ab explicabo, atque molestiae eveniet cumque doloribus asperiores tempore.\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"#\" class=\"btn-primary\">Saiba mais</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <img src=\"./static/img/acai-art.png\" id=\"img-acai\" alt=\"\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"./static/img/sorvete-footer.png\" alt=\"\">\n");
      out.write("                            <div class=\"text-card\">\n");
      out.write("                                <h4>Qualidade </h4>\n");
      out.write("                                <div class=\"linha\"></div>\n");
      out.write("                                <p>Qualidade garantida em toda a nossa linha de produtos.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"./static/img/art-sorvete4.png\" alt=\"\">\n");
      out.write("                            <div class=\"text-card\">\n");
      out.write("                                <h4>Variedade </h4>\n");
      out.write("                                <div class=\"linha\"></div>\n");
      out.write("                                <p>Temos todas os sabores imaginÃ¡veis, para todos os gostos.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"./static/img/acai.png\" alt=\"\">\n");
      out.write("                            <div class=\"text-card\">\n");
      out.write("                                <h4>PreÃ§o</h4>\n");
      out.write("                                <div class=\"linha\"></div>\n");
      out.write("                                <p>Os melhores preÃ§os da regiÃ£o, sempre priorizando a qualidade e custo benefÃ­cio</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"./static/img/tigela-acai.png\" alt=\"\">\n");
      out.write("                            <div class=\"text-card\">\n");
      out.write("                                <h4>Sabor</h4>\n");
      out.write("                                <div class=\"linha\"></div>\n");
      out.write("                                <p>Os melhores sabores de todos os gostos possÃ­veis, com a melhor qualidade.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    ");
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
