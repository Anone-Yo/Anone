package com.anone.dao;

import com.anone.domain.orderSetting;
import com.anone.domain.orderSettingQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface orderSettingDao {
    int countByExample(orderSettingQuery example);

    int deleteByExample(orderSettingQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(orderSetting record);

    int insertSelective(orderSetting record);

    List<orderSetting> selectByExample(orderSettingQuery example);

    orderSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") orderSetting record, @Param("example") orderSettingQuery example);

    int updateByExample(@Param("record") orderSetting record, @Param("example") orderSettingQuery example);

    int updateByPrimaryKeySelective(orderSetting record);

    int updateByPrimaryKey(orderSetting record);
}