package com.xuetao.spring.example.chapter3.bean;

import java.io.IOException;

public class Dependentbean {

	private ResourseBean resourceBean;

    public void write(String ss) throws IOException {  
        System.out.println("DependentBean:=======д��Դ");  
        resourceBean.getFosFileOutputStream().write(ss.getBytes());  
    }  
    //��ʼ������  
    public void init() throws IOException {  
        System.out.println("DependentBean:=======��ʼ��");  
        resourceBean.getFosFileOutputStream().write("DependentBean:=======��ʼ��=====".getBytes());  
    }  
    //���ٷ���  
    public void destroy() throws IOException {  
        System.out.println("DependentBean:=======����");  
        //������֮ǰ��Ҫ���ļ���д��������  
        resourceBean.getFosFileOutputStream().write("DependentBean:=======����=====".getBytes());  
    }
	public ResourseBean getResourceBean() {
		return resourceBean;
	}
	public void setResourceBean(ResourseBean resourceBean) {
		this.resourceBean = resourceBean;
	}  
    
    
}
