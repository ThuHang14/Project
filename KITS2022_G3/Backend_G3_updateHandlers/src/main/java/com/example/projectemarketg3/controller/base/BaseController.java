package com.example.projectemarketg3.controller.base;

import com.example.projectemarketg3.dto.request.base.command.RequestDataCommand;
import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import com.example.projectemarketg3.dto.request.base.RequestData;
import com.example.projectemarketg3.dto.response.base.BaseResponse;
import com.example.projectemarketg3.dto.response.base.ResponseData;
import com.example.projectemarketg3.exception.ErrorMessage;
import com.example.projectemarketg3.handler.base.HandlerFactory;
import com.example.projectemarketg3.handler.base.HandlerCommand;
import com.example.projectemarketg3.handler.base.HandlerQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected <I extends RequestDataQuery, T extends ResponseData> ResponseEntity<BaseResponse<T>> executeQuery(I request) {
        HandlerQuery handler = (HandlerQuery) HandlerFactory.getHandler(request);
        ResponseData result = handler.handle(request);
        return setDataResponse(result);
    }

    protected <I extends RequestDataCommand, T extends ResponseData> ResponseEntity<BaseResponse<T>> executeCommand(I request) {
        HandlerCommand handler = (HandlerCommand) HandlerFactory.getHandler(request);
        ResponseData result = handler.handle(request);
        return setDataResponse(result);
    }

    protected <I extends RequestData, T extends ResponseData> ResponseEntity<BaseResponse<T>> setDataResponse(ResponseData result) {
        BaseResponse response = new BaseResponse();
        response.setData(result);
        response.setCode(HttpStatus.OK);
        response.setMessage("");
        return ResponseEntity.ok(response);
    }

}
