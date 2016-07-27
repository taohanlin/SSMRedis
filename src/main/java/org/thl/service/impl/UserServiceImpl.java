package org.thl.service.impl;

import org.springframework.stereotype.Service;
import org.thl.dao.UserMapper;
import org.thl.entity.User;
import org.thl.service.IUserService;

import javax.annotation.Resource;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:13
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
