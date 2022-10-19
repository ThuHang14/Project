package com.example.projectemarketg3.handler;

import com.example.projectemarketg3.base.BaseRequest;
import com.example.projectemarketg3.base.BaseResponse;

public interface Handler<T extends BaseRequest, I extends BaseResponse> {
    I handle(T requestData);

}
