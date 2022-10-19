package com.example.projectemarketg3;

import com.example.projectemarketg3.base.BaseController;
import com.example.projectemarketg3.base.BaseResponse;
import com.example.projectemarketg3.dto.request.rating.GetAllRatingRequest;
import com.example.projectemarketg3.handler.Handler;
import com.example.projectemarketg3.handler.HandlerFactory;
import com.example.projectemarketg3.handler.rating.query.GetAllRatingHandler;
import com.example.projectemarketg3.repository.query.RatingRepository;
import com.example.projectemarketg3.service.rating.RatingServiceQueryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

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
        handlerFactory.initHandler();
    }

    @Test
    void testGetAllRating() {
//        List<?> list = getAllRatingHandler.handle(new GetRatingAll())
//        System.out.println(ratingServiceQueryImpl.getAll());
        System.out.println(ResponseEntity.ok(ratingRepository.getByStarOrderByCreateAtDesc(5)));
    }

//   new Handler _ new request
//   map data request ?
    @Test
    void testMapDataHandler() {
        GetAllRatingRequest request = new GetAllRatingRequest();

        Handler handler = HandlerFactory.getHandler(request); // => handler :  GetAllRatingHandler
        BaseResponse result =  handler.handle(request); // => data : list<Rating>
        BaseResponse response = new BaseResponse();
        response.setResponseData(result); // => set data : list Reponse =  list<Rating>

        System.out.println(ResponseEntity.ok(response));
    }
}
