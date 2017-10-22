package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.exam.mapper.UserTableMapper;
import com.neusoft.exam.pojo.UserTable;

@Service
public class onetomay {

	@Autowired
	private UserTableMapper utm;
	
	@Test
	public void  test() {
		//List<UserTable> list=utm.selectByExample(example);
	}
}
