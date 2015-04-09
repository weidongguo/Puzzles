// dot product: a1*b1 + a2*b2 + a3*b3 + ... + an*bn
// dimension: 1 billion
// sparse: mostly zeros. ~1 million non zero entries in each vector

// 1) design an efficient representation for sparse vectors
// 2) implement the dot product between two of your sparse vectors

class pair{
    int index;
    int val
}

public class vector_{
   	//java-like pseudocode 
		public static int DotProduct(Vector<pair> A, Vector<pair> B){
    long sum = 0;
   /*
   for(int j =0; size of B; j++) {
    for( int i = 0; sizeof(A); i++){
        if( A[i].index == B[j].index )
            sum += mult(A[i].val, B[j].val);
            
    }
   }//n^2 
   */
  
	/* example walk through 
   assuming A and B are sorted ***
   
   i from 0 to 6
   i = 0, 1, 2
                              2 != 8
   [2 8 9] * [8 11 12]          8==8 match
   p= 0, 1, 2        k=0, 1        9 != 11            now p+1 = 3, so stop
   */ 
   
   int k =0; int p = 0;
   for( int i = 0; 2*size of A; i++){ // 2*size of A is the max, most of the time, it won't loop that many times
        if(A[k].index > B[p].index)
            p++;
        else if( A[k].index < B[p].index)
            k++;
        else{ //index matches
            sum += mult(A[k].value, B[p].value)
            p++; k++;   
         }
        if( p + 1 == size of A || k + 1 == size of B )
            break;
   }//O(n);
     
    return sum;
   }
}
