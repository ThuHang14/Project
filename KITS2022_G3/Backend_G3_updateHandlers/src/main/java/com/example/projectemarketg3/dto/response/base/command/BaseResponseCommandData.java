package com.example.projectemarketg3.dto.response.base.command;

import lombok.Data;

@Data
public class BaseResponseCommandData <T extends ResponseDataCommand> {
    private int code;

    private T data;
}
