package com.example.projectemarketg3.dto.response.rating.query;

import com.example.projectemarketg3.dto.response.base.query.ResponseDataQuery;
import com.example.projectemarketg3.dto.mapper.RatingResponseData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ARatingByIdResponseData extends ResponseDataQuery {
  private RatingResponseData rating;
}
