/* PROGRAM WHICH CHECKS WHETHER A BINARY - REPRESENTATION OF A NUMBER IS
   PALINDROME OR NOT?
 */

package Interview_Questions;

import java.util.Scanner;

public class Binary_Representation_Palindrome {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		int Number = Sc.nextInt();
		
		//CORE - LOGIC: - 
		String S = Integer.toBinaryString(Number);
		
		String Temp = "";
		
		for(int i = S.length() - 1 ; i >= 0 ; i--) {
			Temp = Temp + S.charAt(i);
		}
		
		if(S.equals(Temp)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		Sc.close();
	}

}
