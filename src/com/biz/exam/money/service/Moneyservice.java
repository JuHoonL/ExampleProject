package com.biz.exam.money.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Moneyservice {

	int int50K;
	
	String[] paperName;
	
	Map<String,Integer> mList;
	
	public Moneyservice() {
		mList = new HashMap();
		int50K = 50000;
		paperName = new String[]{"1. 5만원권","2. 1만원권","3. 5천원권","4. 1천원권","5. 5백원권","6. 1백원권","7. 5십원권","8. 1십원권"}; 
	}
	
	public void viewPaper() {
		
		//HashMap한 리스트를 TreeMap으로 정렬
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>(mList);
		//Map에서 key 부분만 분리해 내기(name부분만 추출)
		Iterator<String> keys = tm.keySet().iterator();		//오름차순정렬
//		Iterator<String> keys = tm.descendingKeySet().iterator(); //내림차순정렬
		while(keys.hasNext()) {
			String name = keys.next();
			System.out.println(name + " : " + mList.get(name));
			
		}
	}
	
	
	public void writerPaper(String File) {
		PrintWriter pw;
		try {
			pw=new PrintWriter(File);
			
			for(String name : mList.keySet()) {
				pw.println(name + " : " + mList.get(name));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void viewPaper2() {
		for(String name : mList.keySet()) {
			System.out.println(name + " : " + mList.get(name));
		}
	}
	
	
	public void makePaperint(int nMoney) {
		int iSw = 1;
		
		while(true) {
			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			if(nMoney < 10) break;
			if(iSw == 1) {
				int50K = (int50K / 5);	
			} else {
				int50K = (int50K / 2);
			}
			iSw *= -1; 		//c언어에서는 boolean이 없기 때문에 스위치변수로서 이와같이 사용
		}
	}
	
	
	public void makePaperBoolean(int nMoney) {
		
		Boolean sw = true;
		for(String name : paperName) {
			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			mList.put(name, nCount);
			
			if(sw) {
				int50K = (int50K / 5);	
			} else {
				int50K = (int50K / 2);
			}
			sw = !sw;
		}
	}
	
	
	public void makePaper(int nMoney) {

		int[] intCM = new int[8];
		
		intCM[0] = (nMoney / int50K);
		nMoney = nMoney - (intCM[0] * int50K); //5만원
		
		int50K = int50K / 5;
		intCM[1] = (nMoney / int50K);
		nMoney = nMoney - (intCM[1] * int50K); //1만원
		
		int50K = int50K / 2;
		intCM[2] = (nMoney / int50K);
		nMoney = nMoney - (intCM[2] * int50K); //5천원
		
		int50K = int50K / 5;
		intCM[3] = (nMoney / int50K);
		nMoney = nMoney - (intCM[3] * int50K); //1천원
		
		int50K = int50K / 2;
		intCM[4] = (nMoney / int50K);
		nMoney = nMoney - (intCM[4] * int50K); //5백원
		
		int50K = int50K / 5;
		intCM[5] = (nMoney / int50K);
		nMoney = nMoney - (intCM[5] * int50K); //1백원
		
		int50K = int50K / 2;
		intCM[6] = (nMoney / int50K);
		nMoney = nMoney - (intCM[6] * int50K); //5십원
		
		int50K = int50K / 5;
		intCM[7] = (nMoney / int50K);
		nMoney = nMoney - (intCM[7] * int50K); //1십원
		
		for(int i : intCM) {
			System.out.println(i);
		}
	}
	
	
}
