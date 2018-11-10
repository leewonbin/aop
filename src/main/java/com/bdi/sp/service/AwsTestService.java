package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.Aws_test;

public interface AwsTestService {
	public List<Aws_test> selectAwsTestList();
	public Aws_test selectAwsTest(int atnum);
	public Integer insertAwsTest(Aws_test aws);
	public Integer updateAwsTest(Aws_test aws);
	public Integer deleteAwsTest(int atnum);

}
