package com.biz.exam;

import com.biz.exam.method.LeepMethod;

public class LeepYear02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeepMethod lm = new LeepMethod();
		
		for(int i = 1980 ; i < 2000 ; i ++) {
			boolean b = lm.isLeepYear(i);
			
			if(b) {
				System.out.println(i + "는 윤년");
			} else {
//				System.out.println(i + "는 평년");
			}
		}
	}

}
