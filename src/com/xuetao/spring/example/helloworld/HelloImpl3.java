package com.xuetao.spring.example.helloworld;

public class HelloImpl3 implements HelloApi
{

	private String message;

	private int index;

	public HelloImpl3(String message, int index)
	{
		this.message = message;
		this.index = index;
	}

	public void sayHello()
	{
		System.out.println("参数信息" + message + "  : index=" + index);
		// TODO Auto-generated method stub

	}

}
