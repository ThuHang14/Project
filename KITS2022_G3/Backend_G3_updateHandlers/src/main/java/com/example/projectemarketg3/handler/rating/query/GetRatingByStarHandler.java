package com.example.projectemarketg3.handler.rating.query;

import com.example.projectemarketg3.dto.mapper.RatingResponseData;
import com.example.projectemarketg3.dto.request.rating.query.GetRatingByStarRequestData;
import com.example.projectemarketg3.dto.response.rating.query.GetRatingByStarResponseData;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.exception.ErrorMessage;
import com.example.projectemarketg3.handler.base.HandlerQuery;
import com.example.projectemarketg3.service.rating.query.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class GetRatingByStarHandler implements HandlerQuery<GetRatingByStarRequestData, GetRatingByStarResponseData> {

    private final RatingServiceQuery serviceQuery;

    @Override
    public GetRatingByStarResponseData handle(GetRatingByStarRequestData requestData) {
        int star = requestData.getStar();
        List<Rating> ratings = serviceQuery.getRatingsByStar(star);
        return new GetRatingByStarResponseData(executeRating(ratings));
    }

    public List<RatingResponseData> executeRating(List<Rating> ratings){
        List<RatingResponseData> lists = new ArrayList<>();
        ratings.forEach(r -> {
            RatingResponseData ratingResponseData = RatingResponseData.builder()
                    .ratingId(r.getId())
                    .checking(r.getChecking())
                    .createAt(r.getCreateAt())
                    .image(r.getImage())
                    .note(r.getNote())
                    .productId(r.getProduct().getId())
                    .userId(r.getUser().getId())
                    .build();

            lists.add(ratingResponseData);
        });

        return lists;
    }
}
