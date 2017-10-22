package com.neusoft.exam.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.exam.pojo.UserTable;
import com.neusoft.exam.pojo.UserTableExample;

public interface UserTableService {

	 long countByExample(UserTableExample example);

	 int deleteByExample(UserTableExample example);

	 int deleteByPrimaryKey(Integer userId);

	 int insert(UserTable record);

	 int insertSelective(UserTable record);

	 List<UserTable> selectByExample(UserTableExample example);

	 UserTable selectByPrimaryKey(Integer userId);

	 int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

	 int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);

	 int updateByPrimaryKeySelective(UserTable record);

	 int updateByPrimaryKey(UserTable record);
}
