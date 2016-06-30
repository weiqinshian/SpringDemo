package com.xuetao.spring.example.chapter3;

import com.xuetao.spring.example.helloworld.HelloApi;
import com.xuetao.spring.example.helloworld.HelloImpl3;

public class DependencyInjectByStaticFactory
{
	public static HelloApi newInstance(String message, int index)
	{
		return new HelloImpl3(message, index);

	}

}
