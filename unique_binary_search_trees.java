public class Solution {
    public int numTrees(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int t = 0;
        for ( int i = 1; i <= n; i++) {
            t = t + numTrees(i-1) * numTrees(n-i);
        }
        return t;
    }
}
