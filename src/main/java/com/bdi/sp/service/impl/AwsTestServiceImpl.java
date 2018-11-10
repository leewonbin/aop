package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.AwsTestDAO;
import com.bdi.sp.service.AwsTestService;
import com.bdi.sp.vo.Aws_test;

@Service
public class AwsTestServiceImpl implements AwsTestService {
	
	@Autowired
	private AwsTestDAO atdao;
	
	@Override
	public List<Aws_test> selectAwsTestList() {
		// TODO Auto-generated method stub
		return atdao.selectAwsTestList();
	}

	@Override
	public Aws_test selectAwsTest(int atnum) {
		// TODO Auto-generated method stub
		return atdao.selectAwsTest(atnum);
	}

	@Override
	public Integer insertAwsTest(Aws_test aws) {
		// TODO Auto-generated method stub
		return atdao.insertAwsTest(aws);
	}

	@Override
	public Integer updateAwsTest(Aws_test aws) {
		// TODO Auto-generated method stub
		return atdao.updateAwsTest(aws);
	}

	@Override
	public Integer deleteAwsTest(int atnum) {
		// TODO Auto-generated method stub
		return atdao.deleteAwsTest(atnum);
	}

}
