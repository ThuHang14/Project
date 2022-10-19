package com.example.projectemarketg3.base;

import com.example.projectemarketg3.handler.Handler;
import com.example.projectemarketg3.handler.HandlerFactory;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected ResponseEntity<BaseResponse> execute(BaseRequest request) {
        Handler handler = HandlerFactory.getHandler(request);
        BaseResponse result =  handler.handle(request);
        BaseResponse response = new BaseResponse();
        response.setResponseData(result);
        return ResponseEntity.ok(response);
    }
}
