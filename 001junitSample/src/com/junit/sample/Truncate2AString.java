package com.junit.sample;

public class Truncate2AString {
/*
 * this method will truncate AA if present in the 
 * 1st two positions
 */
	public String truncateAInFirstTwoPosition(String str)
	{//StringBuffer sb=new StringBuffer(str);
		String newStr="";
		for(int i=0;i<2;i++)
		{
			if(!(str.charAt(i)=='A'))
				newStr=newStr+str.charAt(i);
		}
		newStr=newStr+str.substring(2);
		
	
//		String f=str.substring(0, 2);
//		String end=str.substring(2);
//		newStr=f.re
		
		
		return newStr;//sb.toString();
	}
}
