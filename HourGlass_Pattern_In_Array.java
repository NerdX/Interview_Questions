/* HOURGLASS - PATTERN IN ARRAYS */
/* NOTE : - IN CORE - LOGIC ALWAYS LOOP THROUGH (ROWS & COLS - 2) */
package Interview_Questions;

import java.util.Scanner;

public class HourGlass_Pattern_In_Array {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		int Arr[][] = new int[6][6];
		
		//ENTER THE ELEMENTS: - 
		System.out.println("ENTER THE ELEMENTS");
		
		for(int i = 0 ; i < 6 ; i++) {
			
		for(int j = 0 ; j < 6 ; j++) {
				
		Arr[i][j] = Sc.nextInt();
				
			}
		}
		
		//CORE - LOGIC : - 
		//FORMULA : - ALWAYS LOOP THROUGH (ROWS & COLS - 2).
		int Max_Sum = Integer.MIN_VALUE;
		
        for(int row = 0 ; row < 4 ; row++){
        	
        for(int col = 0 ; col < 4 ; col++){
                	
        int Current_Sum = (Arr[row][col] + Arr[row][col + 1] + Arr[row][col + 2]) + (Arr[row + 1][col + 1]) + (Arr[row + 2][col] + Arr[row + 2][col + 1] + Arr[row + 2][col + 2]);
            
        if(Current_Sum > Max_Sum){
                	
              Max_Sum = Current_Sum;
         }	
                    
       }
   }
		
		System.out.println(Max_Sum);
		Sc.close();

	}

}
//FORMULA : - ALWAYS LOOP THROUGH (ROWS & COLS - 2).