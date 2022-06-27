package com.javaaid.hackerrank.solutions.languages.java.strings;
 

public class AddNumbersFromaSentence {
	public static void main(String[] args) {
		String s="Sachin scored 104 runs in 40 balls in 50 overs match.";	
		System.out.println(s);
			String[] str = s.split("[^0-9]");
			System.out.println(str.toString());
			int length = str.length;
			int [] nums = new int [length];
			for(int i=0; i<length ; i++) {
				if(str[i].trim() != "") {
				nums[i] = Integer.parseInt(str[i].trim());
				}
			}
			 
			int sum = 0;
			for(int i : nums) {
				sum += i;
			}
			System.out.println("Total Sum:"+sum);
			 
		 
	}
}
