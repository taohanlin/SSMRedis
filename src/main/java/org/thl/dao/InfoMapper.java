package org.thl.dao;

import org.thl.entity.Info;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:06
 */
public interface InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}
