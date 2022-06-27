package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.HashMap;
import java.util.Scanner;

//HackerRank The Power Sum problem solution we need to find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique, natural numbers.
//https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

public class powerSum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();

		System.out.println("Count is" + powerSumcal(num, power));
	}

	static int powerSumcal(int num, int power) {
		int count = 0;
		HashMap<Integer, Integer> powerSums = new HashMap<>();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = (int) Math.pow(i, power);
			powerSums.put(i, sum);
		}
		return countPowerSum(num, powerSums, 1, 0);
	}

	static int countPowerSum(int num, HashMap<Integer, Integer> powerSums, int iteration, int carry) {
		int count = 0;
		int sum = carry + powerSums.get(iteration);
		if (sum == num)
			return 1;
		else if (sum > num)
			return 0;

		count  += countPowerSum(num, powerSums, iteration + 1, carry);
		System.out.println("Firstloop"+count);
		count  += countPowerSum(num, powerSums, iteration + 1, sum);
		System.out.println("Secondloop"+count);
		return count;
	}

}
