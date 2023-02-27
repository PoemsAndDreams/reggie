package com.yutian.reggie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yutian.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
