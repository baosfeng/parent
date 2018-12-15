package com.mall.dao;

import com.mall.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 * 顾客Mapper
 * @author 小书包
 */
@Repository
public interface CustomerMapper {

	/**
	 * 根据主键删除
	 * @param uuid
	 * @return
	 */
    int deleteByPrimaryKey(Integer uuid);

	/**
	 * 根据记录插入
	 * @param record
	 * @return
	 */
    int insert(Customer record);

	/**
	 * 根据已有记录进行插入
	 * @param record
	 * @return
	 */
    int insertSelective(Customer record);

	/**
	 * 根据主键查询
	 * @param uuid
	 * @return
	 */
    Customer selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有条件更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(Customer record);

	/**
	 * 完整的进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(Customer record);
}