package com.anone.dao;

import com.anone.domain.order;
import com.anone.domain.orderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface orderDao {
    int countByExample(orderQuery example);

    int deleteByExample(orderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(order record);

    int insertSelective(order record);

    List<order> selectByExample(orderQuery example);

    order selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") order record, @Param("example") orderQuery example);

    int updateByExample(@Param("record") order record, @Param("example") orderQuery example);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}