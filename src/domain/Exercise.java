package domain;
/**
 * Class with calculations
 * @author Asus
 *
 */

public class Exercise {
	/**
	 * @param lowerLimit
	 * @param upperLimit
	 * @return range
	 */
	public static int[] Calculate(int lowerLimit, int upperLimit) {
		/**
		 * create an array
		 */
		int[] range = new int[upperLimit - lowerLimit];
		/**
		 * variable stores index in array (0 to array size)
		 */
		int index = 0;
		for (int i = lowerLimit; i < upperLimit; i++) {
			range[index] = i;
			index++; 
		}
		return range;
	}
}
