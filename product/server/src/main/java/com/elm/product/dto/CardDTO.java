package com.elm.product.dto;

import lombok.Data;

@Data
public class CardDTO {

    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CardDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CardDTO() {
    }
}
