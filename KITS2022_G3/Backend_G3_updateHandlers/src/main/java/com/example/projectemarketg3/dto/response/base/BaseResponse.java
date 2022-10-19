package com.example.projectemarketg3.dto.response.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T extends ResponseData> {

    private HttpStatus code;

    private T data;

    private String message;
}
