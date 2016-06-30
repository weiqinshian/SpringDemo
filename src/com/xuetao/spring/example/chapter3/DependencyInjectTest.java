package com.xuetao.spring.example.chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuetao.spring.example.helloworld.HelloApi;

public class DependencyInjectTest
{
	public static void main(String[] args)
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/constructorDependencyInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi = beanFactory.getBean("byType", HelloApi.class);
		helloApi.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndex", HelloApi.class);
		helloApi1.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi2 = beanFactory.getBean("byName", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void test1()
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/constructorDependencyInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi = beanFactory.getBean("byTypeID", HelloApi.class);
		helloApi.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndexID", HelloApi.class);
		helloApi1.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi2 = beanFactory.getBean("byNameID", HelloApi.class);
		helloApi2.sayHello();
	}

}
