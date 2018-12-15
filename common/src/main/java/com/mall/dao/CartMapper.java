package com.mall.dao;

import com.mall.entity.Cart;
import org.springframework.stereotype.Repository;

/**
 * 购物车Mapper
 * @author 小书包
 */
@Repository
public interface CartMapper {

	/**
	 * 删除
	 * @param uuid
	 * @return
	 */
    int deleteByPrimaryKey(Integer uuid);

	/**
	 * 插入
	 * @param record
	 * @return
	 */
    int insert(Cart record);

	/**
	 * 根据已有条件插入
	 * @param record
	 * @return
	 */
    int insertSelective(Cart record);

	/**
	 * 根据主键查询
	 * @param uuid
	 * @return
	 */
    Cart selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有条件更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(Cart record);

	/**
	 * 完整的进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(Cart record);
}