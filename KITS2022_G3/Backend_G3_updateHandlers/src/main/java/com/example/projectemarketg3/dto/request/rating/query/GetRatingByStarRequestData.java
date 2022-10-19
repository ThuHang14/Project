package com.example.projectemarketg3.dto.request.rating.query;

import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetRatingByStarRequestData extends RequestDataQuery {
    private int star;
}
