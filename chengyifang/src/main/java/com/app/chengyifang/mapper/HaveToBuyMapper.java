package com.app.chengyifang.mapper;

import com.app.chengyifang.model.HaveToBuy;
import com.app.chengyifang.model.HaveToBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaveToBuyMapper {
    int countByExample(HaveToBuyExample example);

    int deleteByExample(HaveToBuyExample example);

    int deleteByPrimaryKey(String id);

    int insert(HaveToBuy record);

    int insertSelective(HaveToBuy record);

    List<HaveToBuy> selectByExample(HaveToBuyExample example);

    HaveToBuy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HaveToBuy record, @Param("example") HaveToBuyExample example);

    int updateByExample(@Param("record") HaveToBuy record, @Param("example") HaveToBuyExample example);

    int updateByPrimaryKeySelective(HaveToBuy record);

    int updateByPrimaryKey(HaveToBuy record);
}