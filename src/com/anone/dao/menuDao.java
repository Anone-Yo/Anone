package com.anone.dao;

import com.anone.domain.menu;
import com.anone.domain.menuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface menuDao {
    int countByExample(menuQuery example);

    int deleteByExample(menuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(menu record);

    int insertSelective(menu record);

    List<menu> selectByExample(menuQuery example);

    menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") menu record, @Param("example") menuQuery example);

    int updateByExample(@Param("record") menu record, @Param("example") menuQuery example);

    int updateByPrimaryKeySelective(menu record);

    int updateByPrimaryKey(menu record);
}