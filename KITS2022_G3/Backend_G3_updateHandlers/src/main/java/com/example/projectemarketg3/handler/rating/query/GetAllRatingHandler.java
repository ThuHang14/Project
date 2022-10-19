package com.example.projectemarketg3.handler.rating.query;

import com.example.projectemarketg3.dto.request.rating.query.GetAllRatingRequestData;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.dto.response.rating.query.GetAllProductByRatingId;
import com.example.projectemarketg3.handler.base.HandlerQuery;
import com.example.projectemarketg3.service.rating.query.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GetAllRatingHandler implements HandlerQuery<GetAllRatingRequestData, GetAllProductByRatingId> {

    private final RatingServiceQuery service;


    @Override
    public GetAllProductByRatingId handle(GetAllRatingRequestData requestData) {
        List<Rating> ratings = service.getAll();
        return new GetAllProductByRatingId(ratings);
    }
}
