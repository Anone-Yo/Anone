package com.anone.dao;

import com.anone.domain.setMeal;
import com.anone.domain.setMealQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface setMealDao {
    int countByExample(setMealQuery example);

    int deleteByExample(setMealQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(setMeal record);

    int insertSelective(setMeal record);

    List<setMeal> selectByExample(setMealQuery example);

    setMeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") setMeal record, @Param("example") setMealQuery example);

    int updateByExample(@Param("record") setMeal record, @Param("example") setMealQuery example);

    int updateByPrimaryKeySelective(setMeal record);

    int updateByPrimaryKey(setMeal record);
}