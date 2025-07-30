package com.wankhede.SpringAI.controller;

import com.wankhede.SpringAI.model.EmailRequest;
import com.wankhede.SpringAI.service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        // Logic to generate an email
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok().body(response);
    }
}
