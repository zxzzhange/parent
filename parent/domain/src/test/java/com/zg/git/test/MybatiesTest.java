package com.zg.git.test;


import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.zg.git.mapper.IMyClassMapper;

public class MybatiesTest extends BaseTest{

	@Resource
	private IMyClassMapper myClassMapper;
	
	@Before
	public void before(){}
	
	@Test
	public void  test(){
		System.out.println(myClassMapper);
	}
	
}
