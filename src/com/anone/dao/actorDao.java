package com.anone.dao;

import com.anone.domain.actor;
import com.anone.domain.actorQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface actorDao {
    int countByExample(actorQuery example);

    int deleteByExample(actorQuery example);

    int deleteByPrimaryKey(Short actorId);

    int insert(actor record);

    int insertSelective(actor record);

    List<actor> selectByExample(actorQuery example);

    actor selectByPrimaryKey(Short actorId);

    int updateByExampleSelective(@Param("record") actor record, @Param("example") actorQuery example);

    int updateByExample(@Param("record") actor record, @Param("example") actorQuery example);

    int updateByPrimaryKeySelective(actor record);

    int updateByPrimaryKey(actor record);
}