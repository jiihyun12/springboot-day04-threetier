package com.app.threetier.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductVO {
    private Long id;
    private String productName;
    private int productPrice;
    private int productStock;
    private String productBrand;
}
