package com.rt.chat.R_Chat.chatController.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChatMessage implements Serializable {

    private String sender;
    private String content;

    @JsonCreator
    public ChatMessage(@JsonProperty("sender") String sender, 
                       @JsonProperty("content") String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
