package com.example.projectemarketg3.handler.rating.query;

import com.example.projectemarketg3.dto.request.rating.GetAllRatingRequest;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.dto.response.rating.RatingBaseResponse;
import com.example.projectemarketg3.handler.Handler;
import com.example.projectemarketg3.service.rating.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GetAllRatingHandler implements Handler<GetAllRatingRequest, RatingBaseResponse> {

    private final RatingServiceQuery service;


    @Override
    public RatingBaseResponse handle(GetAllRatingRequest requestData) {
        List<Rating> ratings = service.getAll();
        return new RatingBaseResponse(ratings);
    }
}
