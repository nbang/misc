/**
 * 
 */
package com.nbang.lcm;

import java.math.BigInteger;

/**
 * @author bangndd
 *
 */
public class App {

	/**
	 * Calculate lcm from 5 -> 2015
	 */
	public static void main(String[] args) {
		/**
		 * @param args
		 */

		BigInteger lcm = new BigInteger("5");

		for (int i = 5; i < 2015; i++) {
			BigInteger next = new BigInteger(String.valueOf(i + 1));
			BigInteger gcd = lcm.gcd(next);
			lcm = lcm.multiply(next).divide(gcd);
		}

		System.out.println(lcm.toString());

	}

}
