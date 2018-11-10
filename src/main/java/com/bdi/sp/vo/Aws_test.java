package com.bdi.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("aws")
@Data
public class Aws_test {
	
	private Integer atnum;
	private String atname;
	private String atage;
	
}
