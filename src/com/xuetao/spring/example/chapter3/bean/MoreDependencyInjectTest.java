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
		// һ��Ҫע�����ٻص����������Ƕ�������ٷ�����ִ��
		context.registerShutdownHook();
		Dependentbean dependentBean = context.getBean("dependentbean",
				Dependentbean.class);
		dependentBean.write("aaa");
	}

}
