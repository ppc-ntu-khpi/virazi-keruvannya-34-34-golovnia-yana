package domain;

import java.util.List;
import java.util.ArrayList;

/**
 * Class with calculations
 * 
 * @author Asus
 *
 */
public class Exercise {
	/**
	 * Method that returns an array of prime numbers
	 * 
	 * @param lowerLimit
	 * @param upperLimit
	 * @return primeNumbers
	 */
	public static List<Integer> Calculate(int lowerLimit, int upperLimit) {
		/**
		 * we create a collection for storing primes
		 */
		List<Integer> primeNumbers = new ArrayList<Integer>();
		rangeLoop: for (int i = lowerLimit; i < upperLimit; i++) {
			if (i == 0 || i == 1)
				continue;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					continue rangeLoop;
			}
			primeNumbers.add(i);
		}
		/**
		 * return the collection
		 */
		return primeNumbers;
	}
}
