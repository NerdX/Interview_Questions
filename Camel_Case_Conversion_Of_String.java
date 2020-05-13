/* PROGRAM WHICH CONVERTS A GIVEN STRING IN CAMEL-CASE FASHION*/

package Interview_Questions;

import java.util.Scanner;
public class Camel_Case_Conversion_Of_String{

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENTER A STRING: - ");
		String S1 = Sc.nextLine();
		String S[] = S1.split(" ");
		int k = 0;
		
		
		//WHAT IS GIVEN STRING IS EMPTY?
		if(S1.equals("")) {
			System.out.println("SORRY! YOUR STRING IS EMPTY:");
		}
		
		for(int i = 0 ; i < S.length ; i++) {
			
			String Temp = S[i];
			
			Temp = Temp.toUpperCase();
			
			if(S[i] == Temp) {
				
				k = k + 1;
			}
		}
		
		//WHAT IS GIVEN STRING IS OUTPUT STRING?
		if(k == S.length) {
			
			System.out.println(S1);
		}
		
		//CORE - LOGIC : - 
		else {
			
			for(int i = 0 ; i < S.length ; i++) {
				
				char c = S[i].charAt(0);
				
				c = Character.toUpperCase(c);
				
				String Temp = S[i].substring(1);
				
				Temp = c + Temp;
				
				S[i] = Temp;
			}
			
			String S2 = "";
			
			for(int i = 0 ; i < S.length ; i++) {

				S2 = S2 + S[i] + " ";
			}
			System.out.println(S2);
		}
		Sc.close();

	}

}
