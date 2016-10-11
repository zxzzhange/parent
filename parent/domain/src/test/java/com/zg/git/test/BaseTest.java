package com.zg.git.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试继承
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-test.xml"})
public abstract class BaseTest {
	
	//TODO spring 容器类，使用 @Resouce 注解注入
	
	/**
	 * 存在缓存可以使用在这里清除缓存，防止缓存影响测试
	 */
	@Before
	public abstract void before();
	
	//TODO 下面可以正常使用测试类
	
}
