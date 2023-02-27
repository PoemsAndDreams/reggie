package com.yutian.reggie.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yutian.reggie.entity.User;

public interface UserService extends IService<User> {
    //发送邮件
    void sendMsg(String to,String subject,String text);
}
