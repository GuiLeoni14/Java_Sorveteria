// const btnCadastros = document.getElementById('btnCadastro');
// const ulCadastros = document.getElementById('ulCadastros');

// console.log('estamos aqui')

// // btnCadastros.addEventListener('mouseover', () => {
// //     ulCadastros.classList.toggle('active');
// // })

// function eMouse(event){
//     if (event == 'mouseout'){
//         ulCadastros.classList.remove('active');
//     }else if(event == 'mouseover'){
//         ulCadastros.classList.add('active');
//     }
// }

// btnCadastros.addEventListener('mouseover', eMouse);

const btnDropdown = document.querySelector('#btnCadastro');
const dropdown = document.querySelector('.js-dropdown');
const header = document.getElementById('header');

function openDropdown(event){
    event.preventDefault();
    dropdown.classList.toggle('active');
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
window.addEventListener('scroll', fixedMenu);

