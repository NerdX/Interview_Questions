/* PROGRAM WHICH KEEPS ALL THE NAGATIVE ELEMENTS ON THE LEFT-SIDE AND POSITIVE
   NUMBERS ON THE RIGHT-SIDE IN GIEVN ARRAY WITH TIME-COMPLEXITY OF(O(NLogN)).
 */

package Interview_Questions;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Left_Nagative_Right_Positive_Array {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		//ENTER THE LENGTH OF AN ARRAY: - 
		System.out.println("ENTER THE LENGTH OF AN ARRAY:");
		int N = Sc.nextInt();
		
		int Array[] = new int[N];
		
		//ENTER THE ELEMENTS: - 
		System.out.println("ENTER THE ELEMENTS:");
		for(int i = 0 ; i < N ; i++) {
			Array[i] = Sc.nextInt();
		}
		
		//CORE - LOGIC: - 
		Set<Integer> L1 = new LinkedHashSet<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			if(Array[i] < 0) {
				L1.add(Array[i]);
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			L1.add(Array[i]);
		}
		
		System.out.println(L1);
		Sc.close();

	}

}
