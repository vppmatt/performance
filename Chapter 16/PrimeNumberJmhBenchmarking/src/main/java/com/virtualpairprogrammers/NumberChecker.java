package com.virtualpairprogrammers;

public class NumberChecker {

	public Boolean isPrimeOriginal(Integer testNumber) {
		for (Integer i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}

	public Boolean isPrimeWithPrimatives(int testNumber) {
		for (int i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}

	public Boolean isPrimeWithSquareRoot(Integer testNumber) {
		Double squareRoot = Math.sqrt(testNumber);
		Integer maxToCheck = squareRoot.intValue();
		for (Integer i = 2; i <= maxToCheck; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	public Boolean isPrimeWithSquareRootAndPrimatvies(int testNumber) {
		int maxToCheck = (int)Math.sqrt(testNumber);
		for (int i = 2; i <= maxToCheck; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
}
