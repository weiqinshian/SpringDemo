package com.xiewei.spring.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));

		// �������ļ��л�ȡ����
		IService hello = (IService) factory.getBean("service");
		hello.service("Helloween");

		factory.destroySingletons();
	}

}
