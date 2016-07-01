package com.xuetao.spring.example.chapter3.bean;

import com.xuetao.spring.example.helloworld.HelloApi;

public class HelloApiDecoratorBean implements HelloApi
{
	private HelloApi helloApi;

	// 无参构造器
	public HelloApiDecoratorBean()
	{
	}

	// 有参构造器
	public HelloApiDecoratorBean(HelloApi helloApi)
	{
		this.helloApi = helloApi;
	}

	public HelloApi getHelloApi()
	{
		return helloApi;
	}

	public void setHelloApi(HelloApi helloApi)
	{
		this.helloApi = helloApi;
	}

	public void sayHello()
	{
		System.out.println("装饰一下…………………………………………");
		// TODO Auto-generated method stub
		helloApi.sayHello();

		System.out.println("装饰一下…………………………………………");

	}

}
