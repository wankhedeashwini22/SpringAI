package com.wankhede.SpringAI.controller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/openai")
public class OpenAIController {

    private final OpenAiChatModel openAiChatModel;

    public OpenAIController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getResponse(@PathVariable String message) {

        String response = openAiChatModel.call(message);

        return ResponseEntity.ok(response);
    }
}
