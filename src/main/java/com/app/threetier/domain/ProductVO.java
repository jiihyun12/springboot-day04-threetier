package com.app.threetier.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductVO {
    private Long id;
    private String productName;

//    클래스 타입의 기본 값 null
//    검증할 떄 null로 비교하기 위해 int를 Integer로 쓴다.
    private Integer productPrice;
    private Integer productStock;
    private String productBrand;
}
