const btnDropdown = document.querySelector('#btnCadastro');
const btnDropdownRelatorio = document.querySelector('#btnRelatorio');
const dropdown = document.querySelector('.js-dropdown');
const dropdownRelatorio = document.querySelector('.js-dropdown-relatorio');
const header = document.getElementById('header');
const linksSection = document.querySelectorAll('.ul-main li a');

function openDropdown(event){
    event.preventDefault();
    dropdown.classList.toggle('active');
}

function scrollToSection(event){
    const url = window.location.href;
    const href = event.currentTarget.getAttribute('href');
    if (!(url.includes('index.jsp')) && (href == '#sobre')){
        window.location.href = '/Sorveteria/index.jsp';
    }else{
        const section = document.querySelector(href);
        const positionInicialSection = section.offsetTop;
        event.preventDefault();
        console.log(href);
        console.log(positionInicialSection);
        window.scrollTo({
            top: positionInicialSection - 100,
            behavior: 'smooth',
        })
    }
}

function openDropdownRelatorio(event){
    event.preventDefault();
    dropdownRelatorio.classList.toggle('active');
}

function fixedMenu(){
    if (window.pageYOffset >= 80){
        header.classList.add('fixed-menu');
    } else {
        header.classList.remove('fixed-menu');
    }
}

btnDropdown.addEventListener('click', openDropdown);
dropdown.addEventListener('mouseleave', openDropdown);

btnDropdownRelatorio.addEventListener('click', openDropdownRelatorio);
dropdownRelatorio.addEventListener('mouseleave', openDropdownRelatorio);

window.addEventListener('scroll', fixedMenu);

linksSection.forEach(link => {
    link.addEventListener('click', scrollToSection);
})
