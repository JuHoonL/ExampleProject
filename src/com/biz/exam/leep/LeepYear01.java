package com.biz.exam.leep;

import java.util.Scanner;

public class LeepYear01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int intYear = 2018;
		boolean leepOk = false;
//		윤년인지 검사
		if(intYear % 4 == 0) {
			leepOk = true;
			if(intYear % 100 == 0) {
				leepOk = false;
				if(intYear % 400 == 0) {
					leepOk = true;
				}
			}
		}
		
		if(leepOk == true) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		
		
	}

}
