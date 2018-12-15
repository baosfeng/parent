package com.mall.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author 小书包
 */
@Data
public class Customer {
    private Integer uuid;

    private String userName;

    private String password;

    private String displayName;

    private Date registerTime;

}