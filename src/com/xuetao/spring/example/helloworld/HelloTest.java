package com.xuetao.spring.example.helloworld;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloTest
{

	/**
	 *demo来源： http://sishuok.com/forum/blogPost/list/2428.html
	 * 
	 * @param args
	 */
	@Test
	public void helloWorldTest()
	{
		// 读取配置文件，实例化一个IOC容器；ApplicationContext实现，从classpath获取配置文件；
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");

		// 从容器中实例化一个bean，注意完全是面向接口编程，而不是，面向实现
		HelloApi helloApi = context.getBean("hello", HelloApi.class);

		helloApi.sayHello();

	}

	// 用另外一种方式读取配置文件
	@Test
	public void helloWorldFileTest()
	{
		File file = new File("helloworld.xml");
		Resource resource = new FileSystemResource(file);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		HelloApi helloApi = (HelloApi) beanFactory.getBean("hello");

		// 从容器中实例化一个bean，注意完全是面向接口编程，而不是，面向实现

		helloApi.sayHello();
	}

	@Test
	public void test6()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi helloApi = beanFactory.getBean("hello", HelloApi.class);
		helloApi.sayHello();

		HelloApi helloapi1 = beanFactory.getBean("alias", HelloApi.class);
		helloapi1.sayHello();

		HelloApi helloapi2 = beanFactory.getBean("alias1", HelloApi.class);
		helloapi1.sayHello();

		String[] strings = beanFactory.getAliases("helloworld");
		for (int i = 0; i < strings.length; i++)
		{
			System.out.println(strings[i]);
		}

		System.out.println("=======namingbean6.xml bean 别名========");
		Assert.assertEquals(2, strings.length);
	}

	@Test
	public void test7()
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi helloApi = beanFactory.getBean("helloworld2", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void test8()
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter2/instantiatingBean.xml");
		HelloApi helloApi = beanFactory.getBean("bean1", HelloApi.class);
		helloApi.sayHello();

		HelloApi helloApi1 = beanFactory.getBean("bean2", HelloApi.class);
		helloApi1.sayHello();
	}

}
