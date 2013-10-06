public class Solution {
    public int removeElement(int[] A, int elem) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
       ArrayList<Integer> B = new ArrayList<Integer>();
       boolean hasSeen = false;
       for (int i = 0; i < A.length; i++) {
           if (A[i] != elem) {
                   B.add(i);
           }
           if (A[i] == elem) {
               hasSeen = true;
           }
       }
       if (!hasSeen) {
           return A.length;
       }
       
       int j = 0;
       ArrayList<Integer> C = new ArrayList<Integer>();
       for (int i = 0; i < A.length; i++) {
           if (j >= B.size()) {
               break;
           }
           if (i == B.get(j)) {
               C.add(A[i]); 
               j++;
           }
       }
       for (int i = 0; i < C.size(); i++) {
           A[i] = C.get(i);
       }

       return C.size();
    }
}
