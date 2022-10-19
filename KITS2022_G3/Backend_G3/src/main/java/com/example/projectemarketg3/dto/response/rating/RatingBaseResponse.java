package com.example.projectemarketg3.dto.response.rating;

import com.example.projectemarketg3.base.BaseResponse;
import com.example.projectemarketg3.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class RatingBaseResponse extends BaseResponse {
    List<Rating> ratings;
}
