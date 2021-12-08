package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

	
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\\\javaStudy\\\\file\\\\byteimg.jpg");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			int data = in.read(buff);
			if(data == -1) {
				System.out.println("복사완료 "+data);
				break;
			}
			out.write(buff);
		}
		
		in.close();
		out.close();
		
		
//		System.out.println("복사시작");
//		while(true) {
//			int data = in.read(); // 읽을 게 없으면 -1 반환
//			if(data == -1) {
//				System.out.println("복사완료 "+data);
//				break;
//			}
//			out.write(data);
//		}
		

		
		
	}

}
