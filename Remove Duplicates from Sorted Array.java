package leetcode;
/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 
Do not allocate extra space for another array, you must do this in place with constant memory.
 
For example,
Given input array A = [1,1,2],
 
Your function should return length = 2, and A is now [1,2].
*/
public class Solution {
	
	public static int removeDuplicates(int[] A) {// better 
        int start = 0;
        //int length = A.length;
        if(A.length==0 || A.length==1) return A.length;
        for(int i = 1 ; i < A.length; i++){
        	if(A[start] != A[i]){// find the first different element and append at the last
        		start++;
        		A[start] =  A[i];
        		
        	}
        }
      
        return start+1;
    }

	 public static void main(String[] args){
		 int []Array = new int[]{1,1,2,2,3};
		 int len = removeDuplicates(Array);
		 for (int i = 0; i < Array.length; i++) {
		      System.out.printf("Array%d: %d \n", i, Array[i]);
		    }
		    System.out.printf("length:%d", len);
		 
	 }
	 

	
}
