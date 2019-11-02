package com.anone.dao;

import com.anone.domain.role;
import com.anone.domain.roleQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface roleDao {
    int countByExample(roleQuery example);

    int deleteByExample(roleQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(role record);

    int insertSelective(role record);

    List<role> selectByExample(roleQuery example);

    role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") role record, @Param("example") roleQuery example);

    int updateByExample(@Param("record") role record, @Param("example") roleQuery example);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKey(role record);
}