package com.sherwin;

import java.lang.reflect.Array;
//Max int in java is 10 digits
public class Fibonacci {
	public static void main(String[] args){
		int[] fibonacciList = new int[100];
		Array.setInt(fibonacciList, 0, 1);
		Array.setInt(fibonacciList, 1, 1);
		int sum = fibonacciList[0] + fibonacciList[1];
		System.out.println(fibonacciList[0]);
		System.out.println(fibonacciList[1]);
		for (int i=2; i<10; i++){
			Array.setInt(fibonacciList, i, sum);
			sum += fibonacciList[i-1];
			System.out.println(fibonacciList[i]);
		}
	}
}
