package com.neusoft.exam.mapper;

import com.neusoft.exam.pojo.TitleTable;
import com.neusoft.exam.pojo.TitleTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleTableMapper {
    long countByExample(TitleTableExample example);

    int deleteByExample(TitleTableExample example);

    int deleteByPrimaryKey(Integer titleId);

    int insert(TitleTable record);

    int insertSelective(TitleTable record);

    List<TitleTable> selectByExample(TitleTableExample example);

    TitleTable selectByPrimaryKey(Integer titleId);

    int updateByExampleSelective(@Param("record") TitleTable record, @Param("example") TitleTableExample example);

    int updateByExample(@Param("record") TitleTable record, @Param("example") TitleTableExample example);

    int updateByPrimaryKeySelective(TitleTable record);

    int updateByPrimaryKey(TitleTable record);
}