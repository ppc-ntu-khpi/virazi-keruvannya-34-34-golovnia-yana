package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
    	int lowerLimit = 0;
		int upperLimit = 4;
		
		int[] range = Exercise.Calculate(lowerLimit, upperLimit);
		
		System.out.println("Діапазон значень від " + lowerLimit + " до (не включно) " + upperLimit + ":");
		for (int i = 0; i < range.length; i++) {
			System.out.println("["+i+"] = " + range[i]);
		}
    }
}
