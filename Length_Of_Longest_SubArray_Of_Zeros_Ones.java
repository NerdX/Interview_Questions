/* PROGRAM WHICH FINDS THE LENGTH OF LONGEST SUBARRAY OF 'ZEROS(0)' AND 'ONES(1)'
	IN GIVEN ARRAY.
	THE INPUT ARRAY CONTAINS ONLY ZEROS(0) AND ONES(1).
 */

package Interview_Questions;

import java.util.Scanner;

public class Length_Of_Longest_SubArray_Of_Zeros_Ones {
	
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		
		//ENTER THE LENGTH OF AN ARRAY: - 
		System.out.println("ENTER THE LENGTH OF AN ARRAY:");
		int N = Sc.nextInt();
		
		int Arr[] = new int[N];
		//ENTER THE ELEMENTS: - 
		System.out.println("ENTER THE ELEMENTS: - ");
		for(int i = 0 ; i < N ; i++) {
			
			Arr[i] = Sc.nextInt();
			
		}
		
		//CORE - LOGIC: - 
		int Length_Ones = 0;
		int Length_Zeros = 0;
		int Temp_Ones = 0;
		int Temp_Zeros = 0;
		
		for(int i = 0 ; i < N ; i++) {
			
			if(Arr[i] == 1) {
				
				Temp_Ones++;
				
				if(Length_Ones < Temp_Ones) {
					
					Length_Ones = Temp_Ones;
					
				}
				
			}
			
			else {
				
				Temp_Ones = 0;
			}
			
			if(Arr[i] == 0) {
				
				Temp_Zeros++;
				
				if(Length_Zeros < Temp_Zeros) {
					
					Length_Zeros = Temp_Zeros;
					
				}
				
			}
			else {
				
				Temp_Zeros = 0;
				
			}
			
		}
		
		System.out.println("THE LENGTH OF LONGEST SUBARRAY OF '1s' IS: -  "+Length_Ones);
		
		System.out.println("THE LENGTH OF LONGEST SUBARRAY OF '0s' IS: - "+Length_Zeros);
		
		Sc.close();
	}

}
