package com.app.chengyifang.mapper;

import com.app.chengyifang.model.InfoView;
import com.app.chengyifang.model.InfoViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoViewMapper {
    int countByExample(InfoViewExample example);

    int deleteByExample(InfoViewExample example);

    int deleteByPrimaryKey(String id);

    int insert(InfoView record);

    int insertSelective(InfoView record);

    List<InfoView> selectByExample(InfoViewExample example);

    InfoView selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InfoView record, @Param("example") InfoViewExample example);

    int updateByExample(@Param("record") InfoView record, @Param("example") InfoViewExample example);

    int updateByPrimaryKeySelective(InfoView record);

    int updateByPrimaryKey(InfoView record);
}