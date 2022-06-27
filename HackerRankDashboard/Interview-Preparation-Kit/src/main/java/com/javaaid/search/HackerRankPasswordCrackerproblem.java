package com.javaaid.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

//https://www.hackerrank.com/challenges/password-cracker/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

public class HackerRankPasswordCrackerproblem {
	    private static Stack<String> passwords;
	    private static Set<String> badLoginAttempt;

	    private static boolean calc(String[] pass, String loginAttempt) {
	        if(badLoginAttempt.contains(loginAttempt)) {
	            return false;
	        }
	        if(loginAttempt.length() == 0) {
	            return true;
	        }
	        for(String p : pass) {
	            if(loginAttempt.startsWith(p) && calc(pass, loginAttempt.substring(p.length()))) {
	                passwords.push(p);
	                return true;
	            }
	        }
	        badLoginAttempt.add(loginAttempt);
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int i = 0; i < t; i++) {
	            int n = in.nextInt();
	            String[] pass = new String[n];
	            for(int j = 0; j < n; j++) {
	                pass[j] = in.next();
	            }
	            String loginnAttempt = in.next();
	            passwords = new Stack<>();
	            badLoginAttempt = new HashSet<>();
	            boolean result = calc(pass, loginnAttempt);
	            if(result) {
	                while (!passwords.isEmpty()) {
	                    System.out.print(passwords.pop() + " ");
	                }
	                System.out.println();
	            } else {
	                System.out.println("WRONG PASSWORD");
	            }
	        }
	    }
}
