// *****
// ****
// ***
// **
// *


package com.company;

public class pattern_2 {
	public void Pat_2(int n) {
		for(int i=0; i<n; i++) {
			for(int j = n; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern_2 p = new pattern_2();
		p.Pat_2(5);
	}

}
