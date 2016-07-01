package com.xuetao.spring.example.chapter3.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourseBean {

	private File file;
	private FileOutputStream fosFileOutputStream;

	// ��ʼ������
	public void init() {
		System.out.println("ResourceBean:========��ʼ��");
		// ������Դ,�ڴ�ֻ����ʾ
		System.out.println("ResourceBean:========������Դ��ִ��һЩԤ����");
		try {
			this.fosFileOutputStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ������Դ����
	public void destroy() {
		System.out.println("ResourceBean:========����");
		// �ͷ���Դ
		System.out.println("ResourceBean:========�ͷ���Դ��ִ��һЩ�������");
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
