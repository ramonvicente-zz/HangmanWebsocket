/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

let welcomeSection = document.querySelector('#welcome');
let gameSection = document.querySelector('#gameplay');

//inicia o jogo e abre nova conexão
document.querySelector('#startGame').addEventListener('click', function(event){
    event.preventDefault();
    
    let connection = new WebSocketConnection();
    connection.openConnection();
    
    welcomeSection.style.display = 'none';
    gameSection.style.display = 'block';
});
