package com.mall.dao;

import com.mall.entity.Store;
import org.springframework.stereotype.Repository;

/**
 * 库存Mapper
 * @author 小书包
 */
@Repository
public interface StoreMapper {
	/**
	 * 根据主键删除元素
	 * @param uuid
	 * @return
	 */
    int deleteByPrimaryKey(Integer uuid);

	/**
	 * 插入元素
	 * @param record
	 * @return
	 */
    int insert(Store record);

	/**
	 * 插入已有的值
	 * @param record
	 * @return
	 */
    int insertSelective(Store record);

	/**
	 * 根据主键查询
	 * @param uuid
	 * @return
	 */
    Store selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有的值进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(Store record);

	/**
	 * 完整的进行更新
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(Store record);
}