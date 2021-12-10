    <header id="header">
        <div class="container">
            <div class="logo">
                
                <img src="./static/img/logo.png" alt="">
            </div>
            <nav>
                <div class="dropdown js-dropdown">
                    <div class="item">
                        <a href="/Sorveteria/CadastroSorveteria.jsp">
                        <strong>Sorveteria</strong>
                        <p>Pagina de cadastro da sorveteria</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/CadastroFuncionario.jsp">
                        <strong>Funcionario</strong>
                        <p>Pagina de cadastro da Funcionario</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/CadastroProduto.jsp">
                        <strong>Produtos</strong>
                        <p>Pagina de cadastro da Produtos</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/CadastroCliente.jsp">
                        <strong>Clientes</strong>
                        <p>Pagina de cadastro da Clientes</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/CadastroCompraProduto.jsp">
                        <strong>Compras</strong>
                        <p>Pagina de cadastro das Compras</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/CadastroVendaProduto.jsp">
                        <strong>Vendas</strong>
                        <p>Pagina de cadastro das Vendas</p>
                        </a>
                    </div>
                </div>
                <div class="dropdown-relatorio js-dropdown-relatorio">
                    <div class="item">
                        <a href="RelatorioFuncionario.jsp" target="_blank">
                        <strong>Funcionario</strong>
                        <p>Relatorio de Funcionario</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/RelatorioProduto.jsp" target="_blank">
                        <strong>Relatorio Produtos</strong>
                        <p>Relatorio de Produtos</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/RelatorioCliente.jsp" target="_blank">
                        <strong>Relatorio Clientes</strong>
                        <p>Relatorio de Clientes</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/RelatorioFornecedor.jsp" target="_blank">
                        <strong>Relatorio Fornecedores</strong>
                        <p>Relatorio de Fornecedores</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/RelatorioCompra.jsp" target="_blank">
                        <strong>Relatorio Compras</strong>
                        <p>Relatorio de Compras</p>
                        </a>
                    </div>
                    <div class="item">
                        <a href="/Sorveteria/RelatorioVenda.jsp" target="_blank">
                        <strong>Relatorio Vendas</strong>
                        <p>Relatorio de Vendas</p>
                        </a>
                    </div>
                </div>
                <ul class="ul-main">
                    <li>
                        <a href="/Sorveteria/home.jsp">Home</a>
                    </li>
                    <li>
                        <a href="" id="btnCadastro">Cadastro</a>
                    </li>
                    <li>
                        <a href="" id="btnRelatorio">Relatorio</a>
                    </li>
                    <li>
                        <a href="#contato">Contato</a>
                    </li>
                    <li>
                        <a href="#sobre">Sobre</a>
                    </li>
                </ul>
                <% if (session.getAttribute("nome") != null) {%>
                    <div id="login">
                        <span>Bem Vindo, <%= session.getAttribute("nome")%></span>
                        <a href="logoff.jsp" class="btn btn-primary">Sair</a>
                    </div>
                <% }else{ %>
                    <a href="index.jsp" class="btn btn-primary">login</a>
                <%}%>
            </nav>
        </div>
    </header>