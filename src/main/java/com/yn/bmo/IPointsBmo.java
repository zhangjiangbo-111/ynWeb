package com.yn.bmo;

import com.yn.entity.Points;
import com.yn.entity.PointsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IPointsBmo {
    int countByExample(Points example);

    int deleteByExample(PointsExample example);

    int deleteByPrimaryKey(String name);

    int insert(Points record);

    int insertSelective(Points record);

    List<Map<String, Object>> selectByExample(PointsExample example, Points record);

    List<Map<String, Object>> queryByConditions(Points record);

    Integer selectTotal(Points record);

    List<Map<String, Object>> selectByDriver(PointsExample example);

    Points selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByExample(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByPrimaryKeySelective(Points record);

    int updateByPrimaryKey(Points record);

    List<Map<String,Object>> queryByDriver(Points recod);
}
