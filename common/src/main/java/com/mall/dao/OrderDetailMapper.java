package com.mall.dao;

import com.mall.entity.OrderDetail;
import org.springframework.stereotype.Repository;

/**
 * 订单详情Mapper
 * @author 小书包
 */
@Repository
public interface OrderDetailMapper {
	/**
	 * 根据主键删除
	 * @param uuid
	 * @return
	 */
    int deleteByPrimaryKey(Integer uuid);

	/**
	 * 完整的插入元素
	 * @param record
	 * @return
	 */
    int insert(OrderDetail record);

	/**
	 * 插入部分元素
	 * @param record
	 * @return
	 */
    int insertSelective(OrderDetail record);

	/**
	 * 根据主键查询
	 * @param uuid
	 * @return
	 */
    OrderDetail selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有的值进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(OrderDetail record);

	/**
	 * 完整的进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(OrderDetail record);
}