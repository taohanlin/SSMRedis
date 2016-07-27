package org.thl.dao;

import org.thl.entity.Apply;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:05
 */
public interface ApplyMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);




}
