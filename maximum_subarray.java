public class Solution {

   public int maxSubArray(int[] A) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       int max_ending_here = A[0];

       int max_so_far = A[0];

       for (int i = 1; i < A.length; i++) {

           if (max_ending_here < 0) {

               max_ending_here = A[i];

           }

           else {

               max_ending_here += A[i];

           }

           if (max_ending_here > max_so_far) {

               max_so_far = max_ending_here;

           }

       }

       return max_so_far;

   }

}


