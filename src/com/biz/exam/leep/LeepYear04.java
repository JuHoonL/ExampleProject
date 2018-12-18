package com.biz.exam.leep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeepYear04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String strR = "src/com/biz/exam/윤년.txt";
		List<String> yList = new ArrayList();
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strR);
			br = new BufferedReader(fr);
			
			while(true) {
				String strRead = br.readLine();
				if(strRead == null) break;
				String[] splitR = strRead.split(" ");
				yList.add(splitR[0]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String s : yList) {
			int ints = Integer.valueOf(s);
			boolean leepOk = false;
			if(ints % 4 == 0) {
				leepOk = true;
				if(ints % 100 == 0) {
					leepOk = false;
					if(ints % 400 == 0) {
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

}
