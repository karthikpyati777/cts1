package com;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge3 {
	
	public static int getRandomvalues(int min,int max) {
		return ThreadLocalRandom.current().nextInt(min,max+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Random r=new Random();
//		int count=0;
//		
//		for(int i=0;i<5;i++) {
//		int x=r.nextInt(200);
//		System.out.println(x);
//		if(x>100 && x<200) {
//			count++;
//			
//		}
//		if(count>20)
//
//			break;
//		
//	}
	
		int min=1,max=100;
		System.out.println("tandom values in between "+min+" and "+max+":"+getRandomvalues(min, max));
}
}