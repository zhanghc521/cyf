package com.app.chengyifang.mapper;

import com.app.chengyifang.model.Scenery;
import com.app.chengyifang.model.SceneryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneryMapper {
    int countByExample(SceneryExample example);

    int deleteByExample(SceneryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scenery record);

    int insertSelective(Scenery record);

    List<Scenery> selectByExample(SceneryExample example);

    Scenery selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scenery record, @Param("example") SceneryExample example);

    int updateByExample(@Param("record") Scenery record, @Param("example") SceneryExample example);

    int updateByPrimaryKeySelective(Scenery record);

    int updateByPrimaryKey(Scenery record);
}