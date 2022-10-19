package com.example.projectemarketg3.handler.rating.query;

import com.example.projectemarketg3.dto.mapper.RatingResponseData;
import com.example.projectemarketg3.dto.request.rating.query.ARatingByIdRequestData;
import com.example.projectemarketg3.dto.response.rating.query.ARatingByIdResponseData;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.handler.base.HandlerQuery;
import com.example.projectemarketg3.service.rating.query.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class GetARatingByIdHandler implements HandlerQuery<ARatingByIdRequestData, ARatingByIdResponseData> {

    private final RatingServiceQuery serviceQuery;

    @Override
    public ARatingByIdResponseData handle(ARatingByIdRequestData requestData) {
        long id = requestData.getId();
        Rating rating = serviceQuery.getARatingById(id);
        if(rating == null) throw new RuntimeException("Khong tim thay ");
        return new ARatingByIdResponseData(executeRating(rating));
    }


    public RatingResponseData executeRating(Rating r){
        RatingResponseData ratingResponseData = RatingResponseData.builder()
                .ratingId(r.getId())
                .checking(r.getChecking())
                .createAt(r.getCreateAt())
                .image(r.getImage())
                .note(r.getNote())
                .productId(r.getProduct().getId())
                .userId(r.getUser().getId())
                .build();
        return ratingResponseData;
    }
}
