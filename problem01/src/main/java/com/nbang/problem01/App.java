/**
 * 
 */
package com.nbang.problem01;

/**
 * @author bangndd
 * Problem: Dùng các chữ số 1, 2, 3, 4, 5, 6, 7, 8, 9, mỗi chữ số đúng 1 lần. Hãy lập một số có 9 chữ số abcdefghk sao cho ab chia hết cho 2; abc chia hết cho 3; abcd chia hết cho 4; abcde chia hết cho 5, …, abcdefgh chia hết cho 8 và chính số đó chia hết cho 9. 
 * http://vnexpress.net/tin-tuc/giao-duc/bai-toan-tim-so-3092510.html
 *
 */
public class App {

	private static final int BASE = 10;
	private static final char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	private static boolean[] check = new boolean[BASE];

	private static void recursive(int base, long index, long value) {
		if (index < base - 1) {
			value *= base;
			index++;
			for (int i = 0; i < base; i++) {
				if (!check[i] && (value + i) % index == 0) {
					check[i] = true;
					recursive(base, index, value + i);
					check[i] = false;
				}
			}
		} else {
			print(value, base);
			System.out.println();
		}
	}

	private static void print(long value, int base) {
		if (value > base) {
			print(value / base, base);
			print(value % base, base);
		} else {
			System.out.print(chars[(int) value]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		recursive(BASE, 0, 0);

	}

}
