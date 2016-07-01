package com.xuetao.spring.example.chapter3.bean;

import com.xuetao.spring.example.helloworld.HelloApi;

public class HelloApiDecoratorBean implements HelloApi
{
	private HelloApi helloApi;

	// �޲ι�����
	public HelloApiDecoratorBean()
	{
	}

	// �вι�����
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
		System.out.println("װ��һ�¡�������������������������������");
		// TODO Auto-generated method stub
		helloApi.sayHello();

		System.out.println("װ��һ�¡�������������������������������");

	}

}
