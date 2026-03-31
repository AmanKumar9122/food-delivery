package com.foodservice.entity.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private Integer statusCode;
    private String message;
    private Object data;
}