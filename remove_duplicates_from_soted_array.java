public class Solution {
    public int removeDuplicates(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            boolean hasSeen = false;
            for (int j = 0; j < B.size(); j++) {
                if (B.get(j) == A[i]) {
                    hasSeen = true;
                    break;
                }
            }
            if (!hasSeen) {
                B.add(A[i]);
            }
        }
        for (int i = 0; i < B.size(); i++) {
            A[i] = B.get(i);
        }
        return B.size();
    }
}
