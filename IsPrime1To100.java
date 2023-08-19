package com.agg;

import java.util.stream.IntStream;

public class IsPrime1To100 {
	//control+space+enter
	public static void main(String[] args) {
		IntStream.rangeClosed(1,100).filter(n->isPrime(n)).forEach(System.out::println);
	}
	
	public static boolean isPrime(int n) {
		if(n==1 || n==2) {
			return true;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
