public class Solution {
    public int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[] flag = new int[A.length];
        for (int i = 0; i < A.length-1; i++) {
            boolean found = false;
            if (flag[i] == 1) {
                   continue;
            }
            for (int j = i+1; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    flag[j] = 1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return A[i];
            }
        }
        return A[A.length-1];
    }
}
