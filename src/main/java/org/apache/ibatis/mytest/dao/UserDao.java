package org.apache.ibatis.mytest.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mytest.UserInfo;

import java.util.List;


public interface UserDao {


    @Select("select * from user_info")
    public List<UserInfo> getUsers();
}
