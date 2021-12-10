package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Phone> pList = new ArrayList<>(); 
		String line;
		
		while(true) {
			line = br.readLine();		
			if(line == null) {
				break;
			}
			personAdd(line, pList);
			
		}
		
		for(Phone p : pList) {
			p.showInfo();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터를 입력하세요");
		line = sc.nextLine();
		personAdd(line, pList);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Phone p : pList) {
			bw.write(p.getName());
			bw.write(","+p.getHp());
			bw.write(","+p.getCompany());
			bw.newLine();
		}
		
		br.close();
		bw.close();
		sc.close();
		
		
	}
	
	
	public static void personAdd(String line, List<Phone> pList) {
		String [] pArr= line.split(",");
		String name = pArr[0];
		String hp = pArr[1];
		String company = pArr[2];
		
		Phone p = new Phone(name, hp, company);
		pList.add(p);
	}
	

}
