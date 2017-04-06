package com.app.chengyifang.mapper;

import com.app.chengyifang.model.HaveToGo;
import com.app.chengyifang.model.HaveToGoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaveToGoMapper {
    int countByExample(HaveToGoExample example);

    int deleteByExample(HaveToGoExample example);

    int deleteByPrimaryKey(String id);

    int insert(HaveToGo record);

    int insertSelective(HaveToGo record);

    List<HaveToGo> selectByExample(HaveToGoExample example);

    HaveToGo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HaveToGo record, @Param("example") HaveToGoExample example);

    int updateByExample(@Param("record") HaveToGo record, @Param("example") HaveToGoExample example);

    int updateByPrimaryKeySelective(HaveToGo record);

    int updateByPrimaryKey(HaveToGo record);
}