package com.anone.dao;

import com.anone.domain.checkGroup;
import com.anone.domain.checkGroupQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface checkGroupDao {
    int countByExample(checkGroupQuery example);

    int deleteByExample(checkGroupQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(checkGroup record);

    int insertSelective(checkGroup record);

    List<checkGroup> selectByExample(checkGroupQuery example);

    checkGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") checkGroup record, @Param("example") checkGroupQuery example);

    int updateByExample(@Param("record") checkGroup record, @Param("example") checkGroupQuery example);

    int updateByPrimaryKeySelective(checkGroup record);

    int updateByPrimaryKey(checkGroup record);
}