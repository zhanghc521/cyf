package com.app.chengyifang.mapper;

import com.app.chengyifang.model.HaveToKnow;
import com.app.chengyifang.model.HaveToKnowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaveToKnowMapper {
    int countByExample(HaveToKnowExample example);

    int deleteByExample(HaveToKnowExample example);

    int deleteByPrimaryKey(String id);

    int insert(HaveToKnow record);

    int insertSelective(HaveToKnow record);

    List<HaveToKnow> selectByExample(HaveToKnowExample example);

    HaveToKnow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HaveToKnow record, @Param("example") HaveToKnowExample example);

    int updateByExample(@Param("record") HaveToKnow record, @Param("example") HaveToKnowExample example);

    int updateByPrimaryKeySelective(HaveToKnow record);

    int updateByPrimaryKey(HaveToKnow record);
}