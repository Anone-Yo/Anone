package com.anone.dao;

import com.anone.domain.city;
import com.anone.domain.cityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cityDao {
    int countByExample(cityQuery example);

    int deleteByExample(cityQuery example);

    int deleteByPrimaryKey(Short cityId);

    int insert(city record);

    int insertSelective(city record);

    List<city> selectByExample(cityQuery example);

    city selectByPrimaryKey(Short cityId);

    int updateByExampleSelective(@Param("record") city record, @Param("example") cityQuery example);

    int updateByExample(@Param("record") city record, @Param("example") cityQuery example);

    int updateByPrimaryKeySelective(city record);

    int updateByPrimaryKey(city record);
}