public class Solution {

   public int searchInsert(int[] A, int target) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       int len = A.length;

       if (len == 0) {

           return 0;

       }

       else {

           for (int i = 0; i < len; i++) {

               if (A[i] == target) {

                   return i;

               }

               else {

                   if (A[i] > target) {

                       return i;

                   }

               }

           }

       }

       return len;

   }

}


