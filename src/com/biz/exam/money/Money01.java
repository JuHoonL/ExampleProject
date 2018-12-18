package com.biz.exam.money;

import com.biz.exam.money.service.Moneyservice;

public class Money01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nMoney = 5509850;
		
		String File = "src/com/biz/exam/money/급여명세.txt";
		
//		우리나라의 통화는 5만원권~ 10원권까지 있다. nMoney를 5만원권~ 10원권까지 최소 수량으로 지급하고자 할 때
//		각 통화 단위별로 매수를 계산하여 급여명세.txt에 저장하라
		
		Moneyservice ms = new Moneyservice();
		
//		ms.makePaper(nMoney);
		ms.makePaperBoolean(nMoney);
		ms.viewPaper();
//		ms.writerPaper(File);
	}

}
