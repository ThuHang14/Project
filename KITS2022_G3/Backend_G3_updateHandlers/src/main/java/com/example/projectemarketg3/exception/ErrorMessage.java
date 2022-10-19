package com.example.projectemarketg3.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage extends Throwable {
    private HttpStatus status;
    private String message;
}
