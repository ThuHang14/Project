package com.example.projectemarketg3.dto.request.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchasesRequest {
    private Integer purchases;
    private Integer cancel;
    private Integer quantityUser;
}
