package com.neusoft.exam.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.exam.mapper.ExamTableMapper;
import com.neusoft.exam.pojo.ExamTable;
import com.neusoft.exam.pojo.ExamTableExample;
import com.neusoft.exam.service.ExamTableService;

@Service
public class ExamTableServiceImpl implements ExamTableService {

	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(ExamTableServiceImpl.class);
	@Autowired
	private ExamTableMapper examTableMapper;
	
	public long countByExample(ExamTableExample example) {
		// TODO Auto-generated method stub
		return examTableMapper.countByExample(example);
	}

	public int deleteByExample(ExamTableExample example) {
		// TODO Auto-generated method stub
		return examTableMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer examId) {
		// TODO Auto-generated method stub
		return examTableMapper.deleteByPrimaryKey(examId);
	}

	public int insert(ExamTable record) {
		// TODO Auto-generated method stub
		return examTableMapper.insert(record);
	}

	public int insertSelective(ExamTable record) {
		// TODO Auto-generated method stub
		return examTableMapper.insertSelective(record);
	}

	public List<ExamTable> selectByExample(ExamTableExample example) {
		// TODO Auto-generated method stub
		return examTableMapper.selectByExample(example);
	}

	public ExamTable selectByPrimaryKey(Integer examId) {
		// TODO Auto-generated method stub
		return examTableMapper.selectByPrimaryKey(examId);
	}

	public int updateByExampleSelective(ExamTable record,
			ExamTableExample example) {
		// TODO Auto-generated method stub
		return examTableMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ExamTable record, ExamTableExample example) {
		// TODO Auto-generated method stub
		return examTableMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ExamTable record) {
		// TODO Auto-generated method stub
		return examTableMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ExamTable record) {
		// TODO Auto-generated method stub
		return examTableMapper.updateByPrimaryKey(record);
	}

}
