package org.thl.dao;

import org.thl.entity.Income;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:06
 */
public interface IncomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Income record);

    int insertSelective(Income record);

    Income selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}
