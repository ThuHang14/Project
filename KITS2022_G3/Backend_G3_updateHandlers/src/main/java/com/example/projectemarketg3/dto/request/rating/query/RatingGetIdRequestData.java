package com.example.projectemarketg3.dto.request.rating.query;

import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class RatingGetIdRequestData extends RequestDataQuery {
private Long id;
}
