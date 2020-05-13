/* PROGRAM WHICH SORT THE ELEMENNTS IN SUCH A WAY THAT THE FIRST PART OF AN ARRAY
   CONTAINS THE ODD - NUMBERS IN DESCENDING - ORDER AND REST OF THE PORTION
   CONTAINS THE EVEN - NUMBERS IN ASCENDING - ORDER. 
 */

package Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Left_Odds_Right_Evens_Sorting {

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
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		ArrayList<Integer> L2 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			if(Math.abs(Array[i]) % 2 == 1) {
				L1.add(Array[i]);
			}
			if(Math.abs(Array[i]) % 2 == 0) {
				L2.add(Array[i]);
			}
		}
		
		Collections.sort(L1,Collections.reverseOrder());
		Collections.sort(L2);
		
		L1.addAll(L2);
		System.out.println(L1);
		Sc.close();

	}

}
