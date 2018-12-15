package com.mall.entity;

import lombok.Data;

/**
 * @author 小书包
 */
@Data
public class OrderDetail {
    private Integer uuid;

    private Integer orderUuid;

    private Integer goodsUuid;

    private Integer orderNum;

    private Integer price;

    private Integer money;

    private Integer saveMoney;

}