const btnDropdown = document.querySelector('#btnCadastro');
const btnDropdownRelatorio = document.querySelector('#btnRelatorio');
const dropdown = document.querySelector('.js-dropdown');
const dropdownRelatorio = document.querySelector('.js-dropdown-relatorio');
const header = document.getElementById('header');

function openDropdown(event){
    event.preventDefault();
    dropdown.classList.toggle('active');
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

