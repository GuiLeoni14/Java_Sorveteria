<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="Latin1"%>
<html lang="pt-br">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;500;600;800&family=Roboto:wght@100;300;400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link rel="stylesheet" href="./static/css/main.css">
    <title>Home</title>
</head>
<body>
    <%@include file="header.jsp" %>
    <section class="s-home" id="home">
        <div class="container">
            <div class="main-home">
                <div class="text-home">
                    <h2>Barato, bonito e gostoso!</h2>
                    <h1>Delicioso, como voce imagina...</h1>
                    <div class="slide-sorvetes">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <div class="cards-home">
                                    <img src="./static/img/card-s-01.jpg" alt="">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="cards-home">
                                    <img src="./static/img/card-s-02.jpg" alt="">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="cards-home">
                                    <img src="./static/img/card-s-03.jpg" alt="">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="cards-home">
                                    <img src="./static/img/card-s-04.jpg" alt="">
                                </div>
                            </div>
                        </div>
                        <div class="swiper-button-next"></div>
                        <div class="swiper-button-prev"></div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>
                <div class="img-home">
                    <img src="./static/img/art-sorvete.png" alt="">
                </div>
            </div>
        </div>
    </section>
    <section class="s-sobe" id="sobre">
        <div class="container">
            <div class="main-sobre">
                <div class="left">
                    <img src="./static/img/art-sorvete3.png" id="img-sobre" alt="">
                    <div class="text">
                        <h2>Sobre a empresa <div class="linha"></div></h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui nobis libero sequi, vero laboriosam iure illo, cupiditate ipsam, animi fugiat itaque recusandae earum perspiciatis omnis quis dicta totam iste consequatur. Lorem ipsum dolor, sit amet consectetur adipisicing elit. Amet minima velit veritatis voluptates deleniti ipsam laudantium labore at. Et itaque nobis ab explicabo, atque molestiae eveniet cumque doloribus asperiores tempore.
                        </p>
                        <a href="#" class="btn-primary">Saiba mais</a>
                    </div>
                </div>
                <div class="right">
                    <img src="./static/img/acai-art.png" id="img-acai" alt="">
                    <div class="text">
                        <div class="card">
                            <img src="./static/img/sorvete-footer.png" alt="">
                            <div class="text-card">
                                <h4>Qualidade </h4>
                                <div class="linha"></div>
                                <p>Qualidade garantida em toda a nossa linha de produtos.</p>
                            </div>
                        </div>
                        <div class="card">
                            <img src="./static/img/art-sorvete4.png" alt="">
                            <div class="text-card">
                                <h4>Variedade </h4>
                                <div class="linha"></div>
                                <p>Temos todas os sabores imagináveis, para todos os gostos.</p>
                            </div>
                        </div>
                        <div class="card">
                            <img src="./static/img/acai.png" alt="">
                            <div class="text-card">
                                <h4>Preco</h4>
                                <div class="linha"></div>
                                <p>Os melhores preços da região, sempre priorizando a qualidade e custo benefício</p>
                            </div>
                        </div>
                        <div class="card">
                            <img src="./static/img/tigela-acai.png" alt="">
                            <div class="text-card">
                                <h4>Sabor</h4>
                                <div class="linha"></div>
                                <p>Os melhores sabores de todos os gostos possiveis, com a melhor qualidade.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <%@include file="footer.jsp" %>
    <script src="./static/js/index.js" ></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script>
        var swiper = new Swiper(".slide-sorvetes", {
            slidesPerView: 1,
            spaceBetween: 32,
            autoplay: {
				delay: 3000,
				disableOnInteraction: false,
				pauseOnMouseEnter: true,
			},
            pagination: {
                el: ".swiper-pagination",
                type: "progressbar",
            },
            navigation: {
                nextEl: ".slide-sorvetes .swiper-button-next",
                prevEl: ".slide-sorvetes .swiper-button-prev",
            },
        });
    </script>
</body>
</html>