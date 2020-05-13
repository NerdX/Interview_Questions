/* GREAT - PROBLEM :) */

package Interview_Questions;

public class Product_Of_Array_Except_Self {

	public static void main(String[] args) {
		
		int Arr[] = {1 , 2 , 3 , 4};
		
		int Ans[] = new int[Arr.length];
		
		
		/*
		 * USING '/'(DIVISION) OPERATOR WITH TIME_OMPLEXITY(O(N)).
		for(int  i = 0 ; i < Arr.length ; i++) {
			Product = Product * Arr[i];
		}
		
		for(int  i = 0 ; i < Arr.length ; i++) {
			Ans[i] = (Product / Arr[i]);
		}
		
		for(int i = 0 ; i < Ans.length ; i++) {
			System.out.println(Ans[i]);
		}
		*/
		
		
		//CORE - LOGIC : - WITHOUT USING '/'(DIVISION) - OPERATOR.
		//WITH EXTRA SPACE : - LEFT + RIGHT_PRODUCT ARRAYS.
		
//		int Left_Product[] = new int [Arr.length];
//		int Right_Product[] = new int[Arr.length];
//		
//		Left_Product[0] = 1;
//		Right_Product[Arr.length - 1] = 1;
//		
//		
//		for(int  i = 1 ; i < Arr.length ; i++) {
//			
//			Left_Product[i] = Arr[i - 1] * Left_Product[i - 1];
//			
//		}
//		
//		for(int  i = Arr.length - 2 ; i >= 0 ; i--) {
//			
//			Right_Product[i] = Arr[i + 1] * Right_Product[i + 1];
//			
//		}
//		
//		for(int  i = 0 ; i < Ans.length ; i++) {
//			
//			Ans[i] = Left_Product[i] * Right_Product[i];
//			System.out.print(Ans[i] + " ");
//		}
//		
		
		
		  //CORE - LOGIC : - 
		  //WITHOUT EXTRA SPACE WITH OPTIMAL - TIME_COMPLEXITY: - 
		 
		 Ans[0] = 1;
		 
		 for(int  i = 1 ; i < Ans.length ; i++){
		 
		 Ans[i] = Ans[i - 1] * Arr[i - 1];
		 
		 }
		 
		 int Temp = 1;
		 
		 for(int i = Ans.length - 1 ; i >= 0 ; i--){
		 
		 Ans[i] = Ans[i] * Temp;
		 Temp = Temp * Arr[i];
		 
		 }
		 
			for(int  i = 0 ; i < Ans.length ; i++) {
				
				System.out.print(Ans[i] + " ");
			}

	}

}
