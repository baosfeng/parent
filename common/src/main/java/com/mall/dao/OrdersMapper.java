package com.mall.dao;

import com.mall.entity.Orders;
import org.springframework.stereotype.Repository;

/**
 * 订单Mapper
 * @author 小书包
 */
@Repository
public interface OrdersMapper {
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
    int insert(Orders record);

	/**
	 * 已有的值进行插入
	 * @param record
	 * @return
	 */
    int insertSelective(Orders record);

	/**
	 * 根据主键查询
	 * @param uuid
	 * @return
	 */
    Orders selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有的值进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(Orders record);

	/**
	 * 完整的进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(Orders record);
}