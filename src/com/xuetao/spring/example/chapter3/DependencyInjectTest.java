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
		// 获取根据参数类型依赖注入的Bean
		HelloApi helloApi = beanFactory.getBean("byType", HelloApi.class);
		helloApi.sayHello();
		// 获取根据参数索引依赖注入的Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndex", HelloApi.class);
		helloApi1.sayHello();
		// 获取根据参数名称依赖注入的Bean
		HelloApi helloApi2 = beanFactory.getBean("byName", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void test1()
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/constructorDependencyInject.xml");
		// 获取根据参数类型依赖注入的Bean
		HelloApi helloApi = beanFactory.getBean("byTypeID", HelloApi.class);
		helloApi.sayHello();
		// 获取根据参数索引依赖注入的Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndexID", HelloApi.class);
		helloApi1.sayHello();
		// 获取根据参数名称依赖注入的Bean
		HelloApi helloApi2 = beanFactory.getBean("byNameID", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void test2()// 测试实例工厂
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/constructorDependencyInject.xml");
		// 获取根据参数类型依赖注入的Bean
		HelloApi helloApi = beanFactory.getBean("byTypeID1", HelloApi.class);
		helloApi.sayHello();
		// 获取根据参数索引依赖注入的Bean
		HelloApi helloApi1 = beanFactory.getBean("byIndexID1", HelloApi.class);
		helloApi1.sayHello();
		// 获取根据参数名称依赖注入的Bean
		HelloApi helloApi2 = beanFactory.getBean("byNameID1", HelloApi.class);
		helloApi2.sayHello();
	}

	@Test
	public void test3()// 测试set注入
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"/chapter3/setterDependencyInject.xml");
		// 获取根据参数类型依赖注入的Bean
		HelloApi helloApi = beanFactory.getBean("setbean", HelloApi.class);
		helloApi.sayHello();
	}

	@Test
	public void test4()// 静态注入
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/booleanInject.xml");
		// 获取根据参数类型依赖注入的Bean
		booleanTestBean booleanTestBean1 = beanFactory
				.getBean("booleanbean", booleanTestBean.class);
		System.out.println(booleanTestBean1.isSuccess());
	}

	@Test
	public void test5()// 依赖id注入
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/idRefInject.xml");
		// 获取根据参数类型依赖注入的Bean
		IdRefTestBean idRefTestBean = beanFactory.getBean("refbean1", IdRefTestBean.class);
		System.out.println(idRefTestBean.getId());
	}

	@Test
	public void test6()// 注入集合list
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/listInject.xml");
		// 获取根据参数类型依赖注入的Bean
		ListTestBean listBean = beanFactory.getBean("listbean", ListTestBean.class);
		System.out.println(listBean.getValue().size());
		Assert.assertEquals(3, listBean.getValue().size());
	}

	@Test
	public void test7()// 注入依赖bean
	{

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/chapter3/beanInject.xml");
		HelloApiDecoratorBean listBean = beanFactory.getBean("bean1", HelloApiDecoratorBean.class);
		listBean.sayHello();
		HelloApiDecoratorBean listBean2 = beanFactory.getBean("bean2", HelloApiDecoratorBean.class);
		listBean2.sayHello();
	}

	@Test
	public void testLocalAndparentBeanInject()// 注入依赖bean 利用父xml
	{
		// 初始化父容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/chapter3/parentBeanInject.xml");
		// 初始化当前容器
		ApplicationContext apContext = new ClassPathXmlApplicationContext(new String[]
		{ "/chapter3/localBeanInject.xml" }, applicationContext);

		HelloApiDecoratorBean listBean = apContext.getBean("bean1", HelloApiDecoratorBean.class);
		listBean.sayHello();// 该Bean引用local bean
		HelloApiDecoratorBean listBean2 = apContext.getBean("bean2", HelloApiDecoratorBean.class);
		listBean2.sayHello();// 该Bean引用parent bean
	}
}
