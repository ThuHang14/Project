package com.example.projectemarketg3.utils;

import com.example.projectemarketg3.exception.CustomEx;
import org.springframework.http.HttpStatus;

public class ExceptionUtils {
    public static void checkById(Object obj){
        if(obj.equals(null)) {
            throw new CustomEx(HttpStatus.NOT_FOUND,obj,"khong tim thay ket qua phu hop");
        }
    }

    public static Object checkIf(int start,int end,int inputSize){
        if(inputSize > end || inputSize < start) throw new CustomEx(HttpStatus.INTERNAL_SERVER_ERROR,inputSize,"tim kiem khong hop le");
        return inputSize;
    }
}
