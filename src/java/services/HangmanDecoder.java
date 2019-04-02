/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringReader;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import models.HangmanMessage;

/**
 *
 * @author ramon
 */
public class HangmanDecoder implements Decoder.Text<HangmanMessage>{
    
    @Override
    public void init(final EndpointConfig config) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public HangmanMessage decode(final String textMessage) throws DecodeException {
        HangmanMessage hangmanMessage = new HangmanMessage();
        JsonObject object = Json.createReader(new StringReader(textMessage))
                .readObject();
        hangmanMessage.setHint(object.getString("hint").charAt(0));
        hangmanMessage.setHintCounter(Integer.parseInt(object.getString("counter")));
        hangmanMessage.setWord(object.getString("word"));
        return hangmanMessage;
    }

    @Override
    public boolean willDecode(final String s) {
        return true;
    }
    
}
