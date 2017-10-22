package com.neusoft.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;

import com.neusoft.exam.pojo.UserTableExample;
import com.neusoft.exam.service.UserTableService;

//@Controller
//获取配置xml文件
//@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class UserTableController {
	
	//@Autowired
	private UserTableService userTableService;
	
	private UserTableExample userTableExample = new UserTableExample();
	
	
}
