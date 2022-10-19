package com.example.projectemarketg3.dto.request.rating.query;

import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ARatingByIdRequestData extends RequestDataQuery {
    private long id;
}
