package com.biz.exam.leep;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.method.LeepMethod;

public class LeepYear07 {

//	static 변수 : static main()에서 사용할 변수에는 메서드 선언과 마찬가지로 static으로 선언해주어야 한다.
	static List<String> yearList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1592년~2018년까지 윤년인 해를 찾아보자
		
		LeepMethod lm = new LeepMethod();
		yearList = new ArrayList();
		
		for(int i = 1592 ; i <= 2018 ; i ++) {
//			Boolean b = lm.isLeepYear(i);
			if(lm.isLeepYear(i)) {
				System.out.println(i + "년은 윤년");
//				파일에 저장을 하기 위해서 PrintWriter나 FileWriter를 사용해서 
//				직접파일에 저장할 수도 있지만 파일이 열린상태(쓰기준비)로 있는 시간은 최소한으로 만들어 주는것이 좋다.
//				직접파일에 저장하지 않고 리스트를 하나 만들어서 리스트에 저장한 후 리스트를 한꺼번에 파일에 저장하도록 하는것이 좋다.
				yearList.add("" + i);
			}
		}
		writeFile();
	}
	
	public static void writeFile() {
	
		String wFile = "src/com/biz/exam/윤년드을.txt";
		
		PrintWriter pw ;
			
			try {
				pw = new PrintWriter(wFile);
				
				for(String i : yearList) {
					pw.println(i + "년");
				}
				pw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
