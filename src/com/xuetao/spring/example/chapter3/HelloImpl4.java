package com.xuetao.spring.example.chapter3;

import com.xuetao.spring.example.helloworld.HelloApi;

public class HelloImpl4 implements HelloApi
{

	private String message;
	private int index;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

	public void sayHello()
	{
		System.out.println("set·½·¨×¢Èë£ºmessage=" + this.message + "  : index=" + this.index);
		// TODO Auto-generated method stub

	}

}
