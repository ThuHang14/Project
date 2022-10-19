package com.example.projectemarketg3;

import com.example.projectemarketg3.controller.base.BaseController;
import com.example.projectemarketg3.dto.request.base.RequestData;
import com.example.projectemarketg3.dto.request.rating.query.GetAllRatingRequestData;
import com.example.projectemarketg3.handler.base.HandlerFactory;
import com.example.projectemarketg3.handler.rating.query.GetAllRatingHandler;
import com.example.projectemarketg3.entity.repository.query.RatingRepository;
import com.example.projectemarketg3.service.rating.query.RatingServiceQueryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.ParameterizedType;

@SpringBootTest

public class TestHandlers extends BaseController {

    @Autowired
    private HandlerFactory handlerFactory;
    @Autowired
    private GetAllRatingHandler getAllRatingHandler;
    @Autowired
    private RatingServiceQueryImpl ratingServiceQueryImpl;
    @Autowired
    private RatingRepository ratingRepository;


    @Test
    void ratingAll() {

    }

    @Test
    void testHandlers() {
        handlerFactory.initHandlers();
    }

    @Test
    void testGetAllRating() {
//        List<?> list = getAllRatingHandler.handle(new GetRatingAll())
//        System.out.println(ratingServiceQueryImpl.getAll());
        System.out.println(ResponseEntity.ok(ratingRepository.getByStarOrderByCreateAtDesc(5)));
    }

//   new HandlerQuery _ new request
//   map data request ?
    @Test
    void testMapDataHandler() {
        GetAllRatingRequestData request = new GetAllRatingRequestData();
        System.out.println( executeQuery(request));
    }

    @Test
    void getClassByName() {
        GetAllRatingRequestData value = new GetAllRatingRequestData();
        String requestBeanName = ((ParameterizedType) value.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0]
                .getTypeName();
//        Class request = value.getClass();
        System.out.println(requestBeanName);
//        System.out.println(request);
    }
}
