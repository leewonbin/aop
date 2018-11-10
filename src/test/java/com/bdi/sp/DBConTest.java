package com.bdi.sp;


import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.dao.AwsTestDAO;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBConTest {
	
	@Autowired
	private AwsTestDAO atdao;
	
	
	/*@Test
	public void test() throws SQLException {
		List<Map<String,String>> atList = ss.selectList("com.bdi.sp.aws_test.selectawstestList");
		assertEquals(1, atList.size());
		log.info("atList=>{}",atList);
	}
*/
	@Test
	public void test() throws SQLException {
		assertEquals(1, atdao.selectAwsTestList().size());
	}
}
