package org.thl.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thl.entity.User;
import org.thl.service.IRedisService;
import org.thl.service.IUserService;

import javax.annotation.Resource;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 17:56
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private IUserService userServiceImpl;

    @Resource
    private IRedisService redisServiceImpl;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(){
        return this.userServiceImpl.selectByPrimaryKey(1).toString();
    }

    @RequestMapping("/addRedisUser")
    @ResponseBody
    public String addUser(){
        User user=this.userServiceImpl.selectByPrimaryKey(1);
        Gson gson=new Gson();
        this.redisServiceImpl.setValue(user.getAccount(),gson.toJson(user));
        return "SUCCESS";
    }

    @RequestMapping("/getRedisUser")
    @ResponseBody
    public String getRedisUser(){
        return this.redisServiceImpl.getValue("test");
    }

    @RequestMapping("/getCacheUser")
    @ResponseBody
    public  String getCacheUser(){
        return this.redisServiceImpl.getValue("admin");
    }



}
