package com.anone.dao;

import com.anone.domain.country;
import com.anone.domain.countryQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface countryDao {
    int countByExample(countryQuery example);

    int deleteByExample(countryQuery example);

    int deleteByPrimaryKey(Short countryId);

    int insert(country record);

    int insertSelective(country record);

    List<country> selectByExample(countryQuery example);

    country selectByPrimaryKey(Short countryId);

    int updateByExampleSelective(@Param("record") country record, @Param("example") countryQuery example);

    int updateByExample(@Param("record") country record, @Param("example") countryQuery example);

    int updateByPrimaryKeySelective(country record);

    int updateByPrimaryKey(country record);
}