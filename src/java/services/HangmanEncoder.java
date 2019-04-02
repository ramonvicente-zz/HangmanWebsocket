/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;
import models.HangmanMessage;

/**
 *
 * @author ramon
 */
public class HangmanEncoder implements Encoder.Text<HangmanMessage> {
    
    @Override
    public void init(final EndpointConfig config) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public String encode(final HangmanMessage hangmanMessage) throws EncodeException {
        return Json.createObjectBuilder()
                .add("hint", hangmanMessage.getMessage())
                .add("counter", hangmanMessage.getSender())
                .add("word", hangmanMessage.getReceived().toString()).build()
                .toString();
    }
    
}
