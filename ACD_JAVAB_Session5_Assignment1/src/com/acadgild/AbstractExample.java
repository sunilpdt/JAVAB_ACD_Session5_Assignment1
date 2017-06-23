package com.acadgild;

public class AbstractExample {

	public static void main(String[] args) {
		Bank b1=new HDFCBank();
		Bank b2=new SBIBank();
		System.out.println("HDFC rate of Interest is :"+b1.rateOfInterest());
		System.out.println("SBI rate of Interest is :"+b2.rateOfInterest());
	}

}
