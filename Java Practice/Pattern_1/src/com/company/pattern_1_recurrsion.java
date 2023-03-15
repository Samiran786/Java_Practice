// *
// **
// ***
// ****
// *****
package com.company;

public class pattern_1_recurrsion {
	public void Pat_1(int n) {
		if (n<0) {
			System.out.print("");
		}else {
			Pat_1(n-1);
			for(int j=n;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		pattern_1_recurrsion p = new pattern_1_recurrsion();
		p.Pat_1(5);
	}
	

}
