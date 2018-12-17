package com.biz.exam.method;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeepMethod {

	List<String> yList;
	
	
	public boolean isLeepYear(int intYear) {

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
		return leepOk;
	}
	
	
	public void readF(String strR) {
		yList = new ArrayList();
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
	}
	
/*	public b intValue() {
		for(String s : yList) {
			int ints = Integer.valueOf(s);
			boolean leepOk = false;
	//		윤년인지 검사
			if(ints % 4 == 0) {
				leepOk = true;
				if(ints % 100 == 0) {
					leepOk = false;
					if(ints % 400 == 0) {
						leepOk = true;
					}
				}
			}
			return leepOk;
	}*/
}
