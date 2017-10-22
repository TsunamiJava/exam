package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.exam.pojo.UserTable;
import com.neusoft.exam.service.UserTableService;

//JUnit����
@RunWith(SpringJUnit4ClassRunner.class)
//��ȡ����xml�ļ�
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class test {
	
	@Autowired
	private UserTableService userTableService;
	
	@Test
	public void tests(){
		PageHelper.startPage(1, 5);
		List<UserTable> list= userTableService.selectByExample(null);
		PageInfo<UserTable> stulist=new PageInfo<UserTable>(list);
		for (UserTable student : list) {
			System.out.println(student);
		}
		System.out.println(stulist.getTotal());
	}
}
