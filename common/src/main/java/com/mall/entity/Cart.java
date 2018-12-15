package com.mall.entity;

import lombok.Data;

/**
 * @author 小书包
 */
@Data
public class Cart {
    private Integer uuid;

    private Integer customerUuid;

    private Integer goodsUuid;

    private Integer buyNum;

}