package com.example.projectemarketg3.exception;


import com.example.projectemarketg3.dto.response.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class HandleException {
//    // Xử lý cho trường hợp BadRequest
//    @ExceptionHandler(BadRequestException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<BaseResponse> handleBadRequestException(BadRequestException e) {
//        BaseResponse response = new BaseResponse<>(HttpStatus.BAD_REQUEST,null,e.getMessage());
//        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
////        return new ErrorMessage(HttpStatus.BAD_REQUEST, e.getMessage());
//    }
//
//    // Xử lý cho trường hợp NotFound
//    @ExceptionHandler(NotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<BaseResponse> handleNotFoundException(NotFoundException e) {
//         BaseResponse response = new BaseResponse<>(HttpStatus.NOT_FOUND,null,e.getMessage());
//        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//    }
//
//    // Xử lý cho các lỗi còn lại
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseEntity<BaseResponse> handleOtherException(Exception e) {
//        BaseResponse response = new BaseResponse<>(HttpStatus.INTERNAL_SERVER_ERROR,null,e.getMessage());
//        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
//    }


    // Xử lý cho các lỗi còn lại
    @ExceptionHandler(CustomEx.class)
    public ResponseEntity<BaseResponse> handleOtherException(CustomEx e) {
        BaseResponse response = new BaseResponse<>(HttpStatus.INTERNAL_SERVER_ERROR,null,e.getMess());
        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
