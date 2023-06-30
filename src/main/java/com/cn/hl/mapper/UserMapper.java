package com.cn.hl.mapper;

import com.cn.hl.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from tb_user ")
    List<User> selectAll();
}
