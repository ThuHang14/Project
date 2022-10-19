package com.example.projectemarketg3.dto.request.other;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StatusOrderRequest {
    private Long orderId;
    private Long userId;
    private Long statusId;
}
