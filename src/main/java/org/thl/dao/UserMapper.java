package org.thl.dao;

import org.thl.entity.User;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:06
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
