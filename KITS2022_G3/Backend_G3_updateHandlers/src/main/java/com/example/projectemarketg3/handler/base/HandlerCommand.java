package com.example.projectemarketg3.handler.base;

import com.example.projectemarketg3.dto.request.base.command.RequestDataCommand;
import com.example.projectemarketg3.dto.response.base.command.ResponseDataCommand;

public interface HandlerCommand<T extends RequestDataCommand, I extends ResponseDataCommand>{
    I handle(T requestData);

}
