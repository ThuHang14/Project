package com.example.projectemarketg3.dto.request.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderOffRequest {
    private Date createAt;
    private Long totalPrice;
    private Long statusId;
    private Long userId;
    private Long adminId;
    private String productId;
}
