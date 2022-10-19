package com.example.projectemarketg3.handler.rating.query;

import com.example.projectemarketg3.dto.request.rating.query.RatingGetIdRequestData;
import com.example.projectemarketg3.dto.response.rating.query.RatingGetIdResponseData;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.handler.base.HandlerQuery;
import com.example.projectemarketg3.service.rating.query.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class GetRatingByIdHandler implements HandlerQuery<RatingGetIdRequestData, RatingGetIdResponseData> {
    private final RatingServiceQuery service;

    @Override
    public RatingGetIdResponseData handle(RatingGetIdRequestData requestData) {
       Long id = requestData.getId();
        List<Rating> ratings = service.getRatingById(id);
        return new RatingGetIdResponseData(ratings);
    }
}
