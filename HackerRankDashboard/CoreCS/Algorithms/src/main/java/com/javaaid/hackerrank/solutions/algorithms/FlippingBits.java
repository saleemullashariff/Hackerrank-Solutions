package com.javaaid.hackerrank.solutions.algorithms;

import java.util.Scanner;

public class FlippingBits {
//https://www.hackerrank.com/challenges/flipping-bits/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Masking digits
        long max = Integer.MAX_VALUE;
        System.err.println(max);
        max = max * 2 + 1;
        for(int i = 0; i < n; i++) {
            System.out.println("After flipping bits: "+(~in.nextLong() & max));
        }
    }

}
