package com.anone.dao;

import com.anone.domain.address;
import com.anone.domain.addressQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface addressDao {
    int countByExample(addressQuery example);

    int deleteByExample(addressQuery example);

    int deleteByPrimaryKey(Short addressId);

    int insert(address record);

    int insertSelective(address record);

    List<address> selectByExampleWithBLOBs(addressQuery example);

    List<address> selectByExample(addressQuery example);

    address selectByPrimaryKey(Short addressId);

    int updateByExampleSelective(@Param("record") address record, @Param("example") addressQuery example);

    int updateByExampleWithBLOBs(@Param("record") address record, @Param("example") addressQuery example);

    int updateByExample(@Param("record") address record, @Param("example") addressQuery example);

    int updateByPrimaryKeySelective(address record);

    int updateByPrimaryKeyWithBLOBs(address record);

    int updateByPrimaryKey(address record);
}