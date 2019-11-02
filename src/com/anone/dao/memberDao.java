package com.anone.dao;

import com.anone.domain.member;
import com.anone.domain.memberQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface memberDao {
    int countByExample(memberQuery example);

    int deleteByExample(memberQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(member record);

    int insertSelective(member record);

    List<member> selectByExample(memberQuery example);

    member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") member record, @Param("example") memberQuery example);

    int updateByExample(@Param("record") member record, @Param("example") memberQuery example);

    int updateByPrimaryKeySelective(member record);

    int updateByPrimaryKey(member record);
}