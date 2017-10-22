package com.neusoft.exam.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.exam.mapper.TitleTableMapper;
import com.neusoft.exam.pojo.TitleTable;
import com.neusoft.exam.pojo.TitleTableExample;
import com.neusoft.exam.service.TitleTableService;

@Service
public class TitleTableServiceImpl implements TitleTableService {

	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(TitleTableServiceImpl.class);
	@Autowired
	private TitleTableMapper titleTableMapper;
	
	public long countByExample(TitleTableExample example) {
		// TODO Auto-generated method stub
		return titleTableMapper.countByExample(example);
	}

	public int deleteByExample(TitleTableExample example) {
		// TODO Auto-generated method stub
		return titleTableMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer titleId) {
		// TODO Auto-generated method stub
		return titleTableMapper.deleteByPrimaryKey(titleId);
	}

	public int insert(TitleTable record) {
		// TODO Auto-generated method stub
		return titleTableMapper.insert(record);
	}

	public int insertSelective(TitleTable record) {
		// TODO Auto-generated method stub
		return titleTableMapper.insertSelective(record);
	}

	public List<TitleTable> selectByExample(TitleTableExample example) {
		// TODO Auto-generated method stub
		return titleTableMapper.selectByExample(example);
	}

	public TitleTable selectByPrimaryKey(Integer titleId) {
		// TODO Auto-generated method stub
		return titleTableMapper.selectByPrimaryKey(titleId);
	}

	public int updateByExampleSelective(TitleTable record,
			TitleTableExample example) {
		// TODO Auto-generated method stub
		return titleTableMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TitleTable record, TitleTableExample example) {
		// TODO Auto-generated method stub
		return titleTableMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TitleTable record) {
		// TODO Auto-generated method stub
		return titleTableMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TitleTable record) {
		// TODO Auto-generated method stub
		return titleTableMapper.updateByPrimaryKey(record);
	}

}
