package com.xuetao.spring.example.helloworld;

//静态工厂类
public class HelloApiStaticFactory {

	//工厂方法
	
	public static HelloApi newInstance( String message) {
		  //返回需要的Bean实例  
		return new HelloImpl2(message);
	}
	
	public HelloApi newInstance2(String message) {
		
		return new HelloImpl2(message);
	}
}
