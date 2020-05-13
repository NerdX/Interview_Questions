package Interview_Questions;

import java.util.HashSet;
import java.util.Set;

public class Zero_Sum_SubArray {

	public static void main(String[] args) {
		
		int Arr[] = {2, 1, 3, 4, -2};
		
		//CORE - LOGIC: - 
		Set<Integer> S1 = new HashSet<Integer>();
		
		int Sum = 0;
		boolean Exist = false;
		
		for(int i = 0 ; i < Arr.length ; i++) {
			
			S1.add(Sum);
			
			Sum = Sum + Arr[i];
			
			//CORE - LINE: - 
			if(S1.contains(Sum)) {
				
				Exist = true;
				
				break;
			}
		}
		
		if(Exist == true) {
			
			System.out.println("SUBARRAY WITH SUM ZERO(0) IS EXISTED");
		}
		
		else {
			
			System.out.println("NO SUCH SUBARRAY IS EXISTED");
		}

	}

}
