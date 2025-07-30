package com.wankhede.SpringAI.model;

import lombok.Data;

@Data
public class EmailRequest {
    private String subject;
    private String body;
}
