package com.xuetao.spring.example.helloworld;

public class HelloImpl2 implements HelloApi
{
	private String messageString;

	public HelloImpl2()
	{
		this.messageString = "hello world!";
	}

	public HelloImpl2(String message)
	{

		this.messageString = message;
	}

	public void sayHello()
	{
		System.out.println(messageString);

	}

}
