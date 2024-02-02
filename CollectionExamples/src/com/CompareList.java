package com;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

	public static List<Integer> compareList(List<Integer> a,List<Integer> b){
		
		List<Integer> res=new ArrayList();
		int ap=0;
		int bp=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)>b.get(i)) {
				ap=ap+1;
			}
			else if(a.get(i)<b.get(i)){
				bp=bp+1;
			}
		}
		res.add(ap);
		res.add(bp);
		return res;
		
	}
}
