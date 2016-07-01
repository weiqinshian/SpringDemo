package com.xuetao.spring.example.chapter3.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourseBean {

	private File file;
	private FileOutputStream fosFileOutputStream;

	// 初始化方法
	public void init() {
		System.out.println("ResourceBean:========初始化");
		// 加载资源,在此只是演示
		System.out.println("ResourceBean:========加载资源，执行一些预操作");
		try {
			this.fosFileOutputStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 销毁资源方法
	public void destroy() {
		System.out.println("ResourceBean:========销毁");
		// 释放资源
		System.out.println("ResourceBean:========释放资源，执行一些清理操作");
		try {
			fosFileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileOutputStream getFosFileOutputStream() {
		return fosFileOutputStream;
	}

	public void setFosFileOutputStream(FileOutputStream fosFileOutputStream) {
		this.fosFileOutputStream = fosFileOutputStream;
	}

}
