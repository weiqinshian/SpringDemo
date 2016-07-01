package com.xuetao.spring.example.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuetao.spring.example.chapter3.bean.HelloApiDecoratorBean;
import com.xuetao.spring.example.chapter3.bean.IdRefTestBean;
import com.xuetao.spring.example.chapter3.bean.ListTestBean;
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

	@Test
	public void test2()// ����ʵ������
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/constructorDependencyInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi = beanFactory.getBean("byTypeID1", HelloApi.class);
		helloApi.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndexID1", HelloApi.class);
		helloApi1.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi2 = beanFactory.getBean("byNameID1", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void test3()// ����setע��
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/setterDependencyInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		HelloApi helloApi = beanFactory.getBean("setbean", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void test4()// ��̬ע��
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/booleanInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		booleanTestBean booleanTestBean1 = beanFactory
				.getBean("booleanbean", booleanTestBean.class);
		System.out.println(booleanTestBean1.isSuccess());
	}

	@Test
	public void test5()// ����idע��
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/idRefInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		IdRefTestBean idRefTestBean = beanFactory.getBean("refbean1", IdRefTestBean.class);
		System.out.println(idRefTestBean.getId());
	}

	@Test
	public void test6()// ע�뼯��list
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/listInject.xml");
		// ��ȡ���ݲ�����������ע���Bean
		ListTestBean listBean = beanFactory.getBean("listbean", ListTestBean.class);
		System.out.println(listBean.getValue().size());
		Assert.assertEquals(3, listBean.getValue().size());
	}

	@Test
	public void test7()// ע������bean
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/beanInject.xml");
		HelloApiDecoratorBean listBean = beanFactory.getBean("bean1", HelloApiDecoratorBean.class);
		listBean.sayHello();
		HelloApiDecoratorBean listBean2 = beanFactory.getBean("bean2", HelloApiDecoratorBean.class);
		listBean2.sayHello();
	}

	@Test
	public void testLocalAndparentBeanInject()// ע������bean ���ø�xml
	{
		// ��ʼ��������
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/chapter3/parentBeanInject.xml");
		// ��ʼ����ǰ����
		ApplicationContext apContext = new ClassPathXmlApplicationContext(new String[]
		{ "/chapter3/localBeanInject.xml" }, applicationContext);

		HelloApiDecoratorBean listBean = apContext.getBean("bean1", HelloApiDecoratorBean.class);
		listBean.sayHello();// ��Bean����local bean
		HelloApiDecoratorBean listBean2 = apContext.getBean("bean2", HelloApiDecoratorBean.class);
		listBean2.sayHello();// ��Bean����parent bean
	}
}
