/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function WebSocketConnection() {
    this.webSocket = null;
    let _self = this;
    let webSocketUrl = "ws://" + document.location.host 
            + document.location.pathname + "hangman";
    
    this.writeResponse = function(text) {
        var messages = document.getElementById("hiddenWord");
        messages.innerHTML = text;
    };
    
    this.openConnection = function(){
        try{
            this.webSocket = new WebSocket(webSocketUrl);
            this.webSocket.binaryType = "arraybuffer";

            this.webSocket.onopen = function(){
                _self.writeResponse("Waiting player...");
            };

            this.webSocket.onmessage = function(messageEvent){
                var data = JSON.parse(messageEvent.data);
            };

            this.webSocket.onerror = function(errorEvent){
                _self.writeResponse("error: " + errorEvent.data);
            };

            this.webSocket.onclose = function(closeEvent){
                _self.writeResponse("Connection closed.");
            };

        } catch(exception){
            console.error(exception);
        }
    };
}


