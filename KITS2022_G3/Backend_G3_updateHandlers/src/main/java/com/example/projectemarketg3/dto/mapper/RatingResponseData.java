package com.example.projectemarketg3.dto.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@AllArgsConstructor
@Data
@Builder
public class RatingResponseData {
    private long ratingId;
    private long productId;
    private long userId;
    private Date createAt;
    private String note;
    private String image;
    private boolean checking;
}
