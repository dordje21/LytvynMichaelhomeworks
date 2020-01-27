package com.gmail.lesson9;

public class Fibo {
	
	public static int fibonum(int n) {
		int [] cache = new int[10000];
		
	    if (cache[n] == 0) {
	        if (n == 1 || n == 2) {
	            cache[n] = 1;
	        } else {
	            cache[n] = fibonum(n - 1) + fibonum(n - 2);
	        }
	        System.out.println(n);
	    }

	    return cache[n];
	}
}
