package com.xuetao.spring.example.helloworld;

//��̬������
public class HelloApiStaticFactory {

	//��������
	
	public static HelloApi newInstance( String message) {
		  //������Ҫ��Beanʵ��  
		return new HelloImpl2(message);
	}
	
	public HelloApi newInstance2(String message) {
		
		return new HelloImpl2(message);
	}
}
