package com.biz.exam;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeepYear06 {

	/*임진왜란은 1592년에 발생했다.
	 * 1592년 부터 2018년까지 윤년인 해를찾아서 윤년들.txt 파일로 저장
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> yList = new ArrayList();
		String yWrite = "src/com/biz/exam/윤년들.txt";
		
		for(int i = 1592 ; i <= 2018 ; i ++) {
			Boolean b = false;
			if(i % 4 == 0) {
				b = true;
				if(i % 100 == 0) {
					b = false;
					if(i % 400 == 0) {
						b = true;
					}
				}
			}
			if(b) {
//				System.out.println(i + "는 윤년");
				yList.add(i);
			} else {
//				System.out.println(i + "는 평년");
			}
		}
		
		
		PrintWriter pw ;
		
		try {
			pw = new PrintWriter(yWrite);
			
			for(Integer i : yList) {
				pw.println(i);
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
