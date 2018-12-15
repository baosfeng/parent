package com.mall.dao;

import com.mall.entity.Goods;
import org.springframework.stereotype.Repository;

/**
 * 商品Mapper
 * @author 小书包
 */
@Repository
public interface GoodsMapper {

	/**
	 * 根据主键删除
	 * @param uuid
	 * @return
	 */
    int deleteByPrimaryKey(Integer uuid);

	/**
	 * 完整的插入记录
	 * @param record
	 * @return
	 */
    int insert(Goods record);

	/**
	 * 根据已有的值进行插入
	 * @param record
	 * @return
	 */
    int insertSelective(Goods record);

	/**
	 * 根据主键查询元素
	 * @param uuid
	 * @return
	 */
    Goods selectByPrimaryKey(Integer uuid);

	/**
	 * 根据已有的值进行更新记录
	 * @param record
	 * @return
	 */
    int updateByPrimaryKeySelective(Goods record);

	/**
	 * 完整的更新记录
	 * @param record
	 * @return
	 */
    int updateByPrimaryKey(Goods record);
}