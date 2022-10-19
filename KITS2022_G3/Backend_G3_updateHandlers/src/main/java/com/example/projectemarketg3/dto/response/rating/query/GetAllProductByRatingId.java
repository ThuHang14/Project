package com.example.projectemarketg3.dto.response.rating.query;

import com.example.projectemarketg3.dto.response.base.query.ResponseDataQuery;
import com.example.projectemarketg3.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class GetAllProductByRatingId extends ResponseDataQuery {
       private List<Rating> ratings;
}
