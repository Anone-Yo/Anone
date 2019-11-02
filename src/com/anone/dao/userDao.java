package com.anone.dao;

import com.anone.domain.user;
import com.anone.domain.userQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDao {
    int countByExample(userQuery example);

    int deleteByExample(userQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userQuery example);

    user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userQuery example);

    int updateByExample(@Param("record") user record, @Param("example") userQuery example);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}