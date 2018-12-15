package com.mall.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 小书包
 */
@Data
public class Orders {
    private Integer uuid;

    private Integer customerUuid;

    private Date orderTime;

    private Integer totalMoney;

    private Integer saveMoney;

    private Short state;

}