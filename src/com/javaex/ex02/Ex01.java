package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\\\javaStudy\\\\file\\\\byteimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사시작");
		while(true) {
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사완료 "+data);
				break;
			}
			bout.write(data);
		}
		
		
		//in.close();
		bin.close();
		//out.close();
		bout.close();
	}

}
