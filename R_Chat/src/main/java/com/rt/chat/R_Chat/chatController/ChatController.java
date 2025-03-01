package com.rt.chat.R_Chat.chatController;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rt.chat.R_Chat.chatController.model.ChatMessage;

@Controller
public class ChatController {
	@MessageMapping("/sendMessage")  
    @SendTo("/topic/message")  
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println("Received Message: " + message.getSender() + ": " + message.getContent());
        return message;
    }
	@GetMapping("/")
	public String chat() {
		return "chat";
	}
}
