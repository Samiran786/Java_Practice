// *
// **
// ***
// ****
// *****

package com.company;

public class pattern_1 {
	public void Pat_1(int n){
		for(int i =0; i<n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main( String[] args) {
		pattern_1 p = new pattern_1();
		p.Pat_1(5);
	}

}
