package com.example.projectemarketg3.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomEx extends RuntimeException {
    private HttpStatus httpStatus;
    private Object data;
    private String mess;
}
