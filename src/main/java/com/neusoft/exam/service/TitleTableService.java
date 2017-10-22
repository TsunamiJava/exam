package com.neusoft.exam.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.exam.pojo.TitleTable;
import com.neusoft.exam.pojo.TitleTableExample;

public interface TitleTableService {

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
