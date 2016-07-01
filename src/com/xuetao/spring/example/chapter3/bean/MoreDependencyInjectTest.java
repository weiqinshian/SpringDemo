package com.xuetao.spring.example.chapter3.bean;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoreDependencyInjectTest {

	/**
	 * @param args
	 */
	@Test
	public void testDependOn() throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"chapter3/depends-on.xml");
		// 一点要注册销毁回调，否则我们定义的销毁方法不执行
		context.registerShutdownHook();
		Dependentbean dependentBean = context.getBean("dependentbean",
				Dependentbean.class);
		dependentBean.write("aaa");
	}

}
