import java.util.Arrays;
/* Given an array [1,0,2,0,3,0,0,4,5,6,7,0,0,0], 
	 			output:		[1,2,3,4,5,6,7,0,0,0,0,0,0,0] */

public class arrayPuzzle {
	static void swap(int ar[], int i, int j){
		int tmp = ar[i];
		ar[i] = ar[j];
		ar[j] = tmp;				
	}
	
	public static void main(String argv[]){
		int ar[] = {1,0,2,0,3,0,0,4,5,6,7,0,0,0 };

	  int storeIndex = ar.length - 1;
	  for(int i = ar.length - 1; i >= 0;  i--){
	  	if(ar[i] == 0){	
			  swap(ar, i, storeIndex);
				storeIndex--;							
	 		}
		}
		Arrays.sort(ar, 0, storeIndex);	
		System.out.println(Arrays.toString(ar));
	}
}
