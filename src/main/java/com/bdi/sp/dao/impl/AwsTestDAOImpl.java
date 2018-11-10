package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.AwsTestDAO;
import com.bdi.sp.vo.Aws_test;

@Repository
public class AwsTestDAOImpl implements AwsTestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Aws_test> selectAwsTestList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.bdi.sp.aws_test.selectAwsTestList");
	}

	@Override
	public Aws_test selectAwsTest(int atnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.bdi.sp.aws_test.selectAwsTest",atnum);
	}

	@Override
	public Integer insertAwsTest(Aws_test aws) {
		// TODO Auto-generated method stub
		return ss.insert("com.bdi.sp.aws_test.insertAwsTest",aws);
	}

	@Override
	public Integer updateAwsTest(Aws_test aws) {
		// TODO Auto-generated method stub
		return ss.update("com.bdi.sp.aws_test.updateAwsTest",aws);
	}

	@Override
	public Integer deleteAwsTest(int atnum) {
		// TODO Auto-generated method stub
		return ss.delete("com.bdi.sp.aws_test.insertAwsTest",atnum);
	}

}
