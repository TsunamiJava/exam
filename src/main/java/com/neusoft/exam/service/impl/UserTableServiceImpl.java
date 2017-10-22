package com.neusoft.exam.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.exam.mapper.UserTableMapper;
import com.neusoft.exam.pojo.UserTable;
import com.neusoft.exam.pojo.UserTableExample;
import com.neusoft.exam.service.UserTableService;

@Service
public class UserTableServiceImpl implements UserTableService {

	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(UserTableServiceImpl.class);
	@Autowired
	private UserTableMapper userTableMapper;
	
	public long countByExample(UserTableExample example) {
		// TODO Auto-generated method stub
		return userTableMapper.countByExample(example);
	}

	public int deleteByExample(UserTableExample example) {
		// TODO Auto-generated method stub
		return userTableMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userTableMapper.deleteByPrimaryKey(userId);
	}

	public int insert(UserTable record) {
		// TODO Auto-generated method stub
		return userTableMapper.insert(record);
	}

	public int insertSelective(UserTable record) {
		// TODO Auto-generated method stub
		return userTableMapper.insertSelective(record);
	}

	public List<UserTable> selectByExample(UserTableExample example) {
		// TODO Auto-generated method stub
		return userTableMapper.selectByExample(example);
	}

	public UserTable selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userTableMapper.selectByPrimaryKey(userId);
	}

	public int updateByExampleSelective(UserTable record,
			UserTableExample example) {
		// TODO Auto-generated method stub
		return userTableMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(UserTable record, UserTableExample example) {
		// TODO Auto-generated method stub
		return userTableMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(UserTable record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(UserTable record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
