package com.example.projectemarketg3.dto.response.rating.query;

import com.example.projectemarketg3.dto.response.base.query.ResponseDataQuery;
import com.example.projectemarketg3.dto.mapper.RatingResponseData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class GetRatingByStarResponseData extends ResponseDataQuery {
  private List<RatingResponseData> list;
}
