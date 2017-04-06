package com.app.chengyifang.mapper;

import com.app.chengyifang.model.HaveToEat;
import com.app.chengyifang.model.HaveToEatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaveToEatMapper {
    int countByExample(HaveToEatExample example);

    int deleteByExample(HaveToEatExample example);

    int deleteByPrimaryKey(String id);

    int insert(HaveToEat record);

    int insertSelective(HaveToEat record);

    List<HaveToEat> selectByExample(HaveToEatExample example);

    HaveToEat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HaveToEat record, @Param("example") HaveToEatExample example);

    int updateByExample(@Param("record") HaveToEat record, @Param("example") HaveToEatExample example);

    int updateByPrimaryKeySelective(HaveToEat record);

    int updateByPrimaryKey(HaveToEat record);
}