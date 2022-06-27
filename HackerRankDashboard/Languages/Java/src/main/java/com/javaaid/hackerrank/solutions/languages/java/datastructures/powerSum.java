package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.Scanner;

//HackerRank The Power Sum problem solution we need to find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique, natural numbers.
//https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	
public class powerSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(countSumPower(num,power,1,0,0));
    }
    
    public static int countSumPower(int num, int power, int iteration, int carry, int count){
        int sum = carry + (int) Math.pow(iteration,power);
        if (sum == num)
            return 1;
        else if (sum > num)
            return 0;
        
        count += countSumPower(num, power, iteration+1, sum, 0); // choose curr
        count += countSumPower(num, power, iteration+1, carry, 0); // dont choose curr
        
        return count;
    }
}
