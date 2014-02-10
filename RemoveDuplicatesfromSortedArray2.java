package leetcode;
/*
 Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
 
 */

public class RemoveDuplicatesfromSortedArray2 {

	public static int removeDuplicates(int[] A) {// better 
        int start = 0;
        int count = 1;//initial count = 1 to count each element
        //int length = A.length;
        if(A.length==0 || A.length==1) return A.length;
        for(int i = 1 ; i < A.length; i++){
        	if(A[start] != A[i]){// find the first different element and append at the last
        			start++;
            		A[start] =  A[i];
            		count = 1;
        	}else {
        		if(count<2){//the first same element, can append at after
        			start++;
            		A[start] = A[i];
            		count++;  // count =2 then already has 2 same element
        		}
        		
        	}
        }
      
        return start+1;
    }

	 public static void main(String[] args){
		 int []Array = new int[]{1,1,2,2,2,3,4};
		 int len = removeDuplicates(Array);
		 for (int i = 0; i < Array.length; i++) {
		      System.out.printf("Array%d: %d \n", i, Array[i]);
		    }
		    System.out.printf("length:%d", len);
		    
		 
	 }
}
