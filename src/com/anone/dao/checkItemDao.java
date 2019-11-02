package com.anone.dao;

import com.anone.domain.checkItem;
import com.anone.domain.checkItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface checkItemDao {
    int countByExample(checkItemQuery example);

    int deleteByExample(checkItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(checkItem record);

    int insertSelective(checkItem record);

    List<checkItem> selectByExample(checkItemQuery example);

    checkItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") checkItem record, @Param("example") checkItemQuery example);

    int updateByExample(@Param("record") checkItem record, @Param("example") checkItemQuery example);

    int updateByPrimaryKeySelective(checkItem record);

    int updateByPrimaryKey(checkItem record);
}