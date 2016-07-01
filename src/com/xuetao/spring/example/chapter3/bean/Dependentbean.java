package com.xuetao.spring.example.chapter3.bean;

import java.io.IOException;

public class Dependentbean {

	private ResourseBean resourceBean;

    public void write(String ss) throws IOException {  
        System.out.println("DependentBean:=======写资源");  
        resourceBean.getFosFileOutputStream().write(ss.getBytes());  
    }  
    //初始化方法  
    public void init() throws IOException {  
        System.out.println("DependentBean:=======初始化");  
        resourceBean.getFosFileOutputStream().write("DependentBean:=======初始化=====".getBytes());  
    }  
    //销毁方法  
    public void destroy() throws IOException {  
        System.out.println("DependentBean:=======销毁");  
        //在销毁之前需要往文件中写销毁内容  
        resourceBean.getFosFileOutputStream().write("DependentBean:=======销毁=====".getBytes());  
    }
	public ResourseBean getResourceBean() {
		return resourceBean;
	}
	public void setResourceBean(ResourseBean resourceBean) {
		this.resourceBean = resourceBean;
	}  
    
    
}
