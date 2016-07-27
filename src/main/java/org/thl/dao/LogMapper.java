package org.thl.dao;

import org.thl.entity.Log;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:06
 */
public interface LogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}
