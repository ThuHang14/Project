package com.example.projectemarketg3.handler.base;

import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import com.example.projectemarketg3.dto.response.base.query.ResponseDataQuery;
import com.example.projectemarketg3.exception.ErrorMessage;


public interface HandlerQuery<T extends RequestDataQuery, I extends ResponseDataQuery>{
    I handle(T requestData) ;

}
